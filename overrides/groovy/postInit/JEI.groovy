// TODO split mod parts into their own groovy file maybe?
println("[JEI.groovy] Start Hiding objects from JEI")

//Hide Categories
mods.jei.hideCategory("minecraft.anvil")
mods.jei.hideCategory("Painter")
mods.jei.hideCategory("extrautils2.blockPatterns")
mods.jei.hideCategory("Avatitia.Compressor")
mods.jei.hideCategory("EIOTank")
mods.jei.hideCategory("jeresources.enchantment")

mods.jei.hideCategory("actuallyadditions.compost")
mods.jei.hideCategory("actuallyadditions.crushing")
mods.jei.hideCategory("actuallyadditions.booklet")
mods.jei.hideCategory("extendedcrafting:compressor")
mods.jei.hideCategory("extendedcrafting:ender_crafting")
mods.jei.hideCategory("thermalexpansion.compression")
mods.jei.hideCategory("thermalexpansion.enervation")
mods.jei.hideCategory("thermalexpansion.transposer_fill")
mods.jei.hideCategory("thermalexpansion.transposer_extract")
//mods.jei.hideCategory("gregtech:plasma_arc_furnace")
//mods.jei.hideCategory("gregtech:arc_furnace")
//mods.jei.hideCategory("gregtech:naquadah_reactor")
//mods.jei.hideCategory("gregtech:mass_fab")
mods.jei.hideCategory("xu2_machine_extrautils2:furnace")
mods.jei.hideCategory("xu2_machine_extrautils2:crusher")
mods.jei.hideCategory("xu2_machine_extrautils2:generator_survival")
mods.jei.hideCategory("xu2_machine_extrautils2:generator")

mods.jei.hide(item('appliedenergistics2:facade'))

mods.jei.removeAndHide(item('appliedenergistics2:material:5'))

// Actually Additions Removals
mods.jei.removeAndHide(item('actuallyadditions:block_battery_box'))
mods.jei.removeAndHide(item('actuallyadditions:block_bio_reactor'))
mods.jei.removeAndHide(item('actuallyadditions:block_tiny_torch'))
mods.jei.removeAndHide(item('actuallyadditions:block_firework_box'))
mods.jei.removeAndHide(item('actuallyadditions:block_smiley_cloud'))
mods.jei.removeAndHide(item('actuallyadditions:block_grinder_double'))
mods.jei.removeAndHide(item('actuallyadditions:block_grinder'))
mods.jei.removeAndHide(item('actuallyadditions:block_furnace_double'))
mods.jei.removeAndHide(item('actuallyadditions:block_inputter'))
mods.jei.removeAndHide(item('actuallyadditions:block_inputter_advanced'))
mods.jei.removeAndHide(item('actuallyadditions:block_fishing_net'))
mods.jei.removeAndHide(item('actuallyadditions:block_oil_generator'))
mods.jei.removeAndHide(item('actuallyadditions:block_fermenting_barrel'))
mods.jei.removeAndHide(item('actuallyadditions:block_compost'))
mods.jei.removeAndHide(item('actuallyadditions:block_energizer'))
mods.jei.removeAndHide(item('actuallyadditions:block_enervator'))
mods.jei.removeAndHide(item('actuallyadditions:block_treasure_chest'))
mods.jei.removeAndHide(item('actuallyadditions:block_heat_collector'))
mods.jei.removeAndHide(item('actuallyadditions:block_item_repairer'))
mods.jei.removeAndHide(item('actuallyadditions:block_greenhouse_glass'))
mods.jei.removeAndHide(item('actuallyadditions:item_misc:18'))
mods.jei.removeAndHide(item('actuallyadditions:item_mining_lens'))
mods.jei.removeAndHide(item('actuallyadditions:item_disenchanting_lens'))
mods.jei.removeAndHide(item('actuallyadditions:item_more_damage_lens'))
mods.jei.removeAndHide(item('actuallyadditions:item_damage_lens'))
mods.jei.removeAndHide(item('actuallyadditions:item_explosion_lens'))
mods.jei.removeAndHide(item('actuallyadditions:item_color_lens'))
//mods.jei.removeAndHide(item('actuallyadditions:item_crate_keeper'))
//mods.jei.removeAndHide(item('actuallyadditions:item_chest_to_crate_upgrade'))
//mods.jei.removeAndHide(item('actuallyadditions:item_small_to_medium_crate_upgrade'))
//mods.jei.removeAndHide(item('actuallyadditions:item_medium_to_large_crate_upgrade'))
mods.jei.removeAndHide(item('actuallyadditions:item_booklet'))
mods.jei.removeAndHide(item('actuallyadditions:item_misc:21'))
mods.jei.removeAndHide(item('actuallyadditions:item_misc:22'))


// Advanced Rocketry Removals
mods.jei.removeAndHide(item('advancedrocketry:charcoallog'))
mods.jei.removeAndHide(item('advancedrocketry:satellitebuilder'))
mods.jei.removeAndHide(item('advancedrocketry:loader'))
mods.jei.removeAndHide(item('advancedrocketry:precisionassemblingmachine'))
mods.jei.removeAndHide(item('advancedrocketry:platepress'))
mods.jei.removeAndHide(item('advancedrocketry:blastbrick'))
mods.jei.removeAndHide(item('advancedrocketry:iquartzcrucible'))
mods.jei.removeAndHide(item('advancedrocketry:crystallizer'))
mods.jei.removeAndHide(item('advancedrocketry:cuttingmachine'))
mods.jei.removeAndHide(item('advancedrocketry:observatory'))
mods.jei.removeAndHide(item('advancedrocketry:blackholegenerator'))
mods.jei.removeAndHide(item('advancedrocketry:concrete'))
mods.jei.removeAndHide(item('advancedrocketry:satellitecontrolcenter'))
mods.jei.removeAndHide(item('advancedrocketry:planetanalyser'))
mods.jei.removeAndHide(item('advancedrocketry:arcfurnace'))
mods.jei.removeAndHide(item('advancedrocketry:sawblade'))
mods.jei.removeAndHide(item('advancedrocketry:lathe'))
mods.jei.removeAndHide(item('advancedrocketry:rollingmachine'))
mods.jei.removeAndHide(item('advancedrocketry:electrolyser'))
mods.jei.removeAndHide(item('advancedrocketry:chemicalreactor'))
mods.jei.removeAndHide(item('advancedrocketry:microwavereciever'))
mods.jei.removeAndHide(item('advancedrocketry:drill'))
mods.jei.removeAndHide(item('advancedrocketry:solarpanel'))
mods.jei.removeAndHide(item('advancedrocketry:biomescanner'))
mods.jei.removeAndHide(item('advancedrocketry:terraformer'))
mods.jei.removeAndHide(item('advancedrocketry:deployablerocketbuilder'))
mods.jei.removeAndHide(item('advancedrocketry:liquidtank'))
mods.jei.removeAndHide(item('advancedrocketry:intake'))
mods.jei.removeAndHide(item('advancedrocketry:solargenerator'))
mods.jei.removeAndHide(item('advancedrocketry:railgun'))
mods.jei.removeAndHide(item('advancedrocketry:blocklens'))
//mods.jei.removeAndHide(item('advancedrocketry:forcefieldprojector'))
mods.jei.removeAndHide(item('advancedrocketry:spaceelevatorcontroller'))
mods.jei.removeAndHide(item('advancedrocketry:beacon'))
mods.jei.removeAndHide(item('advancedrocketry:thermitetorch'))
mods.jei.removeAndHide(item('advancedrocketry:wirelesstransciever'))
//mods.jei.removeAndHide(item('advancedrocketry:spacelaser'))
mods.jei.removeAndHide(item('advancedrocketry:productdust'))
mods.jei.removeAndHide(item('advancedrocketry:productdust:1'))
mods.jei.removeAndHide(item('advancedrocketry:productingot'))
mods.jei.removeAndHide(item('advancedrocketry:productingot:1'))
mods.jei.removeAndHide(item('advancedrocketry:productnugget'))
mods.jei.removeAndHide(item('advancedrocketry:productnugget:1'))
mods.jei.removeAndHide(item('advancedrocketry:productplate'))
mods.jei.removeAndHide(item('advancedrocketry:productplate:1'))
mods.jei.removeAndHide(item('advancedrocketry:productrod:1'))
mods.jei.removeAndHide(item('advancedrocketry:productrod'))
mods.jei.removeAndHide(item('advancedrocketry:productsheet'))
mods.jei.removeAndHide(item('advancedrocketry:productsheet:1'))
mods.jei.removeAndHide(item('advancedrocketry:productgear'))
mods.jei.removeAndHide(item('advancedrocketry:productgear:1'))
mods.jei.removeAndHide(item('advancedrocketry:metal0'))
mods.jei.removeAndHide(item('advancedrocketry:metal0:1'))
mods.jei.removeAndHide(item('advancedrocketry:orescanner'))
mods.jei.removeAndHide(item('advancedrocketry:satellitepowersource'))
mods.jei.removeAndHide(item('advancedrocketry:satellitepowersource:1'))
mods.jei.removeAndHide(item('advancedrocketry:itemcircuitplate'))
mods.jei.removeAndHide(item('advancedrocketry:itemcircuitplate:1'))
mods.jei.removeAndHide(item('advancedrocketry:ic'))
mods.jei.removeAndHide(item('advancedrocketry:ic:2'))
mods.jei.removeAndHide(item('advancedrocketry:ic:3'))
mods.jei.removeAndHide(item('advancedrocketry:ic:5'))
mods.jei.removeAndHide(item('advancedrocketry:ic:4'))
mods.jei.removeAndHide(item('advancedrocketry:wafer'))
mods.jei.removeAndHide(item('advancedrocketry:dataunit'))
mods.jei.removeAndHide(item('advancedrocketry:satellite'))
mods.jei.removeAndHide(item('advancedrocketry:misc'))
mods.jei.removeAndHide(item('advancedrocketry:misc:1'))
mods.jei.removeAndHide(item('advancedrocketry:sawbladeiron'))
mods.jei.removeAndHide(item('advancedrocketry:jackhammer'))
mods.jei.removeAndHide(item('advancedrocketry:asteroidchip'))
mods.jei.removeAndHide(item('advancedrocketry:elevatorchip'))
// mods.jei.removeAndHide(item('advancedrocketry:lens'))
mods.jei.removeAndHide(item('advancedrocketry:basiclasergun'))
mods.jei.removeAndHide(item('advancedrocketry:beaconfinder'))
mods.jei.removeAndHide(item('advancedrocketry:thermite'))
mods.jei.removeAndHide(item('advancedrocketry:unlittorch'))
mods.jei.removeAndHide(item('libvulpes:productboule:3'))


// Armor Plus Removals
mods.jei.removeAndHide(item('armorplus:workbench'))
mods.jei.removeAndHide(item('armorplus:high_tech_bench'))
mods.jei.removeAndHide(item('armorplus:ulti_tech_bench'))
mods.jei.removeAndHide(item('armorplus:champion_bench'))
mods.jei.removeAndHide(item('armorplus:ore_lava_crystal'))
mods.jei.removeAndHide(item('armorplus:steel_block'))
mods.jei.removeAndHide(item('armorplus:electrical_block'))
mods.jei.removeAndHide(item('armorplus:lava_nether_brick'))
mods.jei.removeAndHide(item('armorplus:lava_cactus'))
mods.jei.removeAndHide(item('armorplus:lava_infuser'))
mods.jei.removeAndHide(item('armorplus:lava_infuser_infusing'))
mods.jei.removeAndHide(item('armorplus:lava_crystal'))
mods.jei.removeAndHide(item('armorplus:the_gift_of_the_gods'))
mods.jei.removeAndHide(item('armorplus:block_lava_crystal'))
mods.jei.removeAndHide(item('armorplus:block_compressed_lava_crystal'))
mods.jei.removeAndHide(item('armorplus:book'))
mods.jei.removeAndHide(item('armorplus:steel_ingot'))
mods.jei.removeAndHide(item('armorplus:electrical_ingot'))
mods.jei.removeAndHide(item('armorplus:redstone_apple'))
mods.jei.removeAndHide(item('armorplus:redstone_apple:1'))
mods.jei.removeAndHide(item('armorplus:dev_tool'))
mods.jei.removeAndHide(item('armorplus:material'))
mods.jei.removeAndHide(item('armorplus:tower_spawn_item'))
mods.jei.removeAndHide(item('armorplus:ender_dungeon_floor_1_spawn_item'))
mods.jei.removeAndHide(item('armorplus:chicken_helmet'))
mods.jei.removeAndHide(item('armorplus:chicken_chestplate'))
mods.jei.removeAndHide(item('armorplus:chicken_leggings'))
mods.jei.removeAndHide(item('armorplus:chicken_boots'))
mods.jei.removeAndHide(item('armorplus:slime_helmet'))
mods.jei.removeAndHide(item('armorplus:slime_chestplate'))
mods.jei.removeAndHide(item('armorplus:slime_boots'))
mods.jei.removeAndHide(item('armorplus:slime_leggings'))
mods.jei.removeAndHide(item('armorplus:pig_iron_helmet'))
mods.jei.removeAndHide(item('armorplus:pig_iron_chestplate'))
mods.jei.removeAndHide(item('armorplus:pig_iron_leggings'))
mods.jei.removeAndHide(item('armorplus:pig_iron_boots'))
//mods.jei.removeAndHide(item('armorplus:block_melting_obsidian'))
mods.jei.removeAndHide(item('armorplus:coal_sword'))
mods.jei.removeAndHide(item('armorplus:guardian_bow'))
mods.jei.removeAndHide(item('armorplus:infused_lava_bow'))
mods.jei.removeAndHide(item('armorplus:obsidian_bow'))
mods.jei.removeAndHide(item('armorplus:emerald_bow'))
mods.jei.removeAndHide(item('armorplus:redstone_bow'))
mods.jei.removeAndHide(item('armorplus:coal_bow'))
mods.jei.removeAndHide(item('armorplus:book_lore'))
mods.jei.removeAndHide(item('armorplus:dusk'))
mods.jei.removeAndHide(item('armorplus:noon'))
mods.jei.removeAndHide(item('armorplus:midnight'))
mods.jei.removeAndHide(item('armorplus:dawn'))
mods.jei.removeAndHide(item('armorplus:map_of_overworld'))
mods.jei.removeAndHide(item('armorplus:map_of_the_nether'))
mods.jei.removeAndHide(item('armorplus:map_of_the_end'))
mods.jei.removeAndHide(item('armorplus:map_of_sacrifice'))
mods.jei.removeAndHide(item('armorplus:map_of_the_realm'))
mods.jei.removeAndHide(item('armorplus:map_of_arena'))
mods.jei.removeAndHide(item('armorplus:map_of_the_shaper'))
mods.jei.removeAndHide(item('armorplus:map_of_the_elder'))
mods.jei.removeAndHide(item('minecraft:spawn_egg').withNbt(['id': "armorplus:ender_dragon_zombie"]))
mods.jei.removeAndHide(item('minecraft:spawn_egg').withNbt(['id': "armorplus:ice_golem"]))
mods.jei.removeAndHide(item('minecraft:spawn_egg').withNbt(['id': "armorplus:overlord_of_the_guardians"]))
mods.jei.removeAndHide(item('minecraft:spawn_egg').withNbt(['id': "armorplus:skeletal_king"]))
mods.jei.removeAndHide(item('minecraft:spawn_egg').withNbt(['id': "armorplus:witherling"]))
mods.jei.removeAndHide(item('minecraft:spawn_egg').withNbt(['id': "armorplus:demonic_dragon"]))
mods.jei.removeAndHide(item('armorplus:white_stone_brick'))
mods.jei.removeAndHide(item('armorplus:red_stone_brick'))
mods.jei.removeAndHide(item('armorplus:black_stone_brick'))
mods.jei.removeAndHide(item('armorplus:blue_stone_brick'))
mods.jei.removeAndHide(item('armorplus:green_stone_brick'))
mods.jei.removeAndHide(item('armorplus:purple_stone_brick'))
mods.jei.removeAndHide(item('armorplus:yellow_stone_brick'))
mods.jei.removeAndHide(item('armorplus:white_stone_brick_tower'))
mods.jei.removeAndHide(item('armorplus:red_stone_brick_tower'))
mods.jei.removeAndHide(item('armorplus:black_stone_brick_tower'))
mods.jei.removeAndHide(item('armorplus:blue_stone_brick_tower'))
mods.jei.removeAndHide(item('armorplus:green_stone_brick_tower'))
mods.jei.removeAndHide(item('armorplus:yellow_stone_brick_tower'))
mods.jei.removeAndHide(item('armorplus:purple_stone_brick_tower'))
mods.jei.removeAndHide(item('armorplus:white_stone_brick_corner'))
mods.jei.removeAndHide(item('armorplus:red_stone_brick_corner'))
mods.jei.removeAndHide(item('armorplus:black_stone_brick_corner'))
mods.jei.removeAndHide(item('armorplus:blue_stone_brick_corner'))
mods.jei.removeAndHide(item('armorplus:green_stone_brick_corner'))
mods.jei.removeAndHide(item('armorplus:yellow_stone_brick_corner'))
mods.jei.removeAndHide(item('armorplus:purple_stone_brick_corner'))
mods.jei.removeAndHide(item('armorplus:white_stone_brick_wall'))
mods.jei.removeAndHide(item('armorplus:red_stone_brick_wall'))
mods.jei.removeAndHide(item('armorplus:black_stone_brick_wall'))
mods.jei.removeAndHide(item('armorplus:blue_stone_brick_wall'))
mods.jei.removeAndHide(item('armorplus:green_stone_brick_wall'))
mods.jei.removeAndHide(item('armorplus:yellow_stone_brick_wall'))
mods.jei.removeAndHide(item('armorplus:purple_stone_brick_wall'))
mods.jei.removeAndHide(item('armorplus:chainmail_helmet'))
mods.jei.removeAndHide(item('armorplus:chainmail_chestplate'))
mods.jei.removeAndHide(item('armorplus:chainmail_leggings'))
mods.jei.removeAndHide(item('armorplus:chainmail_boots'))
mods.jei.removeAndHide(item('armorplus:iron_helmet'))
mods.jei.removeAndHide(item('armorplus:iron_chestplate'))
mods.jei.removeAndHide(item('armorplus:iron_leggings'))
mods.jei.removeAndHide(item('armorplus:iron_boots'))
mods.jei.removeAndHide(item('armorplus:gold_helmet'))
mods.jei.removeAndHide(item('armorplus:gold_chestplate'))
mods.jei.removeAndHide(item('armorplus:gold_leggings'))
mods.jei.removeAndHide(item('armorplus:gold_boots'))
mods.jei.removeAndHide(item('armorplus:diamond_helmet'))
mods.jei.removeAndHide(item('armorplus:diamond_chestplate'))
mods.jei.removeAndHide(item('armorplus:diamond_leggings'))
mods.jei.removeAndHide(item('armorplus:diamond_boots'))
mods.jei.removeAndHide(item('armorplus:trophy'))
mods.jei.removeAndHide(item('armorplus:pig_trophy'))
mods.jei.removeAndHide(item('armorplus:sheep_trophy'))
mods.jei.removeAndHide(item('armorplus:cow_trophy'))
mods.jei.removeAndHide(item('armorplus:chicken_trophy'))
mods.jei.removeAndHide(item('armorplus:horse_trophy'))
mods.jei.removeAndHide(item('armorplus:rabbit_trophy'))
mods.jei.removeAndHide(item('armorplus:bat_trophy'))
mods.jei.removeAndHide(item('armorplus:ocelot_trophy'))
mods.jei.removeAndHide(item('armorplus:parrot_trophy'))
mods.jei.removeAndHide(item('armorplus:polar_bear_trophy'))
mods.jei.removeAndHide(item('armorplus:wolf_trophy'))
mods.jei.removeAndHide(item('armorplus:creeper_trophy'))
mods.jei.removeAndHide(item('armorplus:blaze_trophy'))
mods.jei.removeAndHide(item('armorplus:spider_trophy'))
mods.jei.removeAndHide(item('armorplus:cave_spider_trophy'))
mods.jei.removeAndHide(item('armorplus:guardian_trophy'))
mods.jei.removeAndHide(item('armorplus:zombie_trophy'))
mods.jei.removeAndHide(item('armorplus:enderman_trophy'))
mods.jei.removeAndHide(item('armorplus:endermite_trophy'))
mods.jei.removeAndHide(item('armorplus:stray_trophy'))
mods.jei.removeAndHide(item('armorplus:evoker_trophy'))
mods.jei.removeAndHide(item('armorplus:vex_trophy'))
mods.jei.removeAndHide(item('armorplus:vindicator_trophy'))
mods.jei.removeAndHide(item('armorplus:ghast_trophy'))
mods.jei.removeAndHide(item('armorplus:husk_trophy'))
mods.jei.removeAndHide(item('armorplus:shulker_trophy'))
mods.jei.removeAndHide(item('armorplus:magma_cube_trophy'))
mods.jei.removeAndHide(item('armorplus:silverfish_trophy'))
mods.jei.removeAndHide(item('armorplus:skeleton_trophy'))
mods.jei.removeAndHide(item('armorplus:witch_trophy'))
mods.jei.removeAndHide(item('armorplus:zombie_villager_trophy'))
mods.jei.removeAndHide(item('armorplus:zombie_pigman_trophy'))
mods.jei.removeAndHide(item('armorplus:wither_skeleton_trophy'))
mods.jei.removeAndHide(item('armorplus:slime_trophy'))
mods.jei.removeAndHide(item('armorplus:elder_guardian_trophy'))
mods.jei.removeAndHide(item('armorplus:wither_boss_trophy'))
mods.jei.removeAndHide(item('armorplus:ender_dragon_trophy'))
mods.jei.removeAndHide(item('armorplus:skeletal_king_trophy'))
mods.jei.removeAndHide(item('armorplus:guardian_overlord_trophy'))
mods.jei.removeAndHide(item('armorplus:demonic_dragon_trophy'))
mods.jei.removeAndHide(item('armorplus:the_lord_of_everything_trophy'))
mods.jei.removeAndHide(item('armorplus:coal_sword_display'))
mods.jei.removeAndHide(item('armorplus:lapis_sword_display'))
mods.jei.removeAndHide(item('armorplus:redstone_sword_display'))
mods.jei.removeAndHide(item('armorplus:emerald_sword_display'))
mods.jei.removeAndHide(item('armorplus:obsidian_sword_display'))
mods.jei.removeAndHide(item('armorplus:infused_lava_sword_display'))
mods.jei.removeAndHide(item('armorplus:guardian_sword_display'))
mods.jei.removeAndHide(item('armorplus:super_star_sword_display'))
mods.jei.removeAndHide(item('armorplus:ender_dragon_sword_display'))
mods.jei.removeAndHide(item('armorplus:empty_sword_display'))
mods.jei.removeAndHide(item('armorplus:emerald_arrow'))
mods.jei.removeAndHide(item('armorplus:obsidian_arrow'))
mods.jei.removeAndHide(item('armorplus:guardian_arrow'))
mods.jei.removeAndHide(item('armorplus:super_star_arrow'))
mods.jei.removeAndHide(item('armorplus:coal_battle_axe'))
mods.jei.removeAndHide(item('armorplus:lapis_battle_axe'))
mods.jei.removeAndHide(item('armorplus:redstone_battle_axe'))
mods.jei.removeAndHide(item('armorplus:emerald_battle_axe'))
mods.jei.removeAndHide(item('armorplus:obsidian_battle_axe'))
mods.jei.removeAndHide(item('armorplus:infused_lava_battle_axe'))
mods.jei.removeAndHide(item('armorplus:guardian_battle_axe'))
mods.jei.removeAndHide(item('armorplus:super_star_battle_axe'))
mods.jei.removeAndHide(item('armorplus:coal_pickaxe'))
mods.jei.removeAndHide(item('armorplus:lapis_pickaxe'))
mods.jei.removeAndHide(item('armorplus:redstone_pickaxe'))
mods.jei.removeAndHide(item('armorplus:emerald_pickaxe'))
mods.jei.removeAndHide(item('armorplus:obsidian_pickaxe'))
mods.jei.removeAndHide(item('armorplus:infused_lava_pickaxe'))
mods.jei.removeAndHide(item('armorplus:guardian_pickaxe'))
mods.jei.removeAndHide(item('armorplus:super_star_pickaxe'))
mods.jei.removeAndHide(item('armorplus:ender_dragon_pickaxe'))


//Avaritia Removals
mods.jei.removeAndHide(item('avaritia:resource:7'))
mods.jei.removeAndHide(item('avaritia:singularity'))
mods.jei.removeAndHide(item('avaritia:singularity:1'))
mods.jei.removeAndHide(item('avaritia:singularity:2'))
mods.jei.removeAndHide(item('avaritia:singularity:3'))
mods.jei.removeAndHide(item('avaritia:singularity:4'))
mods.jei.removeAndHide(item('avaritia:singularity:5'))
mods.jei.removeAndHide(item('avaritia:singularity:6'))
mods.jei.removeAndHide(item('avaritia:singularity:7'))
mods.jei.removeAndHide(item('avaritia:singularity:8'))
mods.jei.removeAndHide(item('avaritia:singularity:9'))
mods.jei.removeAndHide(item('avaritia:singularity:10'))
mods.jei.removeAndHide(item('avaritia:singularity:11'))
mods.jei.removeAndHide(item('avaritia:singularity:12'))
mods.jei.removeAndHide(item('avaritia:singularity:13'))
mods.jei.removeAndHide(item('avaritia:singularity:14'))
mods.jei.removeAndHide(item('avaritia:infinity_bow'))
mods.jei.removeAndHide(item('avaritia:infinity_pickaxe'))
mods.jei.removeAndHide(item('avaritia:infinity_shovel'))
mods.jei.removeAndHide(item('avaritia:infinity_axe'))
mods.jei.removeAndHide(item('avaritia:infinity_hoe'))
mods.jei.removeAndHide(item('avaritia:endest_pearl'))
mods.jei.removeAndHide(item('avaritia:ultimate_stew'))
mods.jei.removeAndHide(item('avaritia:cosmic_meatballs'))
mods.jei.removeAndHide(item('avaritia:double_compressed_crafting_table'))
mods.jei.removeAndHide(item('avaritia:extreme_crafting_table'))
mods.jei.removeAndHide(item('avaritia:neutron_collector'))
mods.jei.removeAndHide(item('avaritia:neutronium_compressor'))
mods.jei.removeAndHide(item('avaritia:matter_cluster'))


//Deep Mob Evolution Removals
mods.jei.removeAndHide(item('deepmoblearning:soot_covered_plate'))
mods.jei.removeAndHide(item('deepmoblearning:soot_covered_redstone'))

// Draconic Evolution Removals
mods.jei.removeAndHide(item('draconicevolution:draconium_ore:*'))

//EnderIO Removals
mods.jei.removeAndHide(item('enderio:item_material:28'))
mods.jei.removeAndHide(item('enderio:item_material:39'))
mods.jei.removeAndHide(item('enderio:item_material:72'))
mods.jei.removeAndHide(item('enderio:block_simple_furnace'))
mods.jei.removeAndHide(item('enderio:block_simple_alloy_smelter'))
mods.jei.removeAndHide(item('enderio:block_alloy_smelter'))
mods.jei.removeAndHide(item('enderio:block_enhanced_alloy_smelter'))
mods.jei.removeAndHide(item('enderio:block_buffer:3'))
mods.jei.removeAndHide(item('enderio:block_combustion_generator'))
mods.jei.removeAndHide(item('enderio:block_enhanced_combustion_generator'))
mods.jei.removeAndHide(item('enderio:block_simple_stirling_generator'))
mods.jei.removeAndHide(item('enderio:block_stirling_generator'))
mods.jei.removeAndHide(item('enderio:block_lava_generator'))
mods.jei.removeAndHide(item('enderio:block_simple_sag_mill'))
mods.jei.removeAndHide(item('enderio:item_ender_food'))
mods.jei.removeAndHide(item('enderio:block_sag_mill'))
mods.jei.removeAndHide(item('enderio:block_enhanced_sag_mill'))
mods.jei.removeAndHide(item('enderio:block_solar_panel'))
mods.jei.removeAndHide(item('enderio:block_solar_panel:1'))
mods.jei.removeAndHide(item('enderio:block_solar_panel:2'))
mods.jei.removeAndHide(item('enderio:block_solar_panel:3'))
mods.jei.removeAndHide(item('enderio:block_solar_panel:4'))
mods.jei.removeAndHide(item('enderio:block_solar_panel:5'))
mods.jei.removeAndHide(item('enderio:block_solar_panel:6'))
mods.jei.removeAndHide(item('extrautils2:user'))
mods.jei.removeAndHide(item('extrautils2:contract'))
mods.jei.removeAndHide(item('enderio:block_cap_bank'))
mods.jei.removeAndHide(item('enderio:item_capacitor_grainy'))
mods.jei.removeAndHide(item('enderio:item_capacitor_stellar'))
mods.jei.removeAndHide(item('enderio:item_capacitor_melodic'))
mods.jei.removeAndHide(item('enderio:item_capacitor_crystalline'))
mods.jei.removeAndHide(item('enderio:item_capacitor_silver'))
mods.jei.removeAndHide(item('enderio:item_capacitor_energetic_silver'))
mods.jei.removeAndHide(item('enderio:item_capacitor_vivid'))
mods.jei.removeAndHide(item('enderio:block_creative_spawner'))
mods.jei.removeAndHide(item('enderio:block_simple_crafter'))
mods.jei.removeAndHide(item('enderio:block_simple_wired_charger'))
mods.jei.removeAndHide(item('enderio:block_infinity_fog'))
//mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderiointegrationforestry:apiarist_armor_head", "enderio:enabled": 1 as byte]))
//mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderiointegrationforestry:apiarist_armor_feet", "enderio:enabled": 1 as byte]))
//mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderiointegrationforestry:naturalist_eye", "enderio:enabled": 1 as byte]))
//mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderiointegrationforestry:apiarist_armor_legs", "enderio:enabled": 1 as byte]))
mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderio:top"]))
mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderio:top", "enderio:enabled": 1 as byte]))
//mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderiointegrationforestry:apiarist_armor_chest"]))
//mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderiointegrationforestry:apiarist_armor_chest", "enderio:enabled": 1 as byte]))
//mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderiointegrationforestry:apiarist_armor_head"]))
//mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderiointegrationforestry:apiarist_armor_legs"]))
//mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderiointegrationforestry:naturalist_eye"]))
//mods.jei.removeAndHide(item('enderio:item_dark_steel_upgrade:1').withNbt(["enderio:dsu": "enderiointegrationforestry:apiarist_armor_feet"]))
mods.jei.removeAndHide(item('enderio:item_capacitor_totemic'))
mods.jei.removeAndHide(item('enderio:item_material:40'))
mods.jei.removeAndHide(item('enderio:item_material:81'))
mods.jei.removeAndHide(item('enderio:block_death_pouch'))


//Extended Crafting Removals
mods.jei.removeAndHide(item('extendedcrafting:storage:7'))
mods.jei.removeAndHide(item('extendedcrafting:ender_alternator'))
mods.jei.removeAndHide(item('extendedcrafting:ender_crafter'))
mods.jei.removeAndHide(item('extendedcrafting:material:36'))
mods.jei.removeAndHide(item('extendedcrafting:material:37'))
mods.jei.removeAndHide(item('extendedcrafting:material:41'))
mods.jei.removeAndHide(item('extendedcrafting:material:48'))
mods.jei.removeAndHide(item('extendedcrafting:material:128'))
mods.jei.removeAndHide(item('extendedcrafting:material:2'))
mods.jei.removeAndHide(item('extendedcrafting:singularity'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:1'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:2'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:3'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:4'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:5'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:6'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:7'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:16'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:17'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:18'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:19'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:20'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:21'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:22'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:23'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:24'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:25'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:26'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:66'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:65'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:64'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:50'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:49'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:48'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:35'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:34'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:33'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:32'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:31'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:30'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:29'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:28'))
mods.jei.removeAndHide(item('extendedcrafting:singularity:27'))


//Extra Utils 2 Removals
mods.jei.removeAndHide(item('extrautils2:itemcreativedestructionwand'))
mods.jei.removeAndHide(item('extrautils2:itemcreativebuilderswand'))
mods.jei.removeAndHide(item('extrautils2:machine').withNbt(['Type': "extrautils2:furnace"]))
mods.jei.removeAndHide(item('extrautils2:machine').withNbt(['Type': "extrautils2:crusher"]))
mods.jei.removeAndHide(item('extrautils2:creativeharvest'))
mods.jei.removeAndHide(item('extrautils2:book'))
mods.jei.removeAndHide(item('extrautils2:minichest'))
mods.jei.removeAndHide(item('extrautils2:analogcrafter'))

// Wireless Terminals Removals
mods.jei.removeAndHide(item('ae2wtlib:infinity_booster_card'))
mods.jei.removeAndHide(item('wct:wct'))
mods.jei.removeAndHide(item('wct:wct_creative'))
mods.jei.removeAndHide(item('wct:magnet_card'))

//Gregtech Removals
mods.jei.removeAndHide(metaitem('world_accelerator.lv'))
mods.jei.removeAndHide(metaitem('world_accelerator.mv'))
mods.jei.removeAndHide(metaitem('world_accelerator.luv'))
mods.jei.removeAndHide(metaitem('world_accelerator.zpm'))
mods.jei.removeAndHide(metaitem('world_accelerator.uv'))
mods.jei.removeAndHide(metaitem('gcym:tiered_hatch.ulv'))
mods.jei.removeAndHide(metaitem('gcym:tiered_hatch.lv'))
mods.jei.removeAndHide(metaitem('gcym:tiered_hatch.mv'))
mods.jei.removeAndHide(metaitem('gcym:tiered_hatch.hv'))
mods.jei.removeAndHide(metaitem('gcym:tiered_hatch.ev'))
mods.jei.removeAndHide(metaitem('gcym:tiered_hatch.iv'))
mods.jei.removeAndHide(metaitem('gcym:tiered_hatch.luv'))
mods.jei.removeAndHide(metaitem('gcym:tiered_hatch.zpm'))
mods.jei.removeAndHide(metaitem('gcym:tiered_hatch.uv'))
mods.jei.removeAndHide(metaitem('gcym:tiered_hatch.uhv'))
//mods.jei.removeAndHide(item('meta_tile_entity:amplifab.lv'))
//mods.jei.removeAndHide(item('meta_tile_entity:amplifab.mv'))
//mods.jei.removeAndHide(item('meta_tile_entity:amplifab.hv'))
//mods.jei.removeAndHide(item('meta_tile_entity:amplifab.ev'))
//mods.jei.removeAndHide(item('meta_tile_entity:arc_furnace.lv'))
//mods.jei.removeAndHide(item('meta_tile_entity:arc_furnace.mv'))
//mods.jei.removeAndHide(item('meta_tile_entity:arc_furnace.hv'))
//mods.jei.removeAndHide(item('meta_tile_entity:arc_furnace.ev'))
//mods.jei.removeAndHide(item('meta_tile_entity:bender.lv'))
//mods.jei.removeAndHide(item('meta_tile_entity:bender.mv'))
//mods.jei.removeAndHide(item('meta_tile_entity:bender.hv'))
//mods.jei.removeAndHide(item('meta_tile_entity:bender.ev'))
//mods.jei.removeAndHide(item('meta_tile_entity:distillery.hv'))
//mods.jei.removeAndHide(item('meta_tile_entity:electromagnetic_separator.lv'))
//mods.jei.removeAndHide(item('meta_tile_entity:electromagnetic_separator.mv'))
//mods.jei.removeAndHide(item('meta_tile_entity:electromagnetic_separator.hv'))
//mods.jei.removeAndHide(item('meta_tile_entity:electromagnetic_separator.ev'))
//mods.jei.removeAndHide(item('meta_tile_entity:magic_energy_absorber'))
//mods.jei.removeAndHide(item('meta_tile_entity:primitive_blast_furnace.bronze'))
//mods.jei.removeAndHide(item('meta_tile_entity:cracker'))
//mods.jei.removeAndHide(item('meta_tile_entity:coke_oven_hatch'))
//mods.jei.removeAndHide(item('meta_tile_entity:coke_oven'))
//mods.jei.removeAndHide(item('meta_tile_entity:tesla_coil'))
//mods.jei.removeAndHide(<meta_tile_entity:ceu.ulv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.ulv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.ulv.4>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.ulv.4>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.ulv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.ulv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.ulv.16>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.ulv.16>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.lv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.lv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.lv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.lv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.mv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.mv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.mv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.mv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.hv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.hv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.hv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.hv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.ev.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.ev.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.ev.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.ev.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.iv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.iv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.iv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.iv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.luv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.luv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.luv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.luv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.zpm.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.zpm.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.zpm.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.zpm.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.max.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.max.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.max.4>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.max.4>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.max.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.max.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.max.16>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.max.16>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uhv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uhv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uhv.4>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uhv.4>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uhv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uhv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uhv.16>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uhv.16>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uev.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uev.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uev.4>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uev.4>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uev.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uev.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uev.16>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uev.16>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uiv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uiv.1>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uiv.4>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uiv.4>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uiv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uiv.9>)
//mods.jei.removeAndHide(<meta_tile_entity:ceu.uiv.16>)
//mods.jei.removeAndHide(<meta_tile_entity:cef.uiv.16>)
//mods.jei.removeAndHide(item('meta_tile_entity:fe_emitter'))
//mods.jei.removeAndHide(item('meta_tile_entity:fe_receiver'))
//mods.jei.removeAndHide(item('meta_tile_entity:gteu_emitter'))
//mods.jei.removeAndHide(item('gregtech:machine:10645'))
//mods.jei.removeAndHide(item('gregtech:machine:10644'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:electric_furnace.iv'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:electric_furnace.luv'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:electric_furnace.zpm'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:electric_furnace.uv'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:electromagnetic_separator.iv'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:electromagnetic_separator.luv'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:electromagnetic_separator.zpm'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:electromagnetic_separator.uv'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:naquadah_reactor.mk1'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:naquadah_reactor.mk2'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:naquadah_reactor.mk3'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:mass_fab.lv'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:mass_fab.mv'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:mass_fab.hv'))
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:mass_fab.ev'))
//mods.jei.removeAndHide(<meta_tile_entity:gtadditions:replicator.lv>)
//mods.jei.removeAndHide(<meta_tile_entity:gtadditions:replicator.mv>)
//mods.jei.removeAndHide(<meta_tile_entity:gtadditions:replicator.hv>)
//mods.jei.removeAndHide(<meta_tile_entity:gtadditions:replicator.ev>)
//mods.jei.removeAndHide(item('meta_tile_entity:gtadditions:naquadah_reactor.mk4'))
//mods.jei.removeAndHide(item('meta_tile_entity:gteu_receiver'))
//mods.jei.removeAndHide(item('gregtech:metal_casing:8'))
//mods.jei.removeAndHide(item('meta_tile_entity:forge_hammer.lv'))
//mods.jei.removeAndHide(item('meta_tile_entity:forge_hammer.mv'))
//mods.jei.removeAndHide(item('meta_tile_entity:forge_hammer.hv'))
//mods.jei.removeAndHide(item('meta_tile_entity:forge_hammer.ev'))
//mods.jei.removeAndHide(item('meta_tile_entity:microwave.lv'))
//mods.jei.removeAndHide(item('meta_tile_entity:microwave.mv'))
//mods.jei.removeAndHide(item('meta_tile_entity:microwave.hv'))
//mods.jei.removeAndHide(item('meta_tile_entity:microwave.ev'))
mods.jei.removeAndHide(metaitem('gearWood'))
//mods.jei.removeAndHide(metaitem('lensAlmandine'))
//mods.jei.removeAndHide(metaitem('lensGreenSapphire'))
//mods.jei.removeAndHide(metaitem('lensRutile'))
//mods.jei.removeAndHide(metaitem('lensSapphire'))
//mods.jei.removeAndHide(metaitem('lensTopaz'))
//mods.jei.removeAndHide(metaitem('lensJasper'))
//mods.jei.removeAndHide(metaitem('lensOlivine'))
//mods.jei.removeAndHide(metaitem('lensOpal'))
//mods.jei.removeAndHide(metaitem('lensLapis'))
//mods.jei.removeAndHide(metaitem('lensGarnetRed'))
//mods.jei.removeAndHide(metaitem('lensGarnetYellow'))
//mods.jei.removeAndHide(metaitem('lensVinteum'))
//mods.jei.removeAndHide(item('meta_tile_entity:sifter.lv'))
//mods.jei.removeAndHide(item('meta_tile_entity:sifter.mv'))
//mods.jei.removeAndHide(item('meta_tile_entity:sifter.hv'))
//mods.jei.removeAndHide(item('meta_tile_entity:sifter.ev'))
//mods.jei.removeAndHide(metaitem('tool.dataorb'))
//mods.jei.removeAndHide(metaitem('tool.datastick'))
//mods.jei.removeAndHide(metaitem('plate.nand_memory_chip'))
//mods.jei.removeAndHide(metaitem('wafer.nand_memory_chip'))
//mods.jei.removeAndHide(metaitem('plate.nor_memory_chip'))
//mods.jei.removeAndHide(metaitem('wafer.nor_memory_chip'))
//mods.jei.removeAndHide(item('gregtech:meta_armor'))
//mods.jei.removeAndHide(metaitem('energy_field_projector'))
//mods.jei.removeAndHide(item('meta_tile_entity:armor_table'))
//mods.jei.removeAndHide(item('gregtech:cable:9354'))
//mods.jei.removeAndHide(item('gregtech:cable:8354'))
//mods.jei.removeAndHide(item('gregtech:cable:7354'))
//mods.jei.removeAndHide(item('gregtech:cable:6354'))
//mods.jei.removeAndHide(item('gregtech:cable:5354'))
//mods.jei.removeAndHide(metaitem('schematic.dust'))
//mods.jei.removeAndHide(metaitem('schematic.3by3'))
//mods.jei.removeAndHide(metaitem('schematic.2by2'))
//mods.jei.removeAndHide(metaitem('schematic'))
//mods.jei.removeAndHide(metaitem('stemcells'))
//mods.jei.removeAndHide(metaitem('jackhammer_base'))
//mods.jei.removeAndHide(metaitem('springTitanium'))
//mods.jei.removeAndHide(item('gregtech:meta_tool:32').withNbt(["GT.ToolStats": [Material: "darmstadtium"]]))
//mods.jei.removeAndHide(metaitem('brick.coke'))


//Inspirations Removals
//mods.jei.removeAndHide(item('inspirations:stone_crook'))
//mods.jei.removeAndHide(item('inspirations:wither_crook'))

//More Furnaces Removals
mods.jei.removeAndHide(item('morefurnaces:upgrade'))
mods.jei.removeAndHide(item('morefurnaces:upgrade:1'))
mods.jei.removeAndHide(item('morefurnaces:upgrade:2'))
mods.jei.removeAndHide(item('morefurnaces:upgrade:3'))
mods.jei.removeAndHide(item('morefurnaces:upgrade:4'))
mods.jei.removeAndHide(item('morefurnaces:upgrade:5'))
mods.jei.removeAndHide(item('morefurnaces:upgrade:6'))
mods.jei.removeAndHide(item('morefurnaces:upgrade:7'))
mods.jei.removeAndHide(item('morefurnaces:furnaceblock:4'))

//More Plates Removals
mods.jei.removeAndHide(item('moreplates:hammer'))


//Standard Expansion Removals
//mods.jei.removeAndHide(item('bq_standard:loot_chest'))
//mods.jei.removeAndHide(item('bq_standard:loot_chest:25'))
//mods.jei.removeAndHide(item('bq_standard:loot_chest:50'))
//mods.jei.removeAndHide(item('bq_standard:loot_chest:75'))
//mods.jei.removeAndHide(item('bq_standard:loot_chest:100'))
//mods.jei.removeAndHide(item('bq_standard:loot_chest:101'))
//mods.jei.removeAndHide(item('bq_standard:loot_chest:102'))


//Gregic Additions Removals
//mods.jei.removeAndHide(<metaitem:component.petri.dish>)
//mods.jei.removeAndHide(<metaitem:compressed.coke.clay>)


//The One Probe Removals
mods.jei.removeAndHide(item('theoneprobe:iron_helmet_probe'))
mods.jei.removeAndHide(item('theoneprobe:gold_helmet_probe'))
mods.jei.removeAndHide(item('theoneprobe:diamond_helmet_probe'))
//mods.jei.removeAndHide(item('theoneprobe:probenote'))
mods.jei.removeAndHide(item('theoneprobe:creativeprobe'))

// Extended Crafting Removals
mods.jei.removeAndHide(item('extendedcrafting:crafting_table'))


//Thermal Removals
mods.jei.removeAndHide(item('thermalexpansion:satchel:32000'))
mods.jei.removeAndHide(item('thermalexpansion:frame:129'))
mods.jei.removeAndHide(item('thermalfoundation:upgrade:256'))
mods.jei.removeAndHide(item('thermalfoundation:material:23'))
mods.jei.removeAndHide(item('thermalfoundation:material:27'))
mods.jei.removeAndHide(item('thermalfoundation:material:802'))
mods.jei.removeAndHide(item('thermalfoundation:material:801'))
mods.jei.removeAndHide(item('thermalfoundation:material:657'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_silver'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_lead'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_aluminum'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_nickel'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_electrum'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_invar'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_copper'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_tin'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_platinum'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_steel'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_bronze'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_stone'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_iron'))
mods.jei.removeAndHide(item('thermalfoundation:tool.hammer_diamond'))
mods.jei.removeAndHide(item('thermalfoundation:rockwool:*'))
mods.jei.removeAndHide(item('thermalfoundation:material:864'))
mods.jei.removeAndHide(item('thermalfoundation:material:865'))
mods.jei.removeAndHide(item('thermalfoundation:ore:*'))
mods.jei.removeAndHide(item('thermalfoundation:ore_fluid:*'))
mods.jei.removeAndHide(item('thermalfoundation:glass:*'))
mods.jei.removeAndHide(item('thermalfoundation:glass_alloy:*'))
mods.jei.removeAndHide(item('thermalfoundation:dye:*'))


//Custom Materials Removals
//3 Thermal Alloys (nugget, block, ingot, dust)
//mods.jei.removeAndHide(metaitem('nuggetLumium'))
//mods.jei.removeAndHide(metaitem('nuggetSignalum'))
//mods.jei.removeAndHide(metaitem('nuggetEnderium'))
//mods.jei.removeAndHide(metaitem('blockLumium'))
//mods.jei.removeAndHide(metaitem('blockSignalum'))
//mods.jei.removeAndHide(metaitem('blockEnderium'))

//Lib Vulpes Removals
mods.jei.removeAndHide(item('libvulpes:gtplug'))
mods.jei.removeAndHide(item('libvulpes:blockphantom'))
mods.jei.removeAndHide(item('libvulpes:placeholder'))
mods.jei.removeAndHide(item('libvulpes:coalgenerator'))
mods.jei.removeAndHide(item('libvulpes:motor'))
mods.jei.removeAndHide(item('libvulpes:advancedmotor'))
mods.jei.removeAndHide(item('libvulpes:enhancedmotor'))
mods.jei.removeAndHide(item('libvulpes:elitemotor'))
mods.jei.removeAndHide(item('libvulpes:coil0:2'))
mods.jei.removeAndHide(item('libvulpes:coil0:4'))
mods.jei.removeAndHide(item('libvulpes:coil0:7'))
mods.jei.removeAndHide(item('libvulpes:coil0:9'))
mods.jei.removeAndHide(item('libvulpes:coil0:10'))
mods.jei.removeAndHide(item('libvulpes:battery'))
mods.jei.removeAndHide(item('libvulpes:battery:1'))
mods.jei.removeAndHide(item('libvulpes:productfan:6'))
mods.jei.removeAndHide(item('libvulpes:productsheet:9'))
mods.jei.removeAndHide(item('libvulpes:productsheet:7'))
mods.jei.removeAndHide(item('libvulpes:productsheet:6'))
mods.jei.removeAndHide(item('libvulpes:productsheet:4'))
mods.jei.removeAndHide(item('libvulpes:productsheet:1'))

// Better Questing Removals
mods.jei.removeAndHide(item('betterquesting:extra_life'))
mods.jei.removeAndHide(item('betterquesting:extra_life:1'))
mods.jei.removeAndHide(item('betterquesting:extra_life:2'))


//                 XXXXXXXXXX                            XXXXXXXXXX
//              XXXXXXXXXXXXXXX                        XXXXXXXXXXXXXXX
//            XXXXXXXXXXXXX XXXX                      XXXX XXXXXXXXXXXXX
//           XXXXXXXXXXXXX XXXXX                      XXXXX XXXXXXXXXXXXX
//          XXXXXXXXXXXXX XXXXXX                      XXXXXX XXXXXXXXXXXXX
//         XXXXXXXXXXXXXXXXXXXXX                      XXXXXXXXXXXXXXXXXXXXX
//        XXXXXXXXXXXXXXXXXXXXXX                      XXXXXXXXXXXXXXXXXXXXXX
//       XXXXXXXXXXXXXXXXXXXXXX                        XXXXXXXXXXXXXXXXXXXXXX
//       XXXXXXXXXXXXXXXXXXXXX  XXXXX            XXXXX  XXXXXXXXXXXXXXXXXXXXX
//      XXXXXXXXXXXXXXXXXXXXX  XXXXXXXX        XXXXXXXX  XXXXXXXXXXXXXXXXXXXXX
//      XXXXXXXXXXXXXXXXXXX    XXXXXXXX        XXXXXXXX    XXXXXXXXXXXXXXXXXXX
//      XXXXXXXXXXXXXXXXX      XXXXXXXXX      XXXXXXXXX      XXXXXXXXXXXXXXXXX
//      XXXXXXXXXXXXXXX          XXXXXXXXXXXXXXXXXXXX          XXXXXXXXXXXXXXX
//      XXXXXXXXXXXX          XXXXXXXXXXXXXXXXXXXXXXXXXX          XXXXXXXXXXXX
//      XXXXXXXXXX        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX        XXXXXXXXXX
//       XXXXXXXXXX     XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX     XXXXXXXXXX
//        XXXXXXXXXX  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  XXXXXXXXXX
// XXXX     XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX     XXXX
// XXXXXX    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    XXXXXX
// XXXXXXXX    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    XXXXXXXX
//  XXXXXXXX     XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    XXXXXXXX
//   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//       XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// XXXXXXXXX  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  XXXXXXXXX
// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// XXXXXXXXXXXXXXXXXXX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    XXXXXXXXXXXXXX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX XXXXXXXXXXXXXX
//         XXX    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    XXX
//            XXXXXXXXXXXX  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  XXXXXXXXXXX
//       XXXXXXXXXXXXXXXX  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  XXXXXXXXXXXXXXXX
//    XXXXXXXXXXXXXXXXX   XXXXXXXX     XXXXXXXX     XXXXXXXX   XXXXXXXXXXXXXXXXX
//    XXXXXXXXXXXXXX    XXXXXXXXX                    XXXXXXXXX    XXXXXXXXXXXXXX
//     XXXXXXXXXX      XXXXXXXX                       XXXXXXXXX      XXXXXXXXXX
//                     XXXXXXXX                        XXXXXXXX
//                     XXXXXXXX                        XXXXXXXX
//                      XXXXXXX                        XXXXXXX
//                      XXXXXX                          XXXXXX
//                      XXXXX                            XXXXX

//Modular Machinery removals

//crafting.remove(item('modularmachinery:blockenergyinputhatch:0'))
//crafting.remove(item('modularmachinery:blockenergyinputhatch:1'))
//crafting.remove(item('modularmachinery:blockenergyinputhatch:2'))
//crafting.remove(item('modularmachinery:blockenergyinputhatch:3'))
//crafting.remove(item('modularmachinery:blockenergyinputhatch:4'))
//crafting.remove(item('modularmachinery:blockenergyinputhatch:5'))
//crafting.remove(item('modularmachinery:blockenergyinputhatch:6'))
//crafting.remove(item('modularmachinery:blockenergyinputhatch:7'))
//crafting.remove(item('modularmachinery:blockenergyoutputhatch:0'))
//crafting.remove(item('modularmachinery:blockenergyoutputhatch:1'))
//crafting.remove(item('modularmachinery:blockenergyoutputhatch:2'))
//crafting.remove(item('modularmachinery:blockenergyoutputhatch:3'))
//crafting.remove(item('modularmachinery:blockenergyoutputhatch:4'))
//crafting.remove(item('modularmachinery:blockenergyoutputhatch:5'))
//crafting.remove(item('modularmachinery:blockenergyoutputhatch:6'))
//crafting.remove(item('modularmachinery:blockenergyoutputhatch:7'))
//crafting.remove(item('modularmachinery:blockfluidinputhatch:0'))
//crafting.remove(item('modularmachinery:blockfluidinputhatch:1'))
//crafting.remove(item('modularmachinery:blockfluidinputhatch:2'))
//crafting.remove(item('modularmachinery:blockfluidinputhatch:3'))
//crafting.remove(item('modularmachinery:blockfluidinputhatch:4'))
//crafting.remove(item('modularmachinery:blockfluidinputhatch:5'))
//crafting.remove(item('modularmachinery:blockfluidinputhatch:6'))
//crafting.remove(item('modularmachinery:blockfluidinputhatch:7'))
//crafting.remove(item('modularmachinery:blockfluidoutputhatch:0'))
//crafting.remove(item('modularmachinery:blockfluidoutputhatch:1'))
//crafting.remove(item('modularmachinery:blockfluidoutputhatch:2'))
//crafting.remove(item('modularmachinery:blockfluidoutputhatch:3'))
//crafting.remove(item('modularmachinery:blockfluidoutputhatch:4'))
//crafting.remove(item('modularmachinery:blockfluidoutputhatch:5'))
//crafting.remove(item('modularmachinery:blockfluidoutputhatch:6'))
//crafting.remove(item('modularmachinery:blockfluidoutputhatch:7'))
//crafting.remove(item('modularmachinery:blockinputbus:0'))
//crafting.remove(item('modularmachinery:blockinputbus:1'))
//crafting.remove(item('modularmachinery:blockinputbus:2'))
//crafting.remove(item('modularmachinery:blockinputbus:3'))
//crafting.remove(item('modularmachinery:blockinputbus:4'))
//crafting.remove(item('modularmachinery:blockinputbus:5'))
//crafting.remove(item('modularmachinery:blockinputbus:6'))
//crafting.remove(item('modularmachinery:blockinputbus:7'))
//crafting.remove(item('modularmachinery:blockoutputbus:0'))
//crafting.remove(item('modularmachinery:blockoutputbus:1'))
//crafting.remove(item('modularmachinery:blockoutputbus:2'))
//crafting.remove(item('modularmachinery:blockoutputbus:3'))
//crafting.remove(item('modularmachinery:blockoutputbus:4'))
//crafting.remove(item('modularmachinery:blockoutputbus:5'))
//crafting.remove(item('modularmachinery:blockoutputbus:6'))
//crafting.remove(item('modularmachinery:blockoutputbus:7'))
//crafting.remove(item('modularmachinery:blockcasing:0')) // Machine Casing
//crafting.remove(item('modularmachinery:blockcasing:1')) // Machine Vent
//mods.jei.removeAndHide(item('modularmachinery:blockcasing:2')) // Firebox Casing
//mods.jei.removeAndHide(item('modularmachinery:blockcasing:3')) // Machine Gearbox
//mods.jei.removeAndHide(item('modularmachinery:blockcasing:4')) // Reinforced Machine Casing
//mods.jei.removeAndHide(item('modularmachinery:blockcasing:5')) // Machine Circuitry
//crafting.remove(item('modularmachinery:itemmodularium'))
//
//mods.jei.removeAndHide(item('modulardiversity:blockbiomedetector'))
//mods.jei.removeAndHide(item('modulardiversity:blockdaylightdetector'))
//mods.jei.removeAndHide(item('modulardiversity:blockweatherdetector'))

//                 XXXXXXXXXX                            XXXXXXXXXX
//              XXXXXXXXXXXXXXX                        XXXXXXXXXXXXXXX
//            XXXXXXXXXXXXX XXXX                      XXXX XXXXXXXXXXXXX
//           XXXXXXXXXXXXX XXXXX                      XXXXX XXXXXXXXXXXXX
//          XXXXXXXXXXXXX XXXXXX                      XXXXXX XXXXXXXXXXXXX
//         XXXXXXXXXXXXXXXXXXXXX                      XXXXXXXXXXXXXXXXXXXXX
//        XXXXXXXXXXXXXXXXXXXXXX                      XXXXXXXXXXXXXXXXXXXXXX
//       XXXXXXXXXXXXXXXXXXXXXX                        XXXXXXXXXXXXXXXXXXXXXX
//       XXXXXXXXXXXXXXXXXXXXX  XXXXX            XXXXX  XXXXXXXXXXXXXXXXXXXXX
//      XXXXXXXXXXXXXXXXXXXXX  XXXXXXXX        XXXXXXXX  XXXXXXXXXXXXXXXXXXXXX
//      XXXXXXXXXXXXXXXXXXX    XXXXXXXX        XXXXXXXX    XXXXXXXXXXXXXXXXXXX
//      XXXXXXXXXXXXXXXXX      XXXXXXXXX      XXXXXXXXX      XXXXXXXXXXXXXXXXX
//      XXXXXXXXXXXXXXX          XXXXXXXXXXXXXXXXXXXX          XXXXXXXXXXXXXXX
//      XXXXXXXXXXXX          XXXXXXXXXXXXXXXXXXXXXXXXXX          XXXXXXXXXXXX
//      XXXXXXXXXX        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX        XXXXXXXXXX
//       XXXXXXXXXX     XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX     XXXXXXXXXX
//        XXXXXXXXXX  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  XXXXXXXXXX
// XXXX     XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX     XXXX
// XXXXXX    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    XXXXXX
// XXXXXXXX    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    XXXXXXXX
//  XXXXXXXX     XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    XXXXXXXX
//   XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//       XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//          XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// XXXXXXXXX  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  XXXXXXXXX
// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// XXXXXXXXXXXXXXXXXXX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//    XXXXXXXXXXXXXX XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX XXXXXXXXXXXXXX
//         XXX    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    XXX
//            XXXXXXXXXXXX  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  XXXXXXXXXXX
//       XXXXXXXXXXXXXXXX  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  XXXXXXXXXXXXXXXX
//    XXXXXXXXXXXXXXXXX   XXXXXXXX     XXXXXXXX     XXXXXXXX   XXXXXXXXXXXXXXXXX
//    XXXXXXXXXXXXXX    XXXXXXXXX                    XXXXXXXXX    XXXXXXXXXXXXXX
//     XXXXXXXXXX      XXXXXXXX                       XXXXXXXXX      XXXXXXXXXX
//                     XXXXXXXX                        XXXXXXXX
//                     XXXXXXXX                        XXXXXXXX
//                      XXXXXXX                        XXXXXXX
//                      XXXXXX                          XXXXXX
//                      XXXXX                            XXXXX

//Lumberaxe Removal
//mods.jei.removeAndHide(item('lumberjack:infinity_lumberaxe'))
//mods.jei.removeAndHide(item('lumberjack:endsteel_lumberaxe'))
//mods.jei.removeAndHide(item('lumberjack:stellaralloy_lumberaxe'))

// Add moreplates neutronium plate to gtce neutronium ore dict
//ore('plateNeutronium').add(item('moreplates:neutronium_plate:0'))

//ore('gemDilithium').remove(item('libvulpes:productgem'))
ore('crystalDilithium').add(item('libvulpes:productgem'))

//ore('blockWarpCoreRim').add(item('gregtech:meta_block_compressed_4:8'))

//Omnium
mods.jei.removeAndHide(metaitem('ingotOmnium'))
mods.jei.removeAndHide(metaitem('nuggetOmnium'))
mods.jei.removeAndHide(metaitem('blockOmnium'))
ore('ingotOmnium').add(item('extendedcrafting:material:32'))
ore('nuggetOmnium').add(item('extendedcrafting:material:33'))
ore('blockOmnium').add(item('extendedcrafting:storage:4'))

//Neutronium
ore('ingotNeutronium').add(item('avaritia:resource:4'))
ore('nuggetNeutronium').add(item('avaritia:resource:3'))
ore('blockNeutronium').add(item('avaritia:block_resource'))

//Redstone Alloy
mods.jei.removeAndHide(item('enderio:block_alloy:3'))
mods.jei.removeAndHide(item('enderio:item_alloy_nugget:3'))


/*
TODO Implement me
def pipeOreDict = ore('questbookItemPipes')
// Add all GT Item Pipes
for pipe in <ore:pipe*Item*>{
    pipeOreDict.add(pipe.firstItem)
}

for restrictivePipe in <ore:pipe*Restrictive*>{
    pipeOreDict.add(restrictivePipe.firstItem)
}
*/

// GTCE Conductive Iron
//mods.jei.removeAndHide(metaitem('nuggetConductiveIron'))
//mods.jei.removeAndHide(metaitem('ingotConductiveIron'))
//mods.jei.removeAndHide(metaitem('blockConductiveIron'))

// GTCE Energetic Alloy
//mods.jei.removeAndHide(metaitem('nuggetEnergeticAlloy'))
//mods.jei.removeAndHide(metaitem('ingotEnergeticAlloy'))
//mods.jei.removeAndHide(metaitem('blockEnergeticAlloy'))

// GTCE Vibrant Alloy
//mods.jei.removeAndHide(metaitem('nuggetVibrantAlloy'))
//mods.jei.removeAndHide(metaitem('ingotVibrantAlloy'))
//mods.jei.removeAndHide(metaitem('blockVibrantAlloy'))

// GTCE Pulsating Iron
//mods.jei.removeAndHide(metaitem('nuggetPulsatingIron'))
//mods.jei.removeAndHide(metaitem('ingotPulsatingIron'))
//mods.jei.removeAndHide(metaitem('blockPulsatingIron'))

// GTCE Dark Steel
//mods.jei.removeAndHide(metaitem('nuggetDarkSteel'))
//mods.jei.removeAndHide(metaitem('ingotDarkSteel'))
//mods.jei.removeAndHide(metaitem('blockDarkSteel'))

// GTCE Electrical Steel
//mods.jei.removeAndHide(metaitem('nuggetElectricalSteel'))
//mods.jei.removeAndHide(metaitem('ingotElectricalSteel'))
//mods.jei.removeAndHide(metaitem('blockElectricalSteel'))

// GTCE End Steel
//mods.jei.removeAndHide(metaitem('nuggetEndSteel'))
//mods.jei.removeAndHide(metaitem('ingotEndSteel'))
//mods.jei.removeAndHide(metaitem('blockEndSteel'))

//mods.jei.removeAndHide(item('gregtech:meta_block_compressed_54:15')) // Block of Lignite Coke

//Nuggets
mods.jei.removeAndHide(item('thermalfoundation:material:193'))
mods.jei.removeAndHide(item('thermalfoundation:material:194'))
mods.jei.removeAndHide(item('thermalfoundation:material:195'))
//mods.jei.removeAndHide(item('thermalfoundation:material:200'))
mods.jei.removeAndHide(item('thermalfoundation:material:228'))
mods.jei.removeAndHide(item('extendedcrafting:material:1'))
mods.jei.removeAndHide(item('libvulpes:productnugget:3'))
mods.jei.removeAndHide(item('thermalfoundation:material:164'))
mods.jei.removeAndHide(item('thermalfoundation:storage_alloy:4'))

mods.jei.removeAndHide(item('thermalexpansion:machine:6'))
mods.jei.removeAndHide(item('thermalexpansion:machine:8'))

// SimplyJetpacks
mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack'))
mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack:6'))
mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack:7'))
mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack:8'))
mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack:9'))
mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack:10'))

mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack:1'))
mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack:2'))
mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack:3'))
mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack:4'))
mods.jei.removeAndHide(item('simplyjetpacks:itemfluxpack:5'))


//mods.jei.removeAndHide(<metaitem:cover.solar.panel>)
//mods.jei.removeAndHide(<metaitem:cover.solar.panel.ulv>)
//mods.jei.removeAndHide(<metaitem:cover.solar.panel.lv>)
mods.jei.removeAndHide(item('draconicevolution:draconium_block:1'))

//mods.jei.removeAndHide(<meta_tile_entity:thermal_centrifuge.lv>)		//thermal centrifuge
//mods.jei.removeAndHide(<meta_tile_entity:laser_engraver.lv>)		//precision
//mods.jei.removeAndHide(<meta_tile_entity:cutter.lv>)		//cutting
//mods.jei.removeAndHide(<meta_tile_entity:forming_press.lv>)		//forming
//mods.jei.removeAndHide(<meta_tile_entity:forming_press.mv>)		//forming
//mods.jei.removeAndHide(<meta_tile_entity:forming_press.hv>)		//forming
//mods.jei.removeAndHide(<meta_tile_entity:forming_press.ev>)		//forming
//mods.jei.removeAndHide(<meta_tile_entity:plasma_arc_furnace.lv>)		//plasma arc
//mods.jei.removeAndHide(<meta_tile_entity:plasma_arc_furnace.mv>)		//plasma arc
//mods.jei.removeAndHide(<meta_tile_entity:plasma_arc_furnace.hv>)		//plasma arc
//mods.jei.removeAndHide(<meta_tile_entity:plasma_arc_furnace.ev>)		//plasma arc
//mods.jei.removeAndHide(metaitem('circuit.data_control'))		//circuit1
//mods.jei.removeAndHide(metaitem('circuit.crystal_processor'))		//circuit2

// Workaround for DE Fusion Custom recipe not liking strings in the NBT
//ore('compressedoctadiccap').add(compressedoctadiccap)

// OreDict stuff for new Pulsating Mesh/Dust
def pulsatingDustOre = ore('dustPulsating')
def pulsatingMeshOre = ore('meshPulsating')

pulsatingDustOre.add(item('contenttweaker:pulsatingdust'))
//pulsatingDustOre.add(item('forestry:crafting_material:0'))

pulsatingMeshOre.add(item('contenttweaker:pulsatingmesh'))
//pulsatingMeshOre.add(item('forestry:crafting_material:1'))

// GT Fluix
ore('gemFluix').add(item('appliedenergistics2:material:7'))

// AdvRocketry
mods.jei.removeAndHide(item('advancedrocketry:blockpump'))    // Fluid Pump
mods.jei.removeAndHide(item('advancedrocketry:centrifuge'))   // Centrifuge
mods.jei.removeAndHide(item('advancedrocketry:basalt'))       // Basalt
mods.jei.removeAndHide(item('advancedrocketry:landingfloat')) // Landing Float
mods.jei.removeAndHide(item('advancedrocketry:airlock_door')) // Airlock Door (Technical Block)
mods.jei.removeAndHide(item('advancedrocketry:lightsource'))  // Light source (Technical Block)
mods.jei.removeAndHide(item('advancedrocketry:astrobed'))     // Astrobed     (Technical Block)

//AR Rocket fuel, unusable
mods.jei.removeAndHide(item('forge:bucketfilled').withTag([FluidName: "rocketfuel", Amount: 1000]))

// Various unused satellite sensors
mods.jei.removeAndHide(item('advancedrocketry:satelliteprimaryfunction:2'))
mods.jei.removeAndHide(item('advancedrocketry:satelliteprimaryfunction:3'))
mods.jei.removeAndHide(item('advancedrocketry:satelliteprimaryfunction:4'))
mods.jei.removeAndHide(item('advancedrocketry:satelliteprimaryfunction:5'))

// Unused Chips
mods.jei.removeAndHide(item('advancedrocketry:ic:1'))
mods.jei.removeAndHide(item('advancedrocketry:satelliteidchip'))

println("[JEI.groovy] End Hiding objects from JEI")