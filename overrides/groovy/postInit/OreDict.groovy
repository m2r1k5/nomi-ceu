println("[OreDict.groovy] Loading OreDict Changes Start")

def hideItems(bucket) {
	for (def dict : bucket) {
		def oreDictReference = ore(dict.key)

		for (def thing : dict.value) {
			if (thing.isEmpty()) {
				return
			}
			println("[OreDict.groovy] Deleting and hiding ${thing.getDisplayName()} from oredict id ${dict.key}")
			mods.jei.yeet(thing)
			oreDictReference.remove(thing)
		}
	}
}

// grep for old stuff:
// key: <ore:(\w*)> :
// values: <((\w*:\w*)|(\w*:\w*:\d*))>


//Ender IO was being annoying
ore("ingotRedstoneAlloy").add(metaitem("ingotRedAlloy"))
ore("nuggetRedstoneAlloy").add(metaitem("nuggetRedAlloy"))
ore("blockRedstoneAlloy").add(metaitem("blockRedAlloy"))

println("[OreDict.groovy] Now disabling: Blocks")
/**
 * ======== *
 *  BLOCKS  *
 * ======== *
 */

def blocksDisabled = [
	'blockAluminum':[
		item('thermalfoundation:storage:4'),
		item('libvulpes:metal0:9'),
		item('nuclearcraft:ingot_block:12')
	],

	// 'blockApatite': [
	// 	item('forestry:resource_storage>')
	// ],

	'blockDraconiumAwakened':[
		item('draconicevolution:draconic_block')
	],

	'blockBeryllium':[
		item('nuclearcraft:ingot_block:9')
	],

	'blockBronze':[
		item('thermalfoundation:storage_alloy:3')
	],

	// 'blockCobalt': [

	// ],

	'blockCopper':[
		item('thermalfoundation:storage'),
		item('libvulpes:metal0:4')
	],

	'blockCharcoal': [
		item('actuallyadditions:block_misc:5')
	],

	'blockConductiveIron': [
		item('enderio:block_alloy:4')
	],

	'blockCrystalMatrix': [
		item('avaritia:block_resource:2')
	],

	'blockDarkSteel': [
		item('enderio:block_alloy:6')
	],

	'blockDraconium': [
		item('draconicevolution:draconium_block')
	],

	'blockElectrum': [
		item('thermalfoundation:storage_alloy:1')
	],

	'blockElectrumFlux': [
		item('redstonearsenal:storage')
	],

	'blockElectricalSteel': [
		item('enderio:block_alloy')
	],

	'blockEndSteel': [
		item('enderio:block_alloy:8')
	],

	'blockEnderium': [
		item('thermalfoundation:storage_alloy:7')
	],

	'blockEnergeticAlloy': [
		item('enderio:block_alloy:1')
	],

	'blockGraphite': [
		item('nuclearcraft:ingot_block:8')
	],

	// 'blockInfinity': [
	// 	item('avaritia:block_resource:1')
	// ],

	'blockInvar': [
		item('thermalfoundation:storage_alloy:2')
	],

	'blockIridium': [
		item('thermalfoundation:storage:7'),
		item('libvulpes:metal0:10')
	],

	'blockLead': [
		item('thermalfoundation:storage:3')
	],

	'blockLumium': [
		item('thermalfoundation:storage_alloy:6')
	],

	'blockManganese': [
		item('nuclearcraft:ingot_block:11')
	],

	'blockNickel': [
		item('thermalfoundation:storage:5')
	],

	'blockNeutronium': [
		item('avaritia:block_resource')
	],

	'blockNetherstar': [
		item('extendedcrafting:storage:2')
	],

	'blockPlatinum': [
		item('thermalfoundation:storage:6')
	],

	'blockSignalum': [
		item('thermalfoundation:storage_alloy:5')
	],

	'blockSilver': [
		item('thermalfoundation:storage:2'),
		item('nuclearcraft:ingot_block:13')
	],

	'blockSteel': [
		item('thermalfoundation:storage_alloy'),
		item('libvulpes:metal0:6')
	],

	'blockPlutonium': [
		metaitem('blockPlutonium')
	],

	'blockPulsatingIron': [
		item('enderio:block_alloy:5')
	],

	'blockTin': [
		item('thermalfoundation:storage:1'),
		item('libvulpes:metal0:5')
	],

	'blockTin': [
		item('thermalfoundation:storage:1'),
		item('libvulpes:metal0:5')
	],

	'blockVibrantAlloy': [
		item('enderio:block_alloy:2')
	],

	'blockTitanium': [
		item('libvulpes:metal0:7')
	],

	'blockFuelCoke': [
		item('thermalfoundation:storage_resource:1')
	]
]

hideItems(blocksDisabled)

ore("blockWarpCoreRim").add(item('gregtech:meta_block_compressed_7:1'))
ore('fusedGlass').add(item('gregtech:transparent_casing:0'))
ore('blockSkystone').add(item('appliedenergistics2:sky_stone_block'))

ore('cropFlax').remove(item('minecraft:string'))

println("[OreDict.groovy] Now disabling: Dust")
/**
 * ======== *
 *   DUST   *
 * ======== *
 */

def dustsDisabled = [
	'dustAluminium': [
		item('thermalfoundation:material:68'),
		item('nuclearcraft:dust:12')
	],

	'dustAluminum': [
		item('libvulpes:productdust:9'),
		item('thermalfoundation:material:68')
	],

	'dustBeryllium': [
		item('nuclearcraft:dust:9')
	],

	'dustBronze': [
		item('thermalfoundation:material:99')
	],

	'dustCertusQuartz': [
		item('appliedenergistics2:material:2')
	],

	'dustCharcoal': [
		item('thermalfoundation:material:769')
	],

	'dustCoal': [
		item('enderio:item_material:23'),
		item('actuallyadditions:item_dust:6'),
		item('thermalfoundation:material:768'),
		item('nuclearcraft:gem_dust:7')
	],

	'dustCobalt': [
		item('enderio:item_material:31')
	],

	'dustConstantan': [
		item('thermalfoundation:material:100')
	],

	'dustCopper': [
		item('enderio:item_material:26'),
		item('libvulpes:productdust:4'),
		item('thermalfoundation:material:64')
	],

	'dustDiamond': [
		item('actuallyadditions:item_dust:2'),
		item('nuclearcraft:gem_dust')
	],

	'dustDraconium': [
		item('draconicevolution:draconium_dust')
	],

	'dustElectrum': [
		item('thermalfoundation:material:97')
	],

	'dustElectrumFlux': [
		item('redstonearsenal:material')
	],

	'dustEnderium': [
		item('thermalfoundation:material:103')
	],

	'dustEnderPearl': [
		item('appliedenergistics2:material:46'),
		item('appliedenergistics2:material:46')
	],

	'dustEmerald': [
		item('actuallyadditions:item_dust:3')
	],

	// 'dustFluix': [
	// 	item('appliedenergistics2:material:8')
	// ],

	'dustGraphite': [
		item('nuclearcraft:dust:8')
	],

	'dustGold': [
		item('actuallyadditions:item_dust:1'),
		item('appliedenergistics2:material:51'),
		item('enderio:item_material:25'),
		item('libvulpes:productdust:2'),
		item('thermalfoundation:material:1')
	],

	'dustIron': [
		item('libvulpes:productdust:1'),
		item('enderio:item_material:24'),
		item('actuallyadditions:item_dust'),
		item('appliedenergistics2:material:49'),
		item('thermalfoundation:material')
	],

	'dustLapis': [
		item('actuallyadditions:item_dust:4'),
		item('enderio:item_material:32')
	],

	'dustLead': [
		item('thermalfoundation:material:67')
	],

	'dustLumium': [
		item('thermalfoundation:material:102')
	],

	'dustInvar': [
		item('thermalfoundation:material:98')
	],

	'dustIridium': [
		item('libvulpes:productdust:10'),
		item('thermalfoundation:material:71')
	],

	'dustManganese': [
		item('nuclearcraft:dust:11')
	],

	'dustNetherQuartz': [
		item('enderio:item_material:33'),
		item('actuallyadditions:item_dust:5'),
		item('appliedenergistics2:material:3'),
		item('nuclearcraft:gem_dust:2')
	],

	'dustNickel': [
		item('thermalfoundation:material:69')
	],

	'dustObsidian': [
		item('enderio:item_material:29'),
		item('thermalfoundation:material:770'),
		item('nuclearcraft:gem_dust:3')
	],

	'dustPlatinum': [
		item('thermalfoundation:material:70')
	],

	'dustQuartz': [
		item('appliedenergistics2:material:3'),
		item('actuallyadditions:item_dust:5')
	],

	// 'dustPlutonium': [
	// 	metaitem('dustPlutonium')
	// ],

	'dustSaltpeter': [
		item('thermalfoundation:material:772')
	],

	'dustSignalum': [
		item('thermalfoundation:material:101')
	],

	'dustSilver': [
		item('thermalfoundation:material:66'),
		item('nuclearcraft:dust:13')
	],

	'dustSilicon': [
		item('libvulpes:productdust:3')
	],

	'dustSodiumHydroxide': [
		item('nuclearcraft:compound:5')
	],

	'dustSteel': [
		item('libvulpes:productdust:6'),
		item('thermalfoundation:material:96')
	],

	'dustSulfur': [
		item('thermalfoundation:material:771'),
		item('nuclearcraft:gem_dust:6')
	],

	'dustTin': [
		item('enderio:item_material:27'),
		item('libvulpes:productdust:5'),
		item('thermalfoundation:material:65')
	],

	'dustTitanium': [
		item('libvulpes:productdust:7')
	],

	'dustWood': [
		item('thermalfoundation:material:800')
	],

	'itemSawdust': [
		item('thermalfoundation:material:800')
	],

	'dustEndstone': [
		item('nuclearcraft:gem_dust:11')
	]
]

hideItems(dustsDisabled)

ore('dustArdite').add(item('enderio:item_material:30'));
ore('dustMoon').add(item('contenttweaker:moondust'));

println("[OreDict.groovy] Now disabling: Gems")
/**
 * ======== *
 *   GEMS   *
 * ======== *
 */
def gemsDisabled = [
	// technically a gem?
	'itemSilicon': [
		item('enderio:item_material:5'),
		item('nuclearcraft:gem:6'),
		item('appliedenergistics2:material:5'),
		item('libvulpes:productingot:3'),
		item('projectred-core:resource_item:301')
	],

	'dustArsenic': [
		item('nuclearcraft:gem_dust:10')
	],

	'gemRuby': [
		item('projectred-core:resource_item:200')
	],

	'gemSapphire': [
		item('projectred-core:resource_item:201')
	]
]

hideItems(gemsDisabled)

println("[OreDict.groovy] Now disabling: Ingots")
/**
 * ======== *
 *  INGOTS  *
 * ======== *
 */
def ingotsDisabled = [
	'ingotAluminium': [
		item('thermalfoundation:material:132'),
		item('nuclearcraft:ingot:12')
	],

	'ingotAluminum': [
		item('libvulpes:productingot:9'),
		item('thermalfoundation:material:132')
	],

	'ingotDraconiumAwakened': [
		item('draconicevolution:draconic_ingot')
	],

	'ingotBeryllium': [
		item('nuclearcraft:ingot:9')
	],

	'ingotBronze': [
		item('thermalfoundation:material:163'),
		// item('forestry:ingot_bronze'),
		item('nuclearcraft:alloy')
	],

	'ingotCobalt': [
	],

	'ingotConductiveIron': [
		item('enderio:item_alloy_ingot:4')
	],

	'ingotCopper': [
		item('libvulpes:productingot:4'),
		item('thermalfoundation:material:128'),
		item('projectred-core:resource_item:100')
		// item('forestry:ingot_copper')
	],

	'ingotCrystalMatrix': [
		item('avaritia:resource:1')
	],

	'ingotDarkSteel': [
		item('enderio:item_alloy_ingot:6')
	],

	'ingotDraconium': [
		item('draconicevolution:draconium_ingot')
	],

	'ingotElectricalSteel': [
		item('enderio:item_alloy_ingot')
	],

	'ingotElectrum': [
		item('thermalfoundation:material:161')
	],

	'ingotElectrumFlux': [
		item('redstonearsenal:material:32')
	],

	'ingotEnderium': [
		item('thermalfoundation:material:167')
	],

	'ingotEndSteel': [
		item('enderio:item_alloy_ingot:8')
	],

	'ingotEnergeticAlloy': [
		item('enderio:item_alloy_ingot:1')
	],

	'ingotGraphite': [
		item('nuclearcraft:ingot:8')
	],

	'ingotLead': [
		item('thermalfoundation:material:131')
	],

	'ingotLumium': [
		item('thermalfoundation:material:166')
	],

	'ingotOsmiridium': [
	],

	'ingotIridium': [
		item('libvulpes:productingot:10'),
		item('thermalfoundation:material:135')
	],

	// 'ingotInfinity': [
	// 	item('avaritia:resource:6')
	// ],

	'ingotInvar': [
		item('thermalfoundation:material:162')
	],

	'ingotManganese': [
		item('nuclearcraft:ingot:11')
	],

	'ingotNeutronium': [
		item('avaritia:resource:4')
	],

	'ingotNickel': [
		item('thermalfoundation:material:133')
	],

	'ingotPlatinum': [
		item('thermalfoundation:material:134')
	],

	// 'ingotPlutonium': [
	// 	metaitem('ingotPlutonium')
	// ],

	'ingotPulsatingIron': [
		item('enderio:item_alloy_ingot:5')
	],

	'ingotRedstoneAlloy': [
		item('enderio:item_alloy_ingot:3'),
		item('projectred-core:resource_item:103')
	],

	'ingotSignalum': [
		item('thermalfoundation:material:165')
	],

	'ingotSoularium': [
		item('enderio:item_alloy_ingot:7')
	],

	'ingotTin': [
		item('libvulpes:productingot:5'),
		item('thermalfoundation:material:129'),
		item('projectred-core:resource_item:101')
		// item('forestry:ingot_tin')
	],

	'ingotTitanium': [
		item('libvulpes:productingot:7')
	],

	'ingotThorium': [
		item('nuclearcraft:ingot:3')
	],

	'ingotSilver': [
		item('thermalfoundation:material:130'),
		item('nuclearcraft:ingot:13'),
		item('projectred-core:resource_item:102')
	],

	'ingotSilicon': [
		item('libvulpes:productingot:3')
	],

	'ingotSignalum': [
		item('thermalfoundation:material:165')
	],

	'ingotSteel': [
		item('libvulpes:productingot:6'),
		item('thermalfoundation:material:160'),
		item('nuclearcraft:alloy:5')
	],

	'ingotVibrantAlloy': [
		item('enderio:item_alloy_ingot:2')
	],
]

hideItems(ingotsDisabled)

println("[OreDict.groovy] Now disabling: Plates")
/**
 * ======== *
 *  Plates  *
 * ======== *
 */
def platesDisabled = [
	'plateAluminum': [
		item('libvulpes:productplate:9'),
		item('thermalfoundation:material:324')
	],

	'plateBronze': [
		item('thermalfoundation:material:355')
	],

	'plateConstantan': [
		item('thermalfoundation:material:356')
	],

	'plateCopper': [
		item('libvulpes:productplate:4'),
		item('thermalfoundation:material:320')
	],

	'plateElectrum': [
		item('thermalfoundation:material:353')
	],

	'plateElectrumFlux': [
		item('redstonearsenal:material:128')
	],

	'plateEnderium': [
		item('thermalfoundation:material:359')
	],

	'plateGold': [
		item('libvulpes:productplate:2'),
		item('thermalfoundation:material:33')
	],

	'plateInvar': [
		item('thermalfoundation:material:354')
	],

	'plateIridium': [
		item('libvulpes:productplate:10'),
		item('thermalfoundation:material:327')
	],

	'plateIron': [
		item('thermalfoundation:material:32'),
		item('libvulpes:productplate:1')
	],

	'plateLead': [
		item('thermalfoundation:material:323')
	],

	'plateLumium': [
		item('thermalfoundation:material:358')
	],

	'plateNickel': [
		item('thermalfoundation:material:325')
	],

	'platePlatinum': [
		item('thermalfoundation:material:326')
	],

	// 'platePlutonium': [
	// 	metaitem('platePlutonium')
	// ],

	'plateSignalum': [
		item('thermalfoundation:material:357')
	],

	'plateSilicon': [
		item('libvulpes:productplate:3')
	],

	'plateSilver': [
		item('thermalfoundation:material:322')
	],

	'plateSteel': [
		item('thermalfoundation:material:352'),
		item('libvulpes:productplate:6')
	],

	'plateTin': [
		item('thermalfoundation:material:321'),
		item('libvulpes:productplate:5')
	],

	'plateTitanium': [
		item('libvulpes:productplate:7')
	],

	// 'plateNeutronium': [
	// 	metaitem('plateNeutronium')
	// ]
]

hideItems(platesDisabled)

println("[OreDict.groovy] Now disabling: Gears")
/**
 * ======== *
 *   Gears  *
 * ======== *
 */
def gearsDisabled = [
	'gearAluminum': [
		item('thermalfoundation:material:260')
	],

	'gearBronze': [
		item('thermalfoundation:material:291')
		// item('forestry:gear_bronze')
	],

	'gearConstantan': [
		item('thermalfoundation:material:292')
	],

	'gearCopper': [
		item('thermalfoundation:material:256')
		// item('forestry:gear_copper')
	],

	'gearDiamond': [
		item('thermalfoundation:material:26')
	],

	'gearElectrum': [
		item('thermalfoundation:material:289')
	],

	'gearElectrumFlux': [
		item('redstonearsenal:material:96')
	],

	'gearEnderium': [
		item('thermalfoundation:material:295')
	],

	'gearGold': [
		item('thermalfoundation:material:25')
	],

	'gearInvar': [
		item('thermalfoundation:material:290')
	],

	'gearIron': [
		item('thermalfoundation:material:24')
	],

	'gearIridium': [
		item('thermalfoundation:material:263')
	],

	'gearLead': [
		item('thermalfoundation:material:259')
	],

	'gearLumium': [
		item('thermalfoundation:material:294')
	],

	'gearNickel': [
		item('thermalfoundation:material:261')
	],

	'gearPlatinum': [
		item('thermalfoundation:material:262')
	],

	'gearSignalum': [
		item('thermalfoundation:material:293')
	],

	'gearSilver': [
		item('thermalfoundation:material:258')
	],

	'gearSteel': [
		item('thermalfoundation:material:288'),
		item('libvulpes:productgear:6')
	],

	'gearTin': [
		item('thermalfoundation:material:257'),
		// item('forestry:gear_tin')
	],

	'gearTitanium': [
		item('libvulpes:productgear:7')
	],

	'gearWood': [
		item('appliedenergistics2:material:40'),
		item('thermalfoundation:material:22')
	]
]

hideItems(gearsDisabled)

println("[OreDict.groovy] Now disabling: Nuggets")
/**
 * ======== *
 * Nuggets  *
 * ======== *
 */
def nuggetsDisabled = [
	'nuggetAluminium': [
		item('thermalfoundation:material:196'),
		item('libvulpes:productnugget:9'),
	],

	'nuggetAluminum': [
		item('thermalfoundation:material:196'),
		item('libvulpes:productnugget:9')
	],

	'nuggetBronze': [
		item('thermalfoundation:material:227')
	],

	'nuggetCopper': [
		item('thermalfoundation:material:192'),
		item('libvulpes:productnugget:4')
	],

	'nuggetDraconium': [
		item('draconicevolution:nugget')
	],

	'nuggetDraconiumAwakened': [
		item('draconicevolution:nugget:1')
	],

	'nuggetElectrum': [
		item('thermalfoundation:material:225')
	],

	'nuggetElectrumFlux': [
		item('redstonearsenal:material:64')
	],

	'nuggetEnderium': [
		item('thermalfoundation:material:231')
	],

	'nuggetInvar': [
		item('thermalfoundation:material:226'),
	],

	'nuggetIridium': [
		item('thermalfoundation:material:199'),
		item('libvulpes:productnugget:10')
	],

	'nuggetLumium': [
		item('thermalfoundation:material:230')
	],

	// 'nuggetPlutonium': [
	// 	metaitem('nuggetPlutonium')
	// ],

	'nuggetSignalum': [
		item('thermalfoundation:material:229')
	],

	'nuggetTin': [
		item('libvulpes:productnugget:5')
	],

	'nuggetTitanium': [
		item('libvulpes:productnugget:7')
	],

	'nuggetNeutronium': [
		item('avaritia:resource:3'),
	],

	'nuggetNickel': [
		item('thermalfoundation:material:197'),
	],

	'nuggetPlatinum': [
		item('thermalfoundation:material:198')
	],

	'nuggetSteel': [
		item('thermalfoundation:material:224'),
		item('libvulpes:productnugget:9'),
		item('libvulpes:productnugget:6')
	]
]

hideItems(nuggetsDisabled)

println("[OreDict.groovy] Now disabling: Sticks")
/**
 * ======== *
 *  STICKS  *
 * ======== *
 */
def sticksDisabled = [
	'stickIron': [
		item('libvulpes:productrod:1')
	],

	'stickCopper': [
		item('libvulpes:productrod:4')
	],

	'stickPlutonium': [
		// metaitem('stickPlutonium')
	],

	'stickSteel': [
		item('libvulpes:productrod:6')
	],

	'stickTitanium': [
		item('libvulpes:productrod:7')
	],

	'stickIridium': [
		item('libvulpes:productrod:10')
	]
]

hideItems(sticksDisabled)

println("[OreDict.groovy] Now disabling: Ores")
/**
 * ======== *
 *   ORES   *
 * ======== *
 */
def oresDisabled = [
	'oreAluminium': [
		item('libvulpes:ore0:9')
		],

	'oreAluminum': [
		item('libvulpes:ore0:9')
	],

	'oreCopper': [
		item('libvulpes:ore0:4')
	],

	'oreIridium': [
		item('libvulpes:ore0:10')
	],

	'oreLead': [
		item('thermalfoundation:ore:3')
	],

	'orePlatinum': [
		item('thermalfoundation:ore:6')
	],

	'oreRutile': [
		item('libvulpes:ore0:8')
	],

	'oreTin': [
		item('libvulpes:ore0:5')
	],

	'oreTitanium': [
		item('libvulpes:ore0:8')
	],

	'oreSilver': [
		item('thermalfoundation:ore:2')
	]
]

hideItems(oresDisabled)


ore('itemSilicon').add(metaitem('wafer.silicon'));
ore('dustQuartz').add(metaitem('dustNetherQuartz'));
ore('dustBone').add(item('minecraft:dye:15'));

// Awakened Draconium Fix
ore('blockDraconiumAwakened').add(metaitem('blockAwakenedDraconium'));
ore('ingotDraconiumAwakened').add(metaitem('ingotAwakenedDraconium'));
ore('nuggetDraconiumAwakened').add(metaitem('nuggetAwakenedDraconium'));

// Chisel Blocks fix
// Aluminium (not aluminum)
ore('blockAluminum').add(metaitem('blockAluminium'));

// Coal Coke (not fuelCoke)
ore('blockCoalCoke').add(metaitem('blockCoke'));

//Ores
ore('oreIron').add(item('minecraft:iron_ore'));
ore('oreCoal').add(item('minecraft:coal_ore'));
ore('oreRedstone').add(item('minecraft:redstone_ore'));
ore('oreDiamond').add(item('minecraft:diamond_ore'));
ore('oreLapis').add(item('minecraft:lapis_ore'));
ore('oreGold').add(item('minecraft:gold_ore'));
ore('oreEmerald').add(item('minecraft:emerald_ore'));
ore('oreNetherQuartz').add(item('minecraft:quartz_ore'));

ore('blockAluminum').add(item('gregtech:meta_block_compressed_0:1'));

ore('blockCoalCoke').add(item('gregtech:meta_block_compressed_22:5'));


//Questbook things

ore('questbookBrewery').add(metaitem("brewery.lv")>) // LV Brewery
ore('questbookBrewery').add(metaitem("brewery.mv")) // MV Brewery

ore('questbookDistillery').add(metaitem("distillery.lv")) // LV Distillery
ore('questbookDistillery').add(metaitem("distillery.mv")) // MV Distillery

//ore('questbookCentrifuge').add(<meta_tile_entity:centrifuge.lv>) // LV Centrifuge
//ore('questbookCentrifuge').add(<meta_tile_entity:centrifuge.mv>) // MV Centrifuge
//ore('questbookCentrifuge').add(<meta_tile_entity:centrifuge.hv>) // HV Centrifuge

ore('questbookPolarizer').add(metaitem("polarizer.lv")) // LV Polarizer
ore('questbookPolarizer').add(metaitem("polarizer.mv")) // MV Polarizer (why)

ore('questbookAirCollector').add(metaitem("gas_collector.lv")) // LV Air Succ
ore('questbookAirCollector').add(metaitem("gas_collector.mv")) // MV Air Succ
ore('questbookAirCollector').add(metaitem("gas_collector.hv")) // HV Air Succ
ore('questbookAirCollector').add(metaitem("gas_collector.ev")) // EV Air Succ

ore('questbookCanning').add(metaitem("canner.lv")) // LV Canning
ore('questbookCanning').add(metaitem("canner.mv")) // MV Canning

ore('questbookSifter').add(metaitem('sifter.lv'))
ore('questbookSifter').add(metaitem('sifter.mv'))

ore('questbookLvCef').add(metaitem('energy_converter.lv.1'))
ore('questbookLvCef').add(metaitem('energy_converter.lv.4'))
ore('questbookLvCef').add(metaitem('energy_converter.lv.8'))
ore('questbookLvCef').add(metaitem('energy_converter.lv.16'))

ore('questbookMvCef').add(metaitem('energy_converter.mv.1'))
ore('questbookMvCef').add(metaitem('energy_converter.mv.4'))
ore('questbookMvCef').add(metaitem('energy_converter.mv.8'))
ore('questbookMvCef').add(metaitem('energy_converter.mv.16'))

ore('questbookParallelControlHatch').add(metaitem("gcym:parallel_hatch.iv"))
ore('questbookParallelControlHatch').add(metaitem("gcym:parallel_hatch.luv"))
ore('questbookParallelControlHatch').add(metaitem("gcym:parallel_hatch.zpm"))
ore('questbookParallelControlHatch').add(metaitem("gcym:parallel_hatch.uv"))

//ore('questbookFluidExtractor').add(<meta_tile_entity:fluid_extractor.lv>) // LV Fluid Extractor
//ore('questbookFluidExtractor').add(<meta_tile_entity:fluid_extractor.mv>) // MV Fluid Extractor
//ore('questbookFluidExtractor').add(<meta_tile_entity:fluid_extractor.hv>) // HV Fluid Extractor

ore('questbookPowerUnit').add(metaitem('power_unit.lv')) // LV Power Unit
ore('questbookPowerUnit').add(metaitem('power_unit.mv')) // MV Power Unit
ore('questbookPowerUnit').add(metaitem('power_unit.hv')) // HV Power Unit
ore('questbookPowerUnit').add(metaitem('power_unit.ev')) // EV Power Unit
ore('questbookPowerUnit').add(metaitem('power_unit.iv')) // IV Power Unit

ore('questbookMacerator').add(metaitem('macerator.lv')) // LV Macerator
ore('questbookMacerator').add(metaitem('macerator.mv')) // MV Macerator
ore('questbookMacerator').add(metaitem('macerator.hv')) // HV Macerator

ore('questbookWirelessTerminals').add(item('appliedenergistics2:wireless_terminal')) // Normal Wireless
ore('questbookWirelessTerminals').add(item('appliedenergistics2:wireless_crafting_terminal')) // Crafting Wireless
ore('questbookWirelessTerminals').add(item('appliedenergistics2:wireless_pattern_terminal')) // Pattern Wireless
ore('questbookWirelessTerminals').add(item('appliedenergistics2:wireless_fluid_terminal')) // Fluid Wireless

ore('questbookChisels').add(item('chisel:chisel_iron'))
ore('questbookChisels').add(item('chisel:chisel_diamond'))
ore('questbookChisels').add(item('chisel:chisel_hitech'))

// Add All GT Super and Quantum Tanks (apart from creative)
// Super Tanks
ore('questbookTanks').add(metaitem('super_tank.lv'))
ore('questbookTanks').add(metaitem('super_tank.mv'))
ore('questbookTanks').add(metaitem('super_tank.hv'))
ore('questbookTanks').add(metaitem('super_tank.ev'))
ore('questbookTanks').add(metaitem('super_tank.iv'))

// Quantum Tanks
ore('questbookTanks').add(metaitem('quantum_tank.iv'))
ore('questbookTanks').add(metaitem('quantum_tank.luv'))
ore('questbookTanks').add(metaitem('quantum_tank.zpm'))
ore('questbookTanks').add(metaitem('quantum_tank.uv'))
ore('questbookTanks').add(metaitem('quantum_tank.uhv'))

/* Nuclearcraft Quests: */
// Neptunium
ore('questbookNeptunium').add(item('nuclearcraft:neptunium'))
ore('questbookNeptunium').add(item('nuclearcraft:neptunium:4'))

// Plutonium
ore('questbookPlutonium').add(item('nuclearcraft:plutonium'))
ore('questbookPlutonium').add(item('nuclearcraft:plutonium:12'))
ore('questbookPlutonium').add(metaitem('ingotPlutonium'))
ore('questbookPlutonium').add(metaitem('ingotPlutonium241'))

// Americium
ore('questbookAmericium').add(item('nuclearcraft:americium'))
ore('questbookAmericium').add(item('nuclearcraft:americium:4'))
ore('questbookAmericium').add(item('nuclearcraft:americium:8'))

// Curium
ore('questbookCurium').add(item('nuclearcraft:curium'))
ore('questbookCurium').add(item('nuclearcraft:curium:4'))
ore('questbookCurium').add(item('nuclearcraft:curium:8'))
ore('questbookCurium').add(item('nuclearcraft:curium:12'))

// Berkelium
ore('questbookBerkelium').add(item('nuclearcraft:berkelium'))
ore('questbookBerkelium').add(item('nuclearcraft:berkelium:4'))

// Californium
ore('questbookCalifornium').add(item('nuclearcraft:californium'))
ore('questbookCalifornium').add(item('nuclearcraft:californium:4'))
ore('questbookCalifornium').add(item('nuclearcraft:californium:8'))
ore('questbookCalifornium').add(item('nuclearcraft:californium:12'))

/* End NC quests */

println("[OreDict.groovy] Loading OreDict Changes End")