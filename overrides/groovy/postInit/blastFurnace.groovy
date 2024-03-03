import com.nomiceu.nomilabs.util.LabsModeHelper

import static gregtech.api.GTValues.*

// Signalum (Adds Redstone Clathrate)
mods.gregtech.alloy_blast_smelter.removeByOutput(null, [fluid('molten.signalum')], null, null)

mods.gregtech.alloy_blast_smelter.recipeBuilder()
        .inputs(metaitem('dustAnnealedCopper') * 4, metaitem('nomilabs:dustArdite') * 2, metaitem('dustRedAlloy') * 2, item('thermalfoundation:material', 893))
        .fluidInputs(fluid('mana') * 1000, fluid('helium') * 400)
        .circuitMeta(14)
        .fluidOutputs(fluid('molten.signalum') * 576)
        .property('temperature', 4000)
        .duration(7680)
        .EUt(VA[IV])
        .buildAndRegister()

mods.gregtech.alloy_blast_smelter.recipeBuilder()
        .inputs(metaitem('dustAnnealedCopper') * 4, metaitem('nomilabs:dustArdite') * 2, metaitem('dustRedAlloy') * 2, item('thermalfoundation:material', 893))
        .fluidInputs(fluid('mana') * 1000)
        .circuitMeta(4)
        .fluidOutputs(fluid('molten.signalum') * 576)
        .property('temperature', 4000)
        .duration(8400)
        .EUt(VA[IV])
        .buildAndRegister()

// Lumium (Adds Energized Clathrate & Luminessence)
mods.gregtech.alloy_blast_smelter.removeByOutput(null, [fluid('molten.lumium')], null, null)

mods.gregtech.alloy_blast_smelter.recipeBuilder()
        .inputs(metaitem('dustTinAlloy') * 4, metaitem('dustSterlingSilver') * 2, item('extendedcrafting:material', 7) * 2, item('thermalfoundation:material', 894))
        .fluidInputs(fluid('mana') * 1000, fluid('helium') * 400)
        .circuitMeta(14)
        .fluidOutputs(fluid('molten.lumium') * 576)
        .property('temperature', 4500)
        .duration(4824)
        .EUt(VA[IV])
        .buildAndRegister()

mods.gregtech.alloy_blast_smelter.recipeBuilder()
        .inputs(metaitem('dustTinAlloy') * 4, metaitem('dustSterlingSilver') * 2, item('extendedcrafting:material', 7) * 2, item('thermalfoundation:material', 894))
        .fluidInputs(fluid('mana') * 1000)
        .circuitMeta(4)
        .fluidOutputs(fluid('molten.lumium') * 576)
        .property('temperature', 4500)
        .duration(7200)
        .EUt(VA[IV])
        .buildAndRegister()

// Enderium (Adds Resonant Clathrate)
mods.gregtech.alloy_blast_smelter.removeByOutput(null, [fluid('molten.enderium')], null, null)

mods.gregtech.alloy_blast_smelter.recipeBuilder()
        .inputs(metaitem('dustLead') * 4, metaitem('dustPlatinum') * 2, metaitem('dustBlueSteel'), metaitem('dustOsmium'), item('thermalfoundation:material', 895))
        .fluidInputs(fluid('mana') * 1000, fluid('krypton') * 40)
        .circuitMeta(15)
        .fluidOutputs(fluid('molten.enderium') * 576)
        .property('temperature', 6400)
        .duration(4824)
        .EUt(VA[LuV])
        .buildAndRegister()

mods.gregtech.alloy_blast_smelter.recipeBuilder()
        .inputs(metaitem('dustLead') * 4, metaitem('dustPlatinum') * 2, metaitem('dustBlueSteel'), metaitem('dustOsmium'), item('thermalfoundation:material', 895))
        .fluidInputs(fluid('mana') * 1000)
        .circuitMeta(5)
        .fluidOutputs(fluid('molten.enderium') * 576)
        .property('temperature', 6400)
        .duration(7200)
        .EUt(VA[LuV])
        .buildAndRegister()

// Fluxed Electrum (Adds Mana Dust)
// There is only one ABS recipe, fluxed electrum has no gas boost
// TODO Add a gas boost?
mods.gregtech.alloy_blast_smelter.removeByOutput(null, [fluid('electrum_flux')], null, null)

mods.gregtech.alloy_blast_smelter.recipeBuilder()
        .inputs([metaitem('dustElectrum') * 6, metaitem('nomilabs:dustLumium'), metaitem('nomilabs:dustSignalum'), ore('dustMana')])
        .fluidOutputs(fluid('electrum_flux') * 1296)
        .circuitMeta(4)
        .property('temperature', 1100)
        .duration(8712)
        .EUt(120)
        .buildAndRegister()

if (LabsModeHelper.normal) {
    mods.gregtech.alloy_blast_smelter.removeByOutput(null, [fluid('red_alloy')], null, null)

    mods.gregtech.alloy_blast_smelter.recipeBuilder()
            .inputs(ore('dustCopper') * 2, item('minecraft:redstone') * 3)
            .circuitMeta(2)
            .property('temperature', 1400)
            .fluidOutputs(fluid('red_alloy') * 288)
            .duration(75)
            .EUt(VH[LV])
            .buildAndRegister()

    // Red Alloy has DISABLE DECOMPOSITION flag, so we need to replace it ourselves
    mods.gregtech.centrifuge.removeByInput([metaitem('dustRedAlloy')], null)

    mods.gregtech.centrifuge.recipeBuilder()
            .inputs(metaitem('dustRedAlloy') * 2)
            .outputs(item('minecraft:redstone') * 3, metaitem('dustCopper') * 2)
            .duration(45)
            .EUt(VA[LV])
            .buildAndRegister()
}
