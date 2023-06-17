import net.minecraft.item.EnumRarity
import net.minecraft.block.material.Material
import net.minecraft.block.SoundType

println("[CustomBlocks.groovy] Start Custom Blocks Registration.")

/* --------------------------------- Custom Blocks ----------------------------------------- */


/* Custom Behaviour Blocks:
Excitation Coil and Dust Block have special behaviours, and are found in /classes/blocks.
All further special behaviour blocks should go there too.*/
content.registerBlock("excitationcoil", new BlockExcitationCoil(content.getDefaultTab()))
content.registerBlock("block_dust", new BlockDust(content.getDefaultTab()))

/* Normal Blocks */
content.createBlock("densemagma").register()
content.createBlock("denseoilshale").register()
content.createBlock("microverse_casing").register()

// Blocks with Rarity. RarityItemBlock class is defined in /classes.
// Make blocks
def powerStorage = NomiUtil.createBaseBlock(Material.IRON, SoundType.METAL)
def generator = NomiUtil.createBaseBlock(Material.IRON, SoundType.METAL)

// Register Blocks
content.registerBlock("ultimate_power_storage", powerStorage, new RarityItemBlock(powerStorage, EnumRarity.EPIC).setMaxStackSize(1))
content.registerBlock("ultimate_generator", generator, new RarityItemBlock(generator, EnumRarity.EPIC).setMaxStackSize(1))

println("[CustomBlocks.groovy] End Custom Blocks Registration.")