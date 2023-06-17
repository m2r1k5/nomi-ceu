println("[AdvRocketry.groovy] Start AdvancedRocketry Changes")

crafting.removeByOutput(item("libvulpes:structuremachine"))
crafting.shapedBuilder()
    .name('contenttweaker:libvulpes_structure_machine')
    .output(item('libvulpes:structuremachine'))
    .matrix(' P ',
            'PMP',
			' P ')
    .key('P', ore('plateStainlessSteel'))
    .key('M', item('extrautils2:machine')) // Extra Utils 2 Machine Block
    .register()

crafting.removeByOutput(item('libvulpes:hatch'))
crafting.removeByOutput(item('libvulpes:hatch:1'))
crafting.removeByOutput(item('libvulpes:hatch:2'))
crafting.removeByOutput(item('libvulpes:hatch:3'))
crafting.removeByOutput(item('libvulpes:forgepowerinput'))
crafting.removeByOutput(item('advancedrocketry:loader:2'))
crafting.removeByOutput(item('advancedrocketry:loader:3'))
crafting.removeByOutput(item('advancedrocketry:loader:4'))
crafting.removeByOutput(item('advancedrocketry:loader:5'))

crafting.shapelessBuilder()
	.name("contenttweaker:libvulpes_hatch")
	.output(item('libvulpes:hatch'))
	.input(item('libvulpes:structuremachine'))
	.input(metaitem('item_bus.import.mv'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:libvulpes_hatch_1")
	.output(item('libvulpes:hatch:1'))
	.input(item('libvulpes:structuremachine'))
	.input(metaitem('item_bus.export.mv'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:libvulpes_hatch_2")
	.output(item('libvulpes:hatch:2'))
	.input(item('libvulpes:structuremachine'))
	.input(metaitem('fluid_hatch.import.mv'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:libvulpes_hatch_3")
	.output(item('libvulpes:hatch:3'))
	.input(item('libvulpes:structuremachine'))
	.input(metaitem('fluid_hatch.export.mv'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:libvulpes_forgepowerinput")
	.output(item('libvulpes:forgepowerinput'))
	.input(item('libvulpes:structuremachine'))
	.input(metaitem('energy_hatch.input.mv'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:ar_loader_2")
	.output(item('advancedrocketry:loader:2'))
	.input(item('libvulpes:hatch:1'))
	.input(metaitem('electric.piston.hv'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:ar_loader_3")
	.output(item('advancedrocketry:loader:3'))
	.input(item('libvulpes:hatch:0'))
	.input(metaitem('electric.piston.hv'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:ar_loader_4")
	.output(item('advancedrocketry:loader:4'))
	.input(item('libvulpes:hatch:3'))
	.input(metaitem('electric.pump.hv'))
	.register()

crafting.shapelessBuilder()
	.name("contenttweaker:ar_loader_5")
	.output(item('advancedrocketry:loader:5'))
	.input(item('libvulpes:hatch:2'))
	.input(metaitem('electric.pump.hv'))
	.register()

// Liquid Fueled Engine
crafting.removeByOutput(item('advancedrocketry:rocketmotor'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_liquid_engine')
    .output(item('advancedrocketry:rocketmotor'))
    .matrix(' P ',
            'PPP',
			'TTT')
    .key('P', ore('plateDoubleSteel')) // Heavy Steel Plating
    .key('T', item('simplyjetpacks:metaitemmods:7')) // Electrical Steel Thruster
    .register()

// Seat
crafting.removeByOutput(item('advancedrocketry:seat'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_seat')
    .output(item('advancedrocketry:seat'))
    .matrix('WWW',
            'PPP')
    .key('P', ore('plateStainlessSteel'))
    .key('W', item('minecraft:wool'))
    .register()

// Structure Tower
crafting.removeByOutput(item('advancedrocketry:structuretower'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_structuretower')
    .output(item('advancedrocketry:structuretower') * 3)
    .matrix('P  ',
            'P  ',
			'P  ')
    .key('P', ore('frameGtStainlessSteel'))
    .register()

/**
 *	Pressure Tanks
 */
def arTanks = [
	'advancedrocketry:pressuretank':   'hardenedtankIng',
	'advancedrocketry:pressuretank:1': 'reinforcedtankIng',
	'advancedrocketry:pressuretank:2': 'signalumtankIng',
	'advancedrocketry:pressuretank:3': 'resonanttankIng'
]
def arTanksIter = 0
for (def dict : arTanks) {
	def pressureTank = dict.key
	def thermalTank = dict.value

	crafting.removeByOutput(item(pressureTank))
	crafting.shapedBuilder()
		.name('contenttweaker:ar_pressure_tank_' + arTanksIter)
		.output(item(pressureTank))
		.matrix(' M ',
				'PTP',
				' P ')
		.key('M', ore('pipeNormalFluidStainlessSteel'))
		.key('P', ore('plateStainlessSteel'))
		.key('T', ore(thermalTank))
		.register()
	arTanksIter = arTanksIter + 1
}

// Suit Workstation
crafting.removeByOutput(item('advancedrocketry:suitworkstation'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_suit_workstation')
    .output(item('advancedrocketry:suitworkstation'))
    .matrix('RTR',
            'CXC',
			'WWW')
    .key('T', metaitem('workbench'))
    .key('R', metaitem('robot.arm.mv'))
    .key('C', ore('circuitMv'))
    .key('X', metaitem('hull.mv'))
    .key('W', metaitem('workbench'))
    .register()

// Gas Charger
crafting.removeByOutput(item('advancedrocketry:oxygencharger'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_oxygen_charger')
    .output(item('advancedrocketry:oxygencharger'))
    .matrix('SPS',
			'ETE')
    .key('S', ore('plateDoubleSteel'))
    .key('P', ore('pipeNormalFluidStainlessSteel'))
    .key('E', ore('circuitMv'))
    .key('T', ore('hardenedtank')) // Hardened Portable Tank
    .register()

// Cloth (Components for advrocketry)
crafting.shapedBuilder() // wait why is this shaped?
    .name('contenttweaker:ctt_cloth')
    .output(item('contenttweaker:cloth') * 4)
    .matrix('SSS',
			'SSS',
			'SSS')
    .key('S', item('minecraft:string')) // Ssssssssstring 🐍
    .register()

crafting.shapedBuilder()
    .name('contenttweaker:ctt_thermal_cloth')
    .output(item('contenttweaker:thermalcloth') * 3)
    .matrix('RRR',
			'CCC',
			'RRR')
    .key('R', item('minecraft:redstone'))
    .key('C', item('contenttweaker:cloth'))
    .register()

/**
 * Unprepared Space Suit
 */

crafting.shapedBuilder()
    .name('contenttweaker:ctt_unprepared_space_helmet')
    .output(item('contenttweaker:unpreparedspacehelmet'))
    .matrix('TTT',
			'T T')
    .key('T', item("contenttweaker:thermalcloth"))
	.mirrored()
    .register()

crafting.shapedBuilder()
    .name('contenttweaker:ctt_unprepared_space_chestpiece')
    .output(item('contenttweaker:unpreparedspacechestpiece'))
    .matrix('T T',
			'TTT',
			'TTT')
    .key('T', item("contenttweaker:thermalcloth"))
    .register()

crafting.shapedBuilder()
    .name('contenttweaker:ctt_unprepared_space_leggins')
    .output(item('contenttweaker:unpreparedspaceleggings'))
    .matrix('TTT',
			'T T',
			'T T')
    .key('T', item("contenttweaker:thermalcloth"))
    .register()

crafting.shapedBuilder()
    .name('contenttweaker:ctt_unprepared_space_boots')
    .output(item('contenttweaker:unpreparedspaceboots'))
    .matrix('T T',
			'T T')
    .key('T', item("contenttweaker:thermalcloth"))
	.mirrored()
    .register()

/**
 * Space Suit
 */

crafting.removeByOutput(item('advancedrocketry:spacehelmet'))
crafting.removeByOutput(item('advancedrocketry:spacechestplate'))
crafting.removeByOutput(item('advancedrocketry:spaceboots'))
crafting.removeByOutput(item('advancedrocketry:spaceleggings'))

// Pressure Layer
crafting.shapedBuilder()
    .name('contenttweaker:ctt_pressure_layer')
    .output(item('contenttweaker:pressurelayer'))
    .matrix('CPC',
			'CPC',
			'CPC')
    .key('C', item("contenttweaker:cloth"))
    .key('P', ore("plateBlackSteel"))
    .register()

// Anti RAd Layer
crafting.shapedBuilder()
    .name('contenttweaker:ctt_pressure_layer')
    .output(item('contenttweaker:radiationlayer'))
    .matrix('CPC',
			'CPC',
			'CPC')
    .key('C', item("contenttweaker:cloth"))
    .key('P', ore("plateLead"))
    .register()


// Space Helmet
mods.gregtech.assembler.recipeBuilder()
	.inputs([
		item('unpreparedspacehelmet'),
		item('pressurelayer') * 2,
		item('radiationlayer') * 2,
		item("minecraft:glass_pane"),
		ore('circuitHv')
	])
	.outputs([item('advancedrocketry:spacehelmet')])
	.duration(500)
	.EUt(30)
	.buildAndRegister()

// Space Chestplate
mods.gregtech.assembler.recipeBuilder()
	.inputs([
		item('unpreparedspacechestpiece'),
		item('pressurelayer') * 4,
		item('radiationlayer') * 4
	])
	.outputs([item('advancedrocketry:spacechestplate')])
	.duration(800)
	.EUt(30)
	.buildAndRegister()

// Space Leggins
mods.gregtech.assembler.recipeBuilder()
	.inputs([
		item('unpreparedspaceleggings'),
		item('pressurelayer') * 3,
		item('radiationlayer') * 3
	])
	.outputs([item('advancedrocketry:spaceleggings')])
	.duration(600)
	.EUt(30)
	.buildAndRegister()

// Space boots
mods.gregtech.assembler.recipeBuilder()
	.inputs([
		item('unpreparedspaceboots'),
		item('pressurelayer'),
		item('radiationlayer')
	])
	.outputs([item('advancedrocketry:spaceboots')])
	.duration(400)
	.EUt(30)
	.buildAndRegister()

/* ---- */

// Liquid Fuel Tank
crafting.removeByOutput(item('advancedrocketry:fueltank'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_fuel_tank')
    .output(item('advancedrocketry:fueltank'))
    .matrix('PTP',
			'PTP',
			'PTP')
    .key('P', ore("plateStainlessSteel"))
    .key('T', item("thermalexpansion:tank"))
    .register()

// Concrete
//mixer.recipeBuilder()
//	.inputs([
//		<minecraft:gravel> * 3,
//		<ore:dustClay>
//	])
//	.fluidInputs([<liquid:water> * 500])
//	.fluidOutputs(<liquid:concrete> * 1000)
//	.EUt(16)
//	.duration(200)
//	.buildAndRegister();

// TODO impelment these extreme recipies
// Guidance Computer
crafting.removeByOutput(item('advancedrocketry:guidancecomputer'))
// makeExtremeRecipe5(<advancedrocketry:guidancecomputer>,
// 	[
// 		"GPPPG",
// 		"PSMEP",
// 		"PCXCP",
// 		"PECSP",
// 		"GPPPG",
// 	], {
// 		G: <appliedenergistics2:quartz_vibrant_glass>, // Vibrant Quartz Glass
// 		P: <ore:plateDoubleSteel>, // Steel Heavy Plating
// 		X: <libvulpes:structuremachine>,  // Machine Structure
// 		S: <metaitem:sensor.hv>,  // HV Sensor
// 		E: <metaitem:emitter.hv>, // HV Emitter
// 		C: <ore:circuitHv>, // T3 Circuit
// 		M: <metaitem:cover.screen>,  // GT Computer Screen
// 	});

// Rocket Assembling Machine
crafting.removeByOutput(item('advancedrocketry:rocketbuilder'))
// makeExtremeRecipe5(<advancedrocketry:rocketbuilder>,
// 	[
// 		"RPEPR",
// 		"PXMXP",
// 		"PCACP",
// 		"PXCXP",
// 		"RPEPR",
// 	], {
// 		P: <ore:plateDoubleSteel>, // Steel Heavy Plating
// 		R: <metaitem:robot.arm.mv>,       // MV Robot Arm
// 		X: <libvulpes:structuremachine>,  // Machine Structure
// 		A: <meta_tile_entity:assembler.mv>, // MV Assembling Machine
// 		E: <metaitem:emitter.mv>,  // MV Emitter
// 		M: <metaitem:cover.screen>,   //  GT Computer Screen
// 		C: <ore:circuitMv>,      // T2 Circuit
// 	});

// Planet ID Chip
crafting.removeByOutput(item('advancedrocketry:planetidchip'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_planet_id_chip')
    .output(item('advancedrocketry:planetidchip'))
    .matrix('WPW',
			'WCW',
			'WPW')
    .key('W', ore("wireFineStainlessSteel"))
    .key('P', ore("plateVibrantAlloy"))
    .key('C', ore("circuitMv"))
    .register()

// Soul Powder
//mods.gregtech.macerator.recipeBuilder()
//	.inputs([<enderio:item_alloy_ingot:7>])
//	.outputs([<enderio:item_material:74>])
//	.duration(200).EUt(30)
//	.buildAndRegister();

// Saltpeter
mods.gregtech.macerator.recipeBuilder()
	.inputs([ore("sandstone") * 4])
	.outputs([ore("dustSaltpeter").firstItem])
	.duration(300)
	.EUt(30)
	.buildAndRegister();

// Certus Quartz Dust
mods.gregtech.macerator.recipeBuilder()
	.inputs([item("appliedenergistics2:material")])
	.outputs([ore("dustCertusQuartz").firstItem])
	.duration(20)
	.EUt(16)
	.buildAndRegister();

// Draconium 🐉
mods.gregtech.macerator.recipeBuilder()
	.inputs([item("draconicevolution:draconium_ore:2")])
	.outputs([item("draconicevolution:draconium_dust") * 3])
	.duration(40)
	.EUt(500)
	.buildAndRegister();

// Launch Pad
crafting.removeByOutput(item('advancedrocketry:launchpad'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_launchpad')
    .output(item('advancedrocketry:launchpad'))
    .matrix('CCC',
			'CCC',
			'CCC')
    .key('C', ore("dustConcrete"))
    .register()

//Linker
crafting.removeByOutput(item('libvulpes:linker'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_linker')
    .output(item('libvulpes:linker'))
    .matrix(' E ',
			'SCS',
			'SSS')
    .key('S', ore("plateStainlessSteel"))
    .key('E', metaitem("emitter.hv"))
    .key('C', ore("dustCcircuitHvoncrete"))
    .register()

// Plant Fibers
crafting.addShapeless(item('minecraft:string') * 3, [item('hooked:microcrafting'), item('hooked:microcrafting')])

// Fueling Station
crafting.removeByOutput(item('advancedrocketry:fuelingstation'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_fueling_station')
    .output(item('advancedrocketry:fuelingstation'))
    .matrix('PMP',
			'PXP',
			'SSS')
    .key('S', ore("plateDoubleSteel"))
    .key('X', item("libvulpes:structuremachine"))
    .key('P', metaitem("electric.pump.hv"))
    .key('M', ore("pipeNormalFluidStainlessSteel"))
    .register()

// why not uses the translation instead?
item("advancedrocketry:fuelingstation").displayName = "Fueling Station";

// Dilithium Dust
mods.gregtech.macerator.recipeBuilder()
	.inputs([item('libvulpes:ore0')])
	.outputs([item('ore:dustDilithium').firstItem * 2])
	.duration(200)
	.EUt(420)
	.buildAndRegister()

// Dilithium Crystal
mods.gregtech.autoclave.recipeBuilder()
	.inputs([item('dustDilithium') * 4])
	.fluidInputs(fluid('deuterium') * 1000)
	.outputs([item('gemDilithium').firstItem * 4])
	.duration(400)
	.EUt(110)
	.buildAndRegister()

// Space Station Builder
crafting.removeByOutput(item('advancedrocketry:stationbuilder'))
// todo implemenet
// makeExtremeRecipe5(<advancedrocketry:stationbuilder>,
// 	[
// 		"RTETR",
// 		"TXMXT",
// 		"TCACT",
// 		"TXCXT",
// 		"RTETR",
// 	], {
// 		T: <metaitem:plateDoubleTitanium>, // Heavy Titanium Plating
// 		X: <libvulpes:structuremachine>,     // Machine Structure
// 		R: <metaitem:robot.arm.ev>, // EV Robot Arm
// 		E: <metaitem:emitter.ev>,   // EV Emitter
// 		A: <meta_tile_entity:assembler.ev>,  // EV Assembling Machine
// 		C: <ore:circuitEv>, // T4 Circuit
// 		M: <metaitem:cover.screen>, // Screen
// 	});

// Station ID Chip
crafting.removeByOutput(item('advancedrocketry:spacestationchip'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_station_id_chip')
    .output(item('advancedrocketry:spacestationchip'))
    .matrix('WPW',
			'WCW',
			'WPW')
    .key('W', ore("wireFineTitanium"))
    .key('P', ore("plateBlackSteel"))
    .key('C', ore("circuitEv"))
    .register()

// Warp Monitor
crafting.removeByOutput(item('advancedrocketry:warpmonitor'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_warp_monitor')
    .output(item('advancedrocketry:warpmonitor'))
    .matrix('SMS',
			'CXC',
			'SCS')
    .key('X', item("libvulpes:structuremachine"))
    .key('S', metaitem("sensor.ev"))
    .key('M', metaitem("cover.screen"))
    .key('C', ore("circuitEv"))
    .register()

// Holo Projector
crafting.removeByOutput(item('libvulpes:holoprojector'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_holo_projector')
    .output(item('libvulpes:holoprojector'))
    .matrix('TOT',
			'TTT')
    .key('O', item("advancedrocketry:satelliteprimaryfunction"))
    .key('T', ore("plateTitanium"))
    .register()

// Optical Sensor
crafting.removeByOutput(item('advancedrocketry:satelliteprimaryfunction'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_optical_sensor')
    .output(item('advancedrocketry:satelliteprimaryfunction'))
    .matrix('GGG',
			'ISI',
			' I ')
    .key('G', item("minecraft:glass_pane"))
    .key('I', ore("platePulsatingIron"))
    .key('S', metaitem("sensor.ev"))
    .register()

// Warp Core
crafting.removeByOutput(item('advancedrocketry:warpcore'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_warp_core')
    .output(item('advancedrocketry:warpcore'))
    .matrix('LTL',
			'TNT',
			'LTL')
    .key('L', ore("blockLumium"))
    .key('T', ore("blockTitanium"))
    .key('N', ore("blockNetherStar"))
    .register()


// Rocket Monitoring Station
crafting.removeByOutput(item('advancedrocketry:monitoringstation'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_rocket_monitoring_station')
    .output(item('advancedrocketry:monitoringstation'))
    .matrix('ROR',
			'RXR',
			'RCR')
    .key('O', item("advancedrocketry:satelliteprimaryfunction"))
    .key('X', item("libvulpes:structuremachine"))
    .key('R', ore("stickCopper"))
    .key('C', ore("circuitMv"))
    .register()

// Guidance Computer Access Hatch
crafting.removeByOutput(item('advancedrocketry:loader:6'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_guidance_computer_access_hatch')
    .output(item('advancedrocketry:loader:6'))
    .matrix(' C ',
			'RXR',
			' C ')
    .key('X', item("libvulpes:structuremachine"))
    .key('R', ore("stickCopper"))
    .key('C', ore("circuitMv"))
    .register()


// Station Docking Port
crafting.removeByOutput(item('advancedrocketry:stationmarker'))
crafting.shapelessBuilder()
	.name("contenttweaker:ar_stationmarker")
	.output(item('advancedrocketry:stationmarker'))
	.input(item('actuallyadditions:item_battery'))
	.input(item('libvulpes:structuremachine'))
	.input(ore('circuitMv'))
	.register()

// Station Gravity Controller
crafting.removeByOutput(item('advancedrocketry:gravitycontroller'))
crafting.shapelessBuilder()
	.name("contenttweaker:ar_gravitycontroller")
	.output(item('advancedrocketry:gravitycontroller'))
	.input(item('libvulpes:structuremachine'))
	.input(item('minecraft:piston'))
	.input(metaitem('cover.screen'))
	.register()

// Altitude Controller
crafting.removeByOutput(item('advancedrocketry:altitudecontroller'))
crafting.shapelessBuilder()
	.name("contenttweaker:ar_altitudecontroller")
	.output(item('advancedrocketry:altitudecontroller'))
	.input(item('libvulpes:structuremachine'))
	.input(metaitem('cover.screen'))
	.input(ore('circuitMv'))
	.register()

// Orientation Controller
crafting.removeByOutput(item('advancedrocketry:orientationcontroller'))
crafting.shapelessBuilder()
	.name("contenttweaker:ar_orientationcontroller")
	.output(item('advancedrocketry:orientationcontroller'))
	.input(item('libvulpes:structuremachine'))
	.input(metaitem('cover.screen'))
	.input(item('minecraft:compass'))
	.register()

// Docking Pad
crafting.removeByOutput(item('advancedrocketry:landingpad'))
crafting.shapelessBuilder()
	.name("contenttweaker:ar_landingpad")
	.output(item('advancedrocketry:landingpad'))
	.input(item('advancedrocketry:launchpad'))
	.input(ore('circuitMv'))
	.register()


// Station Light
crafting.removeByOutput(item('advancedrocketry:circlelight'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_circlelight')
    .output(item('advancedrocketry:circlelight'))
    .matrix(' P ',
			'PGP',
			' P ')
    .key('P', ore("plateIron"))
    .key('G', item("minecraft:glowstone"))
    .register()

// Atmosphere Detector
crafting.removeByOutput(item('advancedrocketry:oxygendetection'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_atmosphere_detector')
    .output(item('advancedrocketry:oxygendetection'))
    .matrix('PMP',
			'BXR',
			'PCP')
    .key('X', item("libvulpes:structuremachine"))
    .key('B', item("minecraft:iron_bars"))
    .key('M', metaitem("cover.screen"))
    .key('P', ore("plateSteel"))
    .key('C', ore("circuitMv"))
    .key('R', ore("rotorSteel"))
    .register()

// Area Gravity Controller
crafting.removeByOutput(item('advancedrocketry:gravitymachine'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_gravity_machine')
    .output(item('advancedrocketry:gravitymachine'))
    .matrix(' M ',
			'TWT',
			'TCT')
    .key('W', item("advancedrocketry:warpcore"))
    .key('T', ore("plateTitanium"))
    .key('C', ore("circuitEv"))
    .key('M', metaitem("cover.screen"))
    .register()

// Seal Detector
crafting.removeByOutput(item('advancedrocketry:sealdetector'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_sealdetector')
    .output(item('advancedrocketry:sealdetector'))
    .matrix('S  ',
			'C  ',
			'c  ')
    .key('S', metaitem("sensor.mv"))
    .key('C', metaitem("cover.screen"))
    .key('c', item("minecraft:comparator"))
    .register()

// HoverCraft
crafting.removeByOutput(item('advancedrocketry:hovercraft'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_hovercraft')
    .output(item('advancedrocketry:hovercraft'))
    .matrix('CMC',
			'DTD',
			'E E')
    .key('T', item("advancedrocketry:structuretower"))
    .key('E', item("advancedrocketry:rocketmotor"))
    .key('C', ore("circuitMv"))
    .key('M', metaitem("cover.screen"))
    .key('D', ore("crystalDilithium"))
    .register()

// Planet Selector
crafting.removeByOutput(item('advancedrocketry:planetselector'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_planetselector')
    .output(item('advancedrocketry:planetselector'))
    .matrix('CPC',
			'SSS')
    .key('C', ore("circuitMv"))
    .key('P', item("advancedrocketry:planetidchip"))
    .key('S', item("libvulpes:structuremachine"))
    .register()

// Holographic Planet Selector
crafting.removeByOutput(item('advancedrocketry:planetselector'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_planetselector')
    .output(item('advancedrocketry:planetselector'))
    .matrix('CGC',
			'XPX',
			'CHC')
    .key('P', item("advancedrocketry:planetselector"))
    .key('X', item("libvulpes:structuremachine"))
    .key('C', ore("circuitMv"))
    .key('G', item("minecraft:glowstone"))
    .key('H', item("libvulpes:holoprojector"))
    .register()

// Advanced Machine Structure
crafting.removeByOutput(item('libvulpes:advstructuremachine'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_advanced_structure')
    .output(item('libvulpes:advstructuremachine'))
    .matrix('RPR',
			'PSP',
			'RPR')
    .key('P', metaitem("plateTitanium"))
    .key('R', metaitem("stickTitanium"))
    .key('S', item("libvulpes:structuremachine"))
    .register()

// Space Suit Upgrades
// Hover Upgrade
mods.gregtech.assembler.recipeBuilder()
	.inputs([
		item("enderio:item_dark_steel_upgrade:1")
			.withTag({"enderio:dsu": "enderio:glide", "enderio:enabled": 1 as byte}),
		item("contenttweaker:radiationlayer"),
		item("contenttweaker:pressurelayer")
	])
	.outputs(item("advancedrocketry:itemupgrade:0"))
	.duration(400)
	.EUt(100)
	.buildAndRegister();

// Bionic Leg upgrade
mods.gregtech.assembler.recipeBuilder()
	.inputs([
		item("enderio:item_dark_steel_upgrade:1")
			.withTag({"enderio:dsu": "enderio:speedboost3", "enderio:enabled": 1 as byte}),
		item("contenttweaker:radiationlayer"),
		item("contenttweaker:pressurelayer")
	])
	.outputs(item("advancedrocketry:itemupgrade:2"))
	.duration(400)
	.EUt(100)
	.buildAndRegister();

// Flight Speed Control Upgrade
mods.gregtech.assembler.recipeBuilder()
	.inputs([
		item("enderio:item_dark_steel_upgrade:1")
			.withTag(["enderio:dsu": "enderio:travel", "enderio:enabled": 1 as byte]),
		item("contenttweaker:radiationlayer"),
		item("contenttweaker:pressurelayer")
	])
	.outputs(item("advancedrocketry:itemupgrade:1"))
	.duration(400)
	.EUt(100)
	.buildAndRegister();

// Anti Fog visor
mods.gregtech.assembler.recipeBuilder()
	.inputs([
		item("enderio:item_dark_steel_upgrade:1")
			.withTag(["enderio:dsu": "enderio:nightvision", "enderio:enabled": 1 as byte]),
		item("contenttweaker:radiationlayer"),
		item("contenttweaker:pressurelayer")
	])
	.outputs(item("advancedrocketry:itemupgrade:4"))
	.duration(400)
	.EUt(100)
	.buildAndRegister();

// Padded Landing Boots
mods.gregtech.assembler.recipeBuilder()
	.inputs([
		item("enderio:item_dark_steel_upgrade:1")
			.withTag(["enderio:dsu": "enderio:energyupgrade4", "enderio:enabled": 1 as byte]),
		item("contenttweaker:radiationlayer"),
		item("contenttweaker:pressurelayer")
	])
	.outputs(item("advancedrocketry:itemupgrade:3"))
	.duration(400)
	.EUt(100)
	.buildAndRegister();

// Atmospheric sensor
mods.gregtech.assembler.recipeBuilder()
	.inputs([
		item("enderio:item_dark_steel_upgrade"),
		metaitem("sensor.mv")
	])
	.outputs(item("advancedrocketry:atmanalyser"))
	.duration(200)
	.EUt(100)
	.buildAndRegister()

// Orbital Laser Drill
def orbital_pew_pew = item("advancedrocketry:spacelaser")
crafting.removeByOutput(orbital_pew_pew)
// todo extreme recipie
// makeExtremeRecipe5(<advancedrocketry:spacelaser>,
// 	[
// 		"TTTTT",
// 		"TCFCT",
// 		"GESEG",
// 		"RZWZR",
// 		"CLRLC",
// 	], {
// 		T: <metaitem:plateDenseTrinium>,
// 		C: <ore:circuitZpm>,
// 		F: <metaitem:field.generator.zpm>,
// 		G: <metaitem:gearDraconium>,
// 		R: <metaitem:frameHsss>,
// 		E: <metaitem:emitter.luv>,
// 		Z: <metaitem:emitter.zpm>,
// 		L: <contenttweaker:t3laser>,
// 		S: <metaitem:large_miner.luv>,
// 		W: <advancedrocketry:warpcore>,
// 	})
orbital_pew_pew.addTooltip(format.gray("Glory to the PGS!"))
orbital_pew_pew.addTooltip(format.gray("Consult the AR Wiki for building instructions."))
orbital_pew_pew.addTooltip(format.gray("Consumes ") + format.yellow("1,000,000") + format.gray(" RF/t"))
orbital_pew_pew.addTooltip(format.red("Extremely finicky. Use at your own risk. Try restarting your world if it isn't working."))

// Lens (for the drill)
def ar_lens = item("advancedrocketry:lens")
crafting.removeByOutput(ar_lens)
crafting.shapelessBuilder()
	.name("contenttweaker:ar_lens")
	.output(ar_lens)
	.input(ore('craftingLensGlass'))
	.register()

ar_lens.addTooltip(format.gray("A basic lens, used for the Orbital Laser Drill."))
ar_lens.displayName = "Orbital Laser Drill Lens"

// Force Field Projector
crafting.shapedBuilder()
    .name('contenttweaker:ar_forcefieldprojector')
    .output(item('advancedrocketry:forcefieldprojector'))
    .matrix('ATA',
			'AEA',
			'ACA')
    .key('A', metaitem("plateAluminium"))
    .key('T', item("gregtech:transparent_casing"))
    .key('E', metaitem("emitter.lv"))
    .key('C', ore("circuitLv"))
    .register()

// Oxygen vent recipe using EV motor and titanium rotor
crafting.removeByOutput(item('advancedrocketry:oxygenvent'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_oxygenvent')
    .output(item('advancedrocketry:oxygenvent'))
    .matrix('IRI',
			'IEI',
			'IFI')
    .key('I', item("minecraft:iron_bars"))
    .key('R', metaitem("rotorTitanium"))
    .key('E', metaitem("electric.motor.ev"))
    .key('F', item("advancedrocketry:fueltank"))
    .register()

// CO2 Scrubber Recipe - same material replacements as above
crafting.removeByOutput(item('advancedrocketry:oxygenscrubber'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_oxygenscrubber')
    .output(item('advancedrocketry:oxygenscrubber'))
    .matrix('IRI',
			'IEI',
			'ICI')
    .key('I', item("minecraft:iron_bars"))
    .key('R', metaitem("rotorTitanium"))
    .key('E', metaitem("electric.motor.ev"))
    .key('C', metaitem("carbon.mesh"))
    .register()

// Carbon Collection Cartridge - steel plating since these last a while
crafting.removeByOutput(item('advancedrocketry:carbonscrubbercartridge'))
crafting.shapedBuilder()
    .name('contenttweaker:ar_carbonscrubbercartridge')
    .output(item('advancedrocketry:carbonscrubbercartridge'))
    .matrix('IBI',
			'IBI',
			'IBI')
    .key('I', ore("plateDoubleSteel"))
    .key('B', item("minecraft:iron_bars"))
    .register()

// Oxidized Ferric Sand
mods.gregtech.centrifuge.recipeBuilder()
	.inputs(item("advancedrocketry:hotturf"))
	.chancedOutput(metaitem("crushedBandedIron"), 5000, 500)
	.duration(20)
	.EUt(480)
	.buildAndRegister();

println("[AdvRocketry.groovy] End AdvancedRocketry Changes")