import com.cleanroommc.groovyscript.api.IIngredient
import net.minecraft.item.Item
import net.minecraft.item.ItemBlock
import net.minecraft.item.ItemStack
import net.minecraft.item.crafting.Ingredient
import net.minecraftforge.fml.common.registry.ForgeRegistries

public class IngredientFrame implements IIngredient {
    private int amount = 1
    private static List<ItemStack> matchingStacks

    @Override
    public int getAmount() {
        return amount
    }

    @Override
    public void setAmount(int amount) {
        this.amount = Math.max(0, amount)
    }

    @Override
    public IIngredient exactCopy() {
        return this
    }

    @Override
    public Ingredient toMcIngredient() {
        return new Ingredient() {
            @Override
            public boolean apply(ItemStack p_apply_1_) {
                return test(p_apply_1_)
            }
        };
    }

    // If we have already made the list, simply return the list.
    @Override
    public ItemStack[] getMatchingStacks() {
        return matchingStacks == null || matchingStacks.isEmpty() ? getMatchingStacksList() : matchingStacks
    }

    // Returns true if the provided itemStack is valid for recipe. Also used in other functions, to avoid duplicate logic.
    @Override
    public boolean test(ItemStack itemStack) {
        if (itemStack == null || itemStack.isEmpty())
            return false

        Item item = itemStack.getItem()

        return item instanceof ItemBlock && ((ItemBlock) item).getBlock().getStateFromMeta(itemStack.getMetadata()).isOpaqueCube()
    }

    // Only do this once
    private ItemStack[] getMatchingStacksList() {
        // Create List
        matchingStacks = []
        
        // Get every Item that is valid for framing
        for (var item : ForgeRegistries.ITEMS) {
            if (item != null && test(new ItemStack(item)))
                matchingStacks.add(new ItemStack(item))
        }
        return matchingStacks
    }
}