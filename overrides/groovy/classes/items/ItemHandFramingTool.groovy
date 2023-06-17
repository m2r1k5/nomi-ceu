import com.jaquadro.minecraft.storagedrawers.api.storage.INetworked
import com.jaquadro.minecraft.storagedrawers.block.BlockDrawers
import com.jaquadro.minecraft.storagedrawers.block.BlockCompDrawers
import com.jaquadro.minecraft.storagedrawers.block.BlockController
import com.jaquadro.minecraft.storagedrawers.block.BlockSlave
import com.jaquadro.minecraft.storagedrawers.block.tile.TileEntityDrawers
import com.jaquadro.minecraft.storagedrawers.block.tile.tiledata.MaterialData
import eutros.framedcompactdrawers.block.BlockControllerCustom
import eutros.framedcompactdrawers.block.BlockSlaveCustom
import eutros.framedcompactdrawers.block.tile.TileControllerCustom
import eutros.framedcompactdrawers.block.tile.TileSlaveCustom
import eutros.framedcompactdrawers.registry.ModBlocks as FCDModBlocks
import com.jaquadro.minecraft.storagedrawers.core.ModBlocks as SDModBlocks
import net.minecraft.block.Block
import net.minecraft.block.state.IBlockState
import net.minecraft.block.properties.PropertyDirection
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.init.Blocks
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.util.EnumActionResult
import net.minecraft.util.EnumFacing
import net.minecraft.util.EnumHand
import net.minecraft.util.ResourceLocation
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

public class ItemHandFramingTool extends Item {
    private int stickAmount

    public ItemHandFramingTool(CreativeTabs creativeTab) {
        setMaxStackSize(1)
        setCreativeTab(creativeTab)
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        // This is to return success if we framed it, but not decorated it
        EnumActionResult actionResult = EnumActionResult.PASS

        if (worldIn.isAirBlock(pos))
            return actionResult

        IBlockState state = worldIn.getBlockState(pos)
        Block block = state.getBlock()

        if (!(block instanceof INetworked))
            return actionResult

        // At this point, further returns should be fail
        actionResult = EnumActionResult.FAIL

        ItemStack tool = player.getHeldItem(hand)

        boolean creative = player.capabilities.isCreativeMode

        boolean noTag = false

        if (!tool.hasTagCompound() || tool.getTagCompound() == null){
            if (creative)
                noTag = true
            else
                return actionResult 
        }

        NBTTagCompound tagCompound = tool.getTagCompound()

        // Check if we should make this block a framed one
        if (!isDecorating(Objects.requireNonNull(block.getRegistryName()))){
            if (!creative) {
                if (!tagCompound.hasKey("sticks"))
                    return actionResult

                int stickCount = tagCompound.getInteger("sticks")

                if (stickCount < 8)
                    return actionResult

                tagCompound.setInteger("sticks", stickCount - 8)
            }
            
            // Make it framed
            makeFramedState(worldIn, pos)

            // This should be success, if we framed but not decorated
            actionResult = EnumActionResult.SUCCESS
        }
        
        if (noTag)
            return actionResult

        // Get Decorate Info
        ItemStack matS, matF, matT

        matS = getItemStackFromKey(tagCompound, "MatS")
        if (matS.isEmpty())
            return actionResult

        matT= getItemStackFromKey(tagCompound, "MatT")
        matF = getItemStackFromKey(tagCompound, "MatF")

        // Decorate
        var tile = worldIn.getTileEntity(pos)
        var materialData = tile.material()
        materialData.setSide(matS.copy())
        materialData.setTrim(matT.copy())
        materialData.setFront(matF.copy())

        // Change Hand Framing Tool's nbt
        ItemStack handFramingTool = player.getHeldItem(hand)
        handFramingTool.setTagCompound(tagCompound)

        player.setHeldItem(hand, handFramingTool)

        // Reload Block
        worldIn.markBlockRangeForRenderUpdate(pos, pos)

        return EnumActionResult.SUCCESS
    }

    private boolean isDecorating(ResourceLocation registryName) {
        String registryString = registryName.toString()

        return registryName.getNamespace().equals("framedcompactdrawers")
               || registryString.equals("storagedrawers:customdrawers")
               || registryString.equals("storagedrawers:customtrim")
    }

    private void makeFramedState(World world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos)
        Block block = state.getBlock()
        NBTTagCompound tag = new NBTTagCompound()

        IBlockState newState

        // Special Case for drawers, to transfer items
        if (block instanceof BlockDrawers){
            TileEntityDrawers tile = Objects.requireNonNull((TileEntityDrawers) world.getTileEntity(pos))

            // Get nbt (items stored, locked, etc.) + direction
            tile.writeToPortableNBT(tag)
            int direction = tile.getDirection()

            // Only block that extends BlockDrawers at this point is drawers and framed drawers
            newState = block instanceof BlockCompDrawers ? FCDModBlocks.framedCompactDrawer.getDefaultState() 
                        : SDModBlocks.customDrawers.getStateFromMeta(block.getMetaFromState(state))

            // Set new BlockState
            world.setBlockState(pos, newState)

            // Reload tile, to the new block
            tile = Objects.requireNonNull((TileEntityDrawers) world.getTileEntity(pos))

            // Load back nbt + direction
            tile.readFromPortableNBT(tag)
            tile.setDirection(direction)
            return
        }

        // Only block that and extends INetworked at this point is controllers, slaves, and trims
        Block newBlock = block instanceof BlockController ? FCDModBlocks.framedDrawerController :
                        block instanceof BlockSlave ? FCDModBlocks.framedSlave :
                        SDModBlocks.customTrim

        // Meta for controllers are their direction, so read that (Custom Controller's meta is a bit different to normal controller, so -2 to meta is needed)
        newState = block instanceof BlockController ? newBlock.getStateFromMeta(block.getMetaFromState(state) - 2) : newBlock.getDefaultState()

        world.setBlockState(pos, newState)
        
    }

    private ItemStack getItemStackFromKey(NBTTagCompound tagCompound, String key) {
        if (!tagCompound.hasKey(key))
            return ItemStack.EMPTY

        else {
            return new ItemStack(tagCompound.getCompoundTag(key))
        }
    }
}