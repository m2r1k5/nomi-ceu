import net.minecraft.block.BlockDirectional
import net.minecraft.block.material.Material
import net.minecraft.block.SoundType
import net.minecraft.block.properties.IProperty
import net.minecraft.block.state.BlockStateContainer
import net.minecraft.entity.EntityLivingBase
import net.minecraft.util.Mirror
import net.minecraft.util.Rotation
import net.minecraft.util.math.AxisAlignedBB
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.util.math.BlockPos
import net.minecraft.block.state.IBlockState
import net.minecraft.world.IBlockAccess
import net.minecraft.util.EnumFacing
import net.minecraft.block.state.BlockFaceShape
import net.minecraft.world.World

public class BlockExcitationCoil extends BlockDirectional {
    private static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0 / 16.0, 4.0 / 16.0,
                                                                     4.0 / 16.0, 9.0 / 16.0,
                                                                     12.0 / 16.0, 12.0 / 16.0)

    private static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(7.0 / 16.0, 4.0 / 16.0,
                                                                     4.0 / 16.0, 16.0 / 16.0,
                                                                     12.0 / 16.0, 12.0 / 16.0)

    private static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(4.0 / 16.0, 4.0 / 16.0,
                                                                      0.0 / 16.0, 12.0 / 16.0,
                                                                      12.0 / 16.0, 9.0 / 16.0)

    private static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(4.0 / 16.0, 4.0 / 16.0,
                                                                      7.0 / 16.0, 12.0 / 16.0,
                                                                      12.0 / 16.0, 16.0 / 16.0)

    private static final AxisAlignedBB UP_AABB = new AxisAlignedBB(4.0 / 16.0, 0.0 / 16.0,
                                                                   4.0 / 16.0, 12.0 / 16.0,
                                                                   9.0 / 16.0, 12.0 / 16.0)

    private static final AxisAlignedBB DOWN_AABB = new AxisAlignedBB(4.0 / 16.0, 7.0 / 16.0,
                                                                     4.0 / 16.0, 12.0 / 16.0,
                                                                     16.0 / 16.0, 12.0 / 16.0)

	public BlockExcitationCoil(CreativeTabs tab) {
		super(Material.IRON)
        fullBlock = false
		setSoundType(SoundType.METAL)
		if (tab != null) {
            setCreativeTab(tab)
        }
        setHardness(5.0F)
        setResistance(5.0F)
        setLightLevel(1.0F)
        setHarvestLevel("pickaxe", 2)

        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP))
	}

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate(state.getValue(FACING)))
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withProperty(FACING, mirrorIn.mirror(state.getValue(FACING)))
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        switch (state.getValue(FACING)){
            case EnumFacing.UP:
                return UP_AABB
            case EnumFacing.DOWN:
                return DOWN_AABB
            case EnumFacing.EAST:
                return EAST_AABB
            case EnumFacing.WEST:
                return WEST_AABB
            case EnumFacing.NORTH:
                return NORTH_AABB
            case EnumFacing.SOUTH:
                return SOUTH_AABB
            default:
                return UP_AABB
        }
    }

    @Override
    public boolean isSideSolid(IBlockState baseState, IBlockAccess world, BlockPos pos, EnumFacing side) {
        return false
    }

    @Override
    public boolean isTopSolid(IBlockState state){
        return false
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false
    }

    @Override
    public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
        return false
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        state = this.getActualState(state, worldIn, pos)
        return state.getValue(FACING) == face.getOpposite() ? BlockFaceShape.SOLID : BlockFaceShape.UNDEFINED
    }

    @Override
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face){
        return false
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer))
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState blockState = this.getDefaultState()
        blockState = blockState.withProperty(FACING, EnumFacing.byIndex(meta))
        return blockState
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return (state.getValue(FACING)).getIndex()
    }

    @Override
    public BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING})
    }
}