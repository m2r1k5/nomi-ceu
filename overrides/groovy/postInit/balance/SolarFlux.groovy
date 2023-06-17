
println("[SolarFlux.groovy] Start SolarFlux Changes")

// Hide stuff first
crafting.remove("solarflux:mirror")
crafting.remove("solarflux:photovoltaic_cell_1")
crafting.remove("solarflux:solar_panel_1")
crafting.remove("solarflux:solar_panel_2")
crafting.remove("solarflux:solar_panel_3")
crafting.remove("solarflux:solar_panel_4")
crafting.remove("solarflux:solar_panel_5")
crafting.remove("solarflux:solar_panel_6")
crafting.remove("solarflux:solar_panel_7")
crafting.remove("solarflux:solar_panel_8")
crafting.remove("solarflux:solar_panel_wyvern")
crafting.remove("solarflux:solar_panel_draconic")
crafting.remove("solarflux:photovoltaic_cell_6")
crafting.remove("solarflux:photovoltaic_cell_5")
crafting.remove("solarflux:photovoltaic_cell_4")
crafting.remove("solarflux:photovoltaic_cell_3")
crafting.remove("solarflux:photovoltaic_cell_2")
mods.jei.removeAndHide(item('solarflux:blank_upgrade'))
mods.jei.removeAndHide(item('solarflux:efficiency_upgrade'))
mods.jei.removeAndHide(item('solarflux:transfer_rate_upgrade'))
mods.jei.removeAndHide(item('solarflux:capacity_upgrade'))
mods.jei.removeAndHide(item('solarflux:block_charging_upgrade'))
mods.jei.removeAndHide(item('solarflux:traversal_upgrade'))
mods.jei.removeAndHide(item('solarflux:dispersive_upgrade'))
mods.jei.removeAndHide(item('solarflux:furnace_upgrade'))

// pre-optimizations, this might be useless but i am assuming we are doing "get from list" request every time item() runs
def solarMirror = item("solarflux:mirror")

// TODO some ore() are broke, old stuff is using metaitem before
// "Cell" 0
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_mirror')
    .output(solarMirror)
    .matrix('GGG',
            'PPP')
	// should this be paneglass?
    .key('G', item('minecraft:glass_pane'))
    .key('P', ore('plateSilver'))
    .register()

// Cell 1
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_photovoltaic_cell_1')
    .output(item("solarflux:photovoltaic_cell_1") * 6)
    .matrix('LLL',
            'MMM',
			'FFF')
    .key('L', ore('plateLapis'))
    .key('M', solarMirror)
    .key('F', ore('plateFluix'))
    .register()

// Cell 2
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_photovoltaic_cell_2')
    .output(item("solarflux:photovoltaic_cell_2") * 6)
    .matrix('PPP',
            'CCC',
			'BBB')
    .key('P', item('enderio:item_material:3')) // photovoltaic plates
    .key('C', item('solarflux:photovoltaic_cell_1'))
    .key('B', ore('plateBatteryAlloy'))
    .register()

// Cell 3
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_photovoltaic_cell_3')
    .output(item("solarflux:photovoltaic_cell_3") * 6)
    .matrix('PPP',
            'CCC',
			'BBB')
    .key('P', metaitem('lensEnderPearl'))
    .key('C', item('solarflux:photovoltaic_cell_2'))
    .key('B', ore('plateAnnealedCopper'))
    .register()

// Cell 4
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_photovoltaic_cell_4')
    .output(item("solarflux:photovoltaic_cell_4") * 6)
    .matrix('PPP',
            'CCC',
			'BBB')
    .key('P', ore('craftingLensLightBlue'))
    .key('C', item('solarflux:photovoltaic_cell_3'))
    .key('B', ore('meshPulsating'))
    .register()

// Cell 5
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_photovoltaic_cell_5')
    .output(item("solarflux:photovoltaic_cell_5"))
    .matrix('SSS',
            'CCC',
			'SSS')
    .key('S', item('advsolars:sunnarium_plate'))
    .key('C', item('solarflux:photovoltaic_cell_4'))
    .register()

// Cell 6
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_photovoltaic_cell_6')
    .output(item("solarflux:photovoltaic_cell_6") * 6)
    .matrix('SSS',
            'CCC',
			'SSS')
    .key('S', item('advsolars:sunnarium_enriched_plate'))
    .key('C', item('solarflux:photovoltaic_cell_5'))
    .register()

// Solar 1
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_solar_panel_1')
    .output(item('solarflux:solar_panel_1'))
    .matrix('MMM',
            'CCC',
			'SPS')
    .key('M', solarMirror)
    .key('C', metaitem('wireFineCopper'))
    .key('S', ore('slabStone'))
    .key('P', item('enderio:item_power_conduit'))
    .register()

// Solar 2
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_solar_panel_2')
    .output(item("solarflux:solar_panel_2"))
    .matrix('PPP',
            'TTT',
			'CWC')
    .key('P', item('solarflux:solar_panel_1'))
    .key('T', metaitem('cableGtSingleTin'))
    .key('C', metaitem('plateCupronickel'))
    .key('W', item('enderio:item_power_conduit:1'))
    .register()

// Solar 3
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_solar_panel_3')
    .output(item("solarflux:solar_panel_3"))
    .matrix('PCP',
            'EBE',
			'GWG')
    .key('P', item("solarflux:solar_panel_2"))
    .key('C', item("solarflux:photovoltaic_cell_1"))
    .key('E', metaitem("plateElectricalSteel"))
    .key('B', metaitem("blockConductiveIron"))
    .key('G', metaitem("gearElectricalSteel"))
    .key('W', item('enderio:item_power_conduit:2'))
    .register()

// Solar 4
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_solar_panel_4')
    .output(item("solarflux:solar_panel_4") * 2)
    .matrix('SPS',
            'MEM',
			'MWM')
    .key('S', item("solarflux:solar_panel_3"))
    .key('P', item("solarflux:photovoltaic_cell_2"))
    .key('M', ore("ingotMicroversium"))
    .key('E', metaitem("blockEndSteel"))
    .key('W', item('enderio:item_endergy_conduit:1'))
    .register()

// Solar 5
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_solar_panel_5')
    .output(item("solarflux:solar_panel_5") * 4)
    .matrix('SPS',
            'LNL',
			'LWL')
    .key('S', item("solarflux:solar_panel_4"))
    .key('P', item("solarflux:photovoltaic_cell_3"))
    .key('L', metaitem("plateLumium"))
    .key('N', item('advsolars:sunnarium'))
    .key('W', item('enderio:item_endergy_conduit:6'))
    .register()

// Solar 6
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_solar_panel_6')
    .output(item("solarflux:solar_panel_6") * 4)
    .matrix('SPS',
            'LNL',
			'LWL')
    .key('S', item("solarflux:solar_panel_5"))
    .key('P', item("solarflux:photovoltaic_cell_4"))
    .key('L', metaitem("plateSignalum"))
    .key('N', item('advsolars:sunnarium_enriched'))
    .key('W', item('enderio:item_endergy_conduit:4'))
    .register()

// Solar 7
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_solar_panel_7')
    .output(item("solarflux:solar_panel_7") * 4)
    .matrix('PPP',
            'SsS',
			'OWO')
    .key('P', item("solarflux:photovoltaic_cell_5") * 6)
    .key('S', item("solarflux:solar_panel_6"))
    .key('s', ore("blockSignalum"))
    .key('O', metaitem("plateOsmium"))
    .key('W', item('enderio:item_endergy_conduit:4'))
    .register()

// Solar 8
crafting.shapedBuilder()
    .name('contenttweaker:solarflux_solar_panel_8')
    .output(item("solarflux:solar_panel_8") * 4)
    .matrix('PPP',
            'SES',
			'OWO')
    .key('P', item("solarflux:photovoltaic_cell_6"))
    .key('S', item("solarflux:solar_panel_7"))
    .key('E', ore("blockEnderium"))
    .key('O', metaitem("plateOsmiridium"))
    .key('W', item('enderio:item_endergy_conduit'))
    .register()

// Sunnarium
mods.gregtech.alloy_smelter.recipeBuilder()
	.inputs(item('contenttweaker:stabilizedplutonium'), item('contenttweaker:stabilizedcurium'))
	.outputs(item('advsolars:sunnarium'))
	.duration(2000)
	.EUt(4000)
	.buildAndRegister()

// Conversion recipes from RF Solars to GT Solars
crafting.remove("gregtech:solar_panel_basic");
crafting.remove("gregtech:solar_panel_ulv");
crafting.remove("gregtech:solar_panel_lv");

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_basic")
	.output(metaitem('cover.solar.panel') * 2)
	.input(item('solarflux:solar_panel_2'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_ulv")
	.output(metaitem('cover.solar.panel.ulv'))
	.input(item('solarflux:solar_panel_3'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_lv")
	.output(metaitem('cover.solar.panel.lv'))
	.input(item('solarflux:solar_panel_4'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_mv")
	.output(metaitem('cover.solar.panel.mv'))
	.input(item('solarflux:solar_panel_5'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_hv")
	.output(metaitem('cover.solar.panel.hv'))
	.input(item('solarflux:solar_panel_6'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_ev")
	.output(metaitem('cover.solar.panel.ev'))
	.input(item('solarflux:solar_panel_7'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_iv")
	.output(metaitem('cover.solar.panel.iv'))
	.input(item('solarflux:solar_panel_8'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_iv_2")
	.output(metaitem('cover.solar.panel.iv') * 2)
	.input(item('solarflux:solar_panel_wyvern'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_luv")
	.output(metaitem('cover.solar.panel.luv') * 2)
	.input(item('solarflux:solar_panel_draconic'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_zpm")
	.output(metaitem('cover.solar.panel.zpm'))
	.input(item('solarflux:solar_panel_chaotic'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_uv")
	.output(metaitem('cover.solar.panel.uv') * 4)
	.input(item('solarflux:solar_panel_neutronium'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:solar_panel_uv_2")
	.output(metaitem('cover.solar.panel.uv') * 8)
	.input(item('solarflux:solar_panel_infinity'))
	.register()

println("[SolarFlux.groovy] End SolarFlux Changes")
