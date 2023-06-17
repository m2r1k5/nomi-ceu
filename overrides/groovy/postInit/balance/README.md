# Balance

Place your mod based changes (buff/balance/recipe changes) on this directory.

## Examples

```groovy
// Create a shapeless crafting using groovy
// Item: resolves to any item
// material: resolves to a gregtech item/material either from gt or from CustomGTMaterials.groovy
crafting.shapelessBuilder()
	.name("contenttweaker:infinity_plate")
	.output(item('moreplates:infinity_plate'))
	.input(material('ingotInfinity'))
	.register()
```
