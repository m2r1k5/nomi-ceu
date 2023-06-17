// this is not in balance as i do not think this changes any existing recipies,
// and it only changes recipies that you have to 'build yourself'
println("[Misc.groovy] Start GT - Misc Changes")

/**
 * Infinity Material
 * Use avartia's ingots & moreplates's plates
 * but still keep it as a gt material
 */

// Infinity conversion
crafting.shapelessBuilder()
	.name("contenttweaker:infinity_ingot")
	.output(item('avaritia:resource:6'))
	.input(metaitem('ingotInfinity'))
	.register()
crafting.shapelessBuilder()
	.name("contenttweaker:infinity_plate")
	.output(item('moreplates:infinity_plate'))
	.input(metaitem('ingotInfinity'))
	.register()

mods.jei.removeAndHide(metaitem('ingotInfinity'))
mods.jei.removeAndHide(metaitem('plateInfinity'))
mods.jei.removeAndHide(metaitem('plateDoubleInfinity'))
mods.jei.removeAndHide(metaitem('blockInfinity'))
mods.jei.removeAndHide(metaitem('nuggetInfinity'))
mods.jei.removeAndHide(metaitem('dustInfinity'))
mods.jei.removeAndHide(metaitem('dustSmallInfinity'))
mods.jei.removeAndHide(metaitem('dustTinyInfinity'))

// Infinity Plate * 1
mods.gregtech.bender.removeByInput(24, [metaitem('ingotInfinity'), metaitem('circuit.integrated').withNbt(["Configuration": 1])], null)
// Double Infinity Plate * 1
mods.gregtech.bender.removeByInput(96, [metaitem('ingotInfinity') * 2, metaitem('circuit.integrated').withNbt(["Configuration": 2])], null)

mods.gregtech.bender.recipeBuilder()
	.inputs(item('avaritia:resource:6'))
	.circuitMeta(1)
	.outputs(item('moreplates:infinity_plate'))
	.duration(5000)
	.EUt(24)
	.buildAndRegister()

mods.gregtech.arc_furnace.recipeBuilder()
	.inputs(item('moreplates:infinity_plate'))
	.fluidInputs(fluid('oxygen') * 5000)
	.outputs(item('avaritia:resource:6'))
	.duration(5000)
	.EUt(30)
	.buildAndRegister()


//GTCE Marble
/*
TODO Implement
mods.chisel.Carving.addVariation("marble", item('gregtech:stone_smooth:2'))

//GTCE Basalt
mods.chisel.Carving.addVariation("basalt", item('gregtech:stone_smooth:3'))
*/

//Setting Item Max Stacksize
item('minecraft:snowball').Item.setMaxStackSize(64)
item('minecraft:ender_pearl').Item.setMaxStackSize(64)

// Omnium
crafting.remove("gregtech:block_compress_omnium")
/*
TODO fixme
wiremill.recipeBuilder().inputs(<extendedcrafting:material:32>).outputs(<metaitem:wireGtSingleOmnium> * 2).duration(364).EUt(7).buildAndRegister();
fluidextractor.recipeBuilder().inputs(<extendedcrafting:material:33>).fluidOutputs([<liquid:omnium> * 16]).duration(25).EUt(30).buildAndRegister();
fluidextractor.recipeBuilder().inputs(<extendedcrafting:material:32>).fluidOutputs([<liquid:omnium> * 144]).duration(200).EUt(30).buildAndRegister();
fluidextractor.recipeBuilder().inputs(<extendedcrafting:storage:4>).fluidOutputs([<liquid:omnium> * 1296]).duration(1800).EUt(30).buildAndRegister();
solidifier.findRecipe(7, [<metaitem:shape.mold.nugget>], [<liquid:omnium> * 144]).remove();
solidifier.findRecipe(7, [<metaitem:shape.mold.ingot>], [<liquid:omnium> * 144]).remove();
solidifier.findRecipe(7, [<metaitem:shape.mold.block>], [<liquid:omnium> * 1296]).remove();
solidifier.recipeBuilder().fluidInputs(<liquid:omnium> * 144).notConsumable(<metaitem:shape.mold.nugget>).outputs([<extendedcrafting:material:33> * 9]).duration(200).EUt(30).buildAndRegister();
solidifier.recipeBuilder().fluidInputs(<liquid:omnium> * 144).notConsumable(<metaitem:shape.mold.ingot>).outputs([<extendedcrafting:material:32>]).duration(200).EUt(30).buildAndRegister();
solidifier.recipeBuilder().fluidInputs(<liquid:omnium> * 1296).notConsumable(<metaitem:shape.mold.block>).outputs([<extendedcrafting:storage:4>]).duration(200).EUt(30).buildAndRegister();
solidifier.recipeBuilder().fluidInputs(<liquid:omnium> * 16).notConsumable(<metaitem:shape.mold.ball>).outputs([<extendedcrafting:singularity_ultimate>]).duration(200).EUt(30).buildAndRegister();
furnace.remove(<metaitem:ingotOmnium>);
furnace.addRecipe(<extendedcrafting:material:32>, <metaitem:dustOmnium>, 0.0);
recipes.addShapeless(<extendedcrafting:material:32>, [<metaitem:ingotOmnium>]);
*/

// Redstone Alloy
crafting.addShapeless(metaitem('ingotRedAlloy'), [item('enderio:item_alloy_ingot:3')])

//sulfur from thermal to gt sulfur
crafting.addShapeless(metaitem('dustSulfur'), [item('thermalfoundation:material:771')])

//Thermal Coal Coke Decomposition
crafting.addShapeless(metaitem('gemCoke') * 9, [item('thermalfoundation:storage_resource:1')])

// Temporary recipe to convert endstone dusts
//crafting.addShapeless(ore('dustEndstone').firstItem, [item('contenttweaker:endstonedust')])
//item('contenttweaker:endstonedust').addTooltip(format.red("This item is obsolete and will be removed in the next update."))
//item('contenttweaker:endstonedust').addTooltip(format.red("Please use the GregTech variant of Endstone Dust."))

// Temporary recipe to convert pulsating iron wire that is probably unnecessary anyway.
//crafting.addShapeless(ore('wireGtSinglePulsatingIron').firstItem, [item('contenttweaker:pulsatingwire')])
//item('contenttweaker:pulsatingwire').addTooltip(format.red("This item is obsolete and will be removed in the next update."))
//item('contenttweaker:pulsatingwire').addTooltip(format.red("Please use the GregTech variant of Pulsating Iron Wire."))

//neutronium plate exchange
//crafting.addShapeless("of_exchange_neutronium_plate",
//    item('moreplates:neutronium_plate'),
//    [metaitem('plateNeutronium')])

// TODO move me on ThermalExpansion.groovy @ balance folder

// Hardened Glass
mods.gregtech.alloy_smelter.recipeBuilder()
	.inputs(ore("dustLead"), ore("dustObsidian") * 4)
	.outputs(item("thermalfoundation:glass:3"))
	.duration(100)
	.EUt(30)
	.buildAndRegister()
