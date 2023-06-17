import net.minecraft.item.EnumRarity
import net.minecraft.item.ItemStack
import net.minecraft.init.MobEffects
import net.minecraft.potion.PotionEffect
import net.minecraft.potion.Potion
import net.minecraft.item.Item

import static NomiUtil.createItem

println("[CustomItems.groovy] Start Creative Tab Init.")

/* Define HOAU first for use in creative tab logo */
def HOAU = content.createItem("heartofauniverse").setRarity(EnumRarity.EPIC).setMaxStackSize(1)

/* Define a Default Creative Tab */
def creativeTab = content.createCreativeTab("nomifactory.creative_tab", new ItemStack(HOAU))
content.setDefaultCreativeTab(creativeTab)

println("[CustomItems.groovy] End Creative Tab Init.")

// HOAU is registered later, with the rest of the endgame items

println("[CustomItems.groovy] Start Custom Items Registration.")

/* --------------------------------- Custom Items ----------------------------------------- */

/* Temporary Items (To be removed) */
createItem("blazepowder")
createItem("dark_red_coal")


/* Coins */
createItem("omnicoin")
createItem("omnicoin5", EnumRarity.UNCOMMON)
createItem("omnicoin25", EnumRarity.RARE)
createItem("omnicoin100", EnumRarity.EPIC)

/* Widgets */
createItem("woodenwidget")
createItem("woodwidgetleft")
createItem("woodwidgetright")
createItem("stonewidget")
createItem("stonewidgetup")
createItem("stonewidgetdown")
createItem("alloywidget")
createItem("enderwidget")


/* Space Items */
createItem("radiationlayer")
createItem("pressurelayer")
createItem("cloth")
createItem("thermalcloth")
createItem("unpreparedspacehelmet")
createItem("unpreparedspacechestpiece")
createItem("unpreparedspaceleggings")
createItem("unpreparedspaceboots")


/* Micro Miner Items */
createItem("quantumflux", EnumRarity.EPIC)
createItem("gemsensor", EnumRarity.EPIC)
createItem("warpengine", EnumRarity.EPIC)
createItem("universalnavigator", EnumRarity.EPIC)
createItem("quantumfluxedeterniumplating", EnumRarity.EPIC)
createItem("t1guidance", EnumRarity.UNCOMMON)
createItem("t2guidance", EnumRarity.RARE)
createItem("t1laser", EnumRarity.UNCOMMON)
createItem("t2laser", EnumRarity.RARE)
createItem("t3laser", EnumRarity.EPIC)


/* Micro Miners, Stabilized Micro Miners & Matter */
createItem("tieroneship", EnumRarity.UNCOMMON, 16)
createItem("tiertwoship", EnumRarity.UNCOMMON, 16)
createItem("tierthreeship", EnumRarity.UNCOMMON, 16)
createItem("tierfourship", EnumRarity.UNCOMMON, 16)
createItem("tierfourandhalfship", EnumRarity.UNCOMMON, 16)
createItem("tierfiveship", EnumRarity.RARE, 16)
createItem("tiersixship", EnumRarity.RARE, 16)
createItem("tiersevenship", EnumRarity.RARE, 16)
createItem("tiereightship", EnumRarity.EPIC, 16)
createItem("tiereightandhalfship", EnumRarity.EPIC, 16)
createItem("tiernineship", EnumRarity.EPIC, 16)
createItem("tiertenship", EnumRarity.EPIC, 16)

createItem("tieroneship_stabilized", EnumRarity.EPIC, 1)
createItem("tiertwoship_stabilized", EnumRarity.EPIC, 1)
createItem("tierthreeship_stabilized", EnumRarity.EPIC, 1)
createItem("tierfourship_stabilized", EnumRarity.EPIC, 1)
createItem("tierfourandhalfship_stabilized", EnumRarity.EPIC, 1)
createItem("tierfiveship_stabilized", EnumRarity.EPIC, 1)
createItem("tiersixship_stabilized", EnumRarity.EPIC, 1)
createItem("tiersevenship_stabilized", EnumRarity.EPIC, 1)
createItem("tiereightship_stabilized", EnumRarity.EPIC, 1)

createItem("tieroneship_stabilized_matter", EnumRarity.EPIC)
createItem("tiertwoship_stabilized_matter", EnumRarity.EPIC)
createItem("tierthreeship_stabilized_matter", EnumRarity.EPIC)
createItem("tierfourship_stabilized_matter", EnumRarity.EPIC)
createItem("tierfourandhalfship_stabilized_matter", EnumRarity.EPIC)
createItem("tierfiveship_stabilized_matter", EnumRarity.EPIC)
createItem("tiersixship_stabilized_matter", EnumRarity.EPIC)
createItem("tiersevenship_stabilized_matter", EnumRarity.EPIC)
createItem("tiereightship_stabilized_matter", EnumRarity.EPIC)


/* Data */
createItem("dragonlairdata", EnumRarity.EPIC)
createItem("witherrealmdata", EnumRarity.EPIC)
createItem("impossiblerealmdata", EnumRarity.RARE)
createItem("universecreationdata", EnumRarity.EPIC, 1)
createItem("stellarcreationdata", EnumRarity.RARE)
createItem("lairofthechaosguardiandata", EnumRarity.EPIC, 1)


/* Solidified Items */
createItem("solidifiedargon")
createItem("solidifiedchlorine")
createItem("solidifiedfluorine")
createItem("solidifiedhelium")
createItem("solidifiedhydrogen")
createItem("solidifiedkrypton")
createItem("solidifiedmercury")
createItem("solidifiedneon")
createItem("solidifiednitrogen")
createItem("solidifiedoxygen")
createItem("solidifiedradon")
createItem("solidifiedxenon")


/* Stabilized Items */
createItem("stabilizedeinsteinium")
createItem("stabilizedberkelium")
createItem("stabilizedneptunium")
createItem("stabilizedplutonium")
createItem("stabilizeduranium")
createItem("stabilizedcurium")
createItem("stabilizedcalifornium")
createItem("stabilizedamericium")


/* Endgame Items */
// Register HOAU, in new creative tab
HOAU.setCreativeTab(creativeTab).register()

// Other Endgame Items
createItem("creativeportabletankmold", EnumRarity.EPIC)
createItem("exoticmaterialscatalyst", EnumRarity.RARE)
createItem("eternalcatalyst", EnumRarity.EPIC)
createItem("ultimate_gem", EnumRarity.EPIC, 1)


/* Misc Items */
createItem("grainsofinnocence")

createItem("radiumsalt")
createItem("moondust")

createItem("redstonearmorplate")
createItem("carbonarmorplate")
createItem("lapisarmorplate")

createItem("compressedoctadiccapacitor")
createItem("doublecompressedoctadiccapacitor")

// Core and North are part of the Crafting Nether Star mod.
createItem("netherstarsouth")
createItem("netherstareast")
createItem("netherstarwest")

// Hydrogen is part of Solidified Items section.
createItem("densehydrogen")
createItem("ultradensehydrogen")

createItem("magnetron")

/* Smores */
String [] smores = [
    "eightsmore",
    "sixteensmore",
    "thirtytwosmore",
    "sixtyfoursmore"
]

Potion [] potions = [
    MobEffects.ABSORPTION,
    MobEffects.SPEED,
    MobEffects.HASTE,
    MobEffects.SATURATION,
    MobEffects.HEALTH_BOOST,
    MobEffects.REGENERATION
]

EnumRarity [] rarities = [
    EnumRarity.COMMON,
    EnumRarity.UNCOMMON,
    EnumRarity.RARE,
    EnumRarity.EPIC
]

int heal = 44
float saturation = 8.6F
int potionDuration = 1200
int potionAmplifier = 0
int index = 0

for (String smoreName : smores) {
    heal *= 2
    heal += 4

    saturation *= 2
    saturation++

    potionDuration *= 2

    Item smore = new ItemSmore(heal, saturation, content.getDefaultTab()).setRarity(rarities[index])

    for (Potion potion : potions)
        smore.addPotionEffect(potion, potionDuration, potionAmplifier)

    content.registerItem(smoreName, smore)

    potionAmplifier++
    index++
}

// Hand Framing Tool
content.registerItem("hand_framing_tool", new ItemHandFramingTool())

println("[CustomItems.groovy] End Custom Items Registration.")