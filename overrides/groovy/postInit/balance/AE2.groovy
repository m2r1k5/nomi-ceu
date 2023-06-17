import static NomiUtil.getInscriberBuilder
import static NomiUtil.registerInscriberRecipe
import static NomiUtil.removeInscriberRecipe
println("[AE2.groovy] Start AE2 Changes")

ore('dustFluix').add(item('appliedenergistics2:material:8'))

//Silicon
removeInscriberRecipe(item('appliedenergistics2:material:20'))
registerInscriberRecipe(
	getInscriberBuilder(true)
		.withOutput(item('appliedenergistics2:material:20'))
		// Collection<ItemStack>
		.withInputs([metaitem('plateSilicon')])
		.withTopOptional(item('appliedenergistics2:material:19'))
		.build()
	)

//Engineering Processor
removeInscriberRecipe(item('appliedenergistics2:material:24'))
registerInscriberRecipe(
	getInscriberBuilder(false)
		.withOutput(item('appliedenergistics2:material:24'))
		.withInputs([ore('circuitLv')])
		.withTopOptional(item('appliedenergistics2:material:17'))
		.withBottomOptional(item('appliedenergistics2:material:20'))
		.build()
	)

//Inscriber.addRecipe(item('appliedenergistics2:material:24'), <metaitem:circuit.basic_electronic>, false, item('appliedenergistics2:material:17'),item('appliedenergistics2:material:20'))
//Inscriber.addRecipe(item('appliedenergistics2:material:24'), item('contenttweaker:refinedcircuit'), false, item('appliedenergistics2:material:17'),item('appliedenergistics2:material:20'))
removeInscriberRecipe(item('appliedenergistics2:material:17'))
registerInscriberRecipe(
	getInscriberBuilder(true)
		.withOutput(item('appliedenergistics2:material:17'))
		.withInputs([metaitem('plateDiamond')])
		.withTopOptional(item('appliedenergistics2:material:14'))
		.build()
	)

//Calculation Processor
removeInscriberRecipe(item('appliedenergistics2:material:23'))
registerInscriberRecipe(
	getInscriberBuilder(false)
		.withOutput(item('appliedenergistics2:material:23'))
		.withInputs([ore('circuitLv')])
		.withTopOptional(item('appliedenergistics2:material:16'))
		.withBottomOptional(item('appliedenergistics2:material:20'))
		.build()
	)
//Inscriber.addRecipe(item('appliedenergistics2:material:23'), <metaitem:circuit.basic_electronic>, false, item('appliedenergistics2:material:16'),item('appliedenergistics2:material:20'))
//Inscriber.addRecipe(item('appliedenergistics2:material:23'), item('contenttweaker:refinedcircuit'), false, item('appliedenergistics2:material:16'),item('appliedenergistics2:material:20'))
removeInscriberRecipe(item('appliedenergistics2:material:16'))
registerInscriberRecipe(
	getInscriberBuilder(true)
		.withOutput(item('appliedenergistics2:material:16'))
		.withInputs([metaitem('plateCertusQuartz')])
		.withTopOptional(item('appliedenergistics2:material:13'))
		.build()
	)

//Logic Processor
removeInscriberRecipe(item('appliedenergistics2:material:22'))
registerInscriberRecipe(
	getInscriberBuilder(false)
		.withOutput(item('appliedenergistics2:material:22'))
		.withInputs([ore('circuitLv')])
		.withTopOptional(item('appliedenergistics2:material:18'))
		.withBottomOptional(item('appliedenergistics2:material:20'))
		.build()
	)
//Inscriber.addRecipe(item('appliedenergistics2:material:22'), <metaitem:circuit.basic_electronic>, false, item('appliedenergistics2:material:18'),item('appliedenergistics2:material:20'))
//Inscriber.addRecipe(item('appliedenergistics2:material:22'), item('contenttweaker:refinedcircuit'), false, item('appliedenergistics2:material:18'),item('appliedenergistics2:material:20'))
removeInscriberRecipe(item('appliedenergistics2:material:18'))
registerInscriberRecipe(
	getInscriberBuilder(true)
		.withOutput(item('appliedenergistics2:material:18'))
		// Collection<ItemStack>
		.withInputs([metaitem('plateGold')])
		.withTopOptional(item('appliedenergistics2:material:15'))
		.build()
	)

// ME Drive
crafting.remove('appliedenergistics2:network/blocks/drive')
crafting.shapedBuilder()
    .name('contenttweaker:appliedenergistics2_drive')
    .output(item('appliedenergistics2:drive'))
    .matrix('AEA',
            'CcC',
			'ASA')
    .key('A', metaitem('plateAluminium'))
    .key('E', metaitem('emitter.mv'))
    .key('C', ore('circuitLv'))
    .key('c', item('appliedenergistics2:chest'))
    .key('S', metaitem('sensor.mv'))
    .register()

// ME Inscriber
crafting.remove('appliedenergistics2:network/blocks/inscriber')
crafting.shapedBuilder()
    .name('contenttweaker:appliedenergistics2_inscriber')
    .output(item('appliedenergistics2:inscriber'))
    .matrix('DPD',
            'MHD',
			'DPD')
    .key('D', metaitem('plateDarkSteel'))
    .key('P', metaitem('electric.piston.mv'))
    .key('M', item('appliedenergistics2:material:7'))
    .key('H', metaitem('hull.mv'))
    .register()

// Pattern
crafting.remove('appliedenergistics2:network/crafting/patterns_blank')
crafting.shapedBuilder()
    .name('contenttweaker:appliedenergistics2_pattern')
    .output(item('appliedenergistics2:material:52'))
    .matrix('WWW',
            'PCP',
			'PPP')
    .key('W', metaitem('wireFineSilver'))
    .key('P', metaitem('platePlastic'))
    .key('C', ore('circuitHv'))
    .register()

// Crafting CPU
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_unit')
crafting.shapedBuilder()
    .name('contenttweaker:appliedenergistics2_crafting_unit')
    .output(item('appliedenergistics2:crafting_unit'))
    .matrix('ACA',
            'cLc',
			'ACA')
    .key('A', metaitem('plateAluminium'))
    .key('C', item('appliedenergistics2:material:23')) // processor
    .key('c', item('appliedenergistics2:part:16')) // calculation
    .key('L', item('appliedenergistics2:part:22')) // logic
    .register()

// Molecular Assembler
crafting.remove('appliedenergistics2:network/crafting/molecular_assembler')
crafting.shapedBuilder()
    .name('contenttweaker:appliedenergistics2_molecular_assembler')
    .output(item('appliedenergistics2:molecular_assembler'))
    .matrix('AQA',
            'aCF',
			'AQA')
    .key('A', metaitem('plateAluminium'))
    .key('Q', item('appliedenergistics2:quartz_glass'))
    .key('a', item('appliedenergistics2:material:44')) // anhiliation core
    .key('C', metaitem('workbench'))
    .key('F', item('appliedenergistics2:material:43')) // formation core
    .register()

// Quartz Fiber
crafting.remove('appliedenergistics2:network/parts/quartz_fiber_part')
mods.gregtech.wiremill.recipeBuilder()
	.inputs([item('appliedenergistics2:material:11')])
	.outputs(item('appliedenergistics2:part:140') * 2)
	.duration(100)
	.EUt(16)
	.buildAndRegister()

// Glass Cable
crafting.remove('appliedenergistics2:network/cables/glass_fluix')
mods.gregtech.wiremill.recipeBuilder()
	.inputs([ore('dustFluix'), item('appliedenergistics2:part:140')])
	.outputs(item('appliedenergistics2:part:16') * 2)
	.duration(50)
	.EUt(16)
	.buildAndRegister()

/*
 *  ************************
 *  ===> AE2 EXTENSIONS <===
 *  ************************
 */

/*
 * PackagedAuto!
 */

// Package Component
crafting.removeByOutput(item('packagedauto:package_component'))
crafting.shapedBuilder()
    .name('contenttweaker:pauto_package_component')
    .output(item('packagedauto:package_component'))
    .matrix('VTV',
            'TXT',
			'VTV')
    .key('V', ore('plateVibrantAlloy'))
    .key('T', ore('plateTitanium'))
    .key('X', item('minecraft:ender_eye'))
    .register()

crafting.removeByOutput(item('packagedauto:recipe_holder'))
crafting.shapedBuilder()
    .name('contenttweaker:pauto_recipe_holder')
    .output(item('packagedauto:recipe_holder'))
    .matrix('GPG',
            'PBP',
			'TMT')
    .key('G', item('appliedenergistics2:quartz_glass'))
    .key('P', item('appliedenergistics2:material:52')) // Blank Pattern
    .key('M', item('packagedauto:me_package_component'))
    .key('B', ore('blockCrystaltine'))
    .key('T', ore('plateTitanium'))
    .register()

crafting.removeByOutput(item('packagedauto:packager'))
crafting.shapedBuilder()
    .name('contenttweaker:pauto_packager')
    .output(item('packagedauto:packager'))
    .matrix('TMT',
            'CXC',
			'TIT')
    .key('M', item('packagedauto:me_package_component'))
    .key('I', item('appliedenergistics2:part:240')) // ME Import Bus
    .key('T', ore('plateTitanium'))
    .key('C', ore('circuitEv'))
    .key('X', item('extrautils2:crafter'))
    .register()

crafting.removeByOutput(item('packagedauto:unpackager'))
crafting.shapedBuilder()
    .name('contenttweaker:pauto_unpackager')
    .output(item('packagedauto:unpackager'))
    .matrix('TMT',
            'CXC',
			'TET')
    .key('M', item('packagedauto:me_package_component'))
    .key('E', item('appliedenergistics2:part:260')) // ME Export Bus
    .key('T', ore('plateTitanium'))
    .key('C', ore('circuitEv'))
    .key('X', item('extrautils2:crafter'))
    .register()

crafting.removeByOutput(item('packagedauto:encoder'))
crafting.shapedBuilder()
    .name('contenttweaker:pauto_encoder')
    .output(item('packagedauto:encoder'))
    .matrix('TMT',
            'HXH',
			'TCT')
    .key('M', item('packagedauto:me_package_component'))
    .key('H', item('packagedauto:recipe_holder'))
    .key('T', ore('plateTitanium'))
    .key('C', ore('circuitEv'))
    .key('X', item('ae2stuff:encoder'))
    .register()

crafting.removeByOutput(item('ae2stuff:encoder'))
crafting.shapedBuilder()
    .name('contenttweaker:ae2stuff_encoder')
    .output(item('ae2stuff:encoder'))
    .matrix('STS',
            'AXF',
			'SCS')
    .key('S', ore('plateStainlessSteel'))
    .key('T', item('appliedenergistics2:part:340')) // ME Pattern Terminal
    .key('F', item('appliedenergistics2:material:43')) // Formation Core
    .key('A', item('appliedenergistics2:material:44')) // Annihilation Core
    .key('M', item('packagedauto:me_package_component'))
    .key('C', ore('circuitHv'))
    .key('X', metaitem('hull.hv'))
    .register()

crafting.removeByOutput(item('packagedauto:me_package_component'))
crafting.shapedBuilder()
    .name('contenttweaker:pauto_me_package_component')
    .output(item('packagedauto:me_package_component'))
    .matrix('PGP',
            'AXF',
			'PGP')
    .key('P', ore('plateTitanium'))
    .key('G', item('appliedenergistics2:quartz_glass'))
    .key('F', item('appliedenergistics2:material:43')) // Formation Core
    .key('A', item('appliedenergistics2:material:44')) // Annihilation Core
    .key('X', item('packagedauto:package_component'))
    .register()

/**
 * PackagedExCrafting
 */

// Advanced Crafter
crafting.removeByOutput(item('packagedexcrafting:advanced_crafter'))
crafting.shapedBuilder()
    .name('contenttweaker:pexc_advanced_crafter')
    .output(item('packagedexcrafting:advanced_crafter'))
    .matrix('CIC',
			'BTB',
			'CMC')
    .key('C', item('extendedcrafting:material:15')) // Advanced Catalyst
    .key('I', item('extendedcrafting:interface')) // Automation Interface
    .key('M', item('packagedauto:me_package_component'))
    .key('B', ore('plateBlackSteel'))
    .key('T', item('extendedcrafting:table_advanced')) // Advanced Crafting Table
    .register()

// Elite Crafter
crafting.removeByOutput(item('packagedexcrafting:elite_crafter'))
crafting.shapedBuilder()
    .name('contenttweaker:pexc_elite_crafter')
    .output(item('packagedexcrafting:elite_crafter'))
    .matrix('CIC',
			'BTB',
			'CMC')
    .key('C', item('extendedcrafting:material:16')) // Elite Catalyst
    .key('I', item('extendedcrafting:interface')) // Automation Interface
    .key('M', item('packagedauto:me_package_component'))
    .key('B', ore('plateBlackSteel'))
    .key('T', item('extendedcrafting:table_elite')) // Advanced Crafting Table
    .register()

// Ultimate Crafter
crafting.removeByOutput(item('packagedexcrafting:ultimate_crafter'))
crafting.shapedBuilder()
    .name('contenttweaker:pexc_ultimate_crafter')
    .output(item('packagedexcrafting:ultimate_crafter'))
    .matrix('CIC',
			'BTB',
			'CMC')
    .key('C', item('extendedcrafting:material:17')) // Ultimate Catalyst
    .key('I', item('extendedcrafting:interface')) // Automation Interface
    .key('M', item('packagedauto:me_package_component'))
    .key('B', ore('plateBlackSteel'))
    .key('T', item('extendedcrafting:table_ultimate')) // Ultimate Crafting Table
    .register()


println("[AE2.groovy] End AE2 Changes")