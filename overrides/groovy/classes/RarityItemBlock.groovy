import net.minecraft.block.Block
import net.minecraft.item.ItemBlock
import net.minecraft.item.ItemStack
import net.minecraftforge.common.IRarity

public class RarityItemBlock extends ItemBlock {
    private IRarity rarity = null

    public RarityItemBlock(Block block, IRarity rarity) {
        super(block)
        this.rarity = rarity
    }
    
    @Override
    public IRarity getForgeRarity(ItemStack stack) {
        return this.rarity == null ? super.getForgeRarity(stack) : this.rarity
    }
}