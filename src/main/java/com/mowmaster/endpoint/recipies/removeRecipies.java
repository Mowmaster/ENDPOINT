package com.mowmaster.endpoint.recipies;



import com.mowmaster.endpoint.configs.config;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;



import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class removeRecipies
{

    public static void removeCrafting(Item item)
    {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
        Iterator<IRecipe> removeCrafting = recipes.iterator();

        while (removeCrafting.hasNext())
        {
            ItemStack is = removeCrafting.next().getRecipeOutput();
            if (is != null && is.getItem() == item)
                removeCrafting.remove();
        }
    }

    public static void removedCraftingItems() {


        if (config.FlintForDays) {
            //Remove other flint recipes
            removeCrafting(Items.FLINT);
        }
    }


    public static void removeSmelting(Item item)
    {
        Map<ItemStack, ItemStack> smeltingList = FurnaceRecipes.instance().getSmeltingList();
        Iterator<ItemStack> smeltingOutputIter = smeltingList.values().iterator();
        while (smeltingOutputIter.hasNext())
        {
            ItemStack output = smeltingOutputIter.next();
            if (output.getItem() == item)
            {
                smeltingOutputIter.remove();
            }
        }
    }

    public static void removedSmeltingItems()
    {
        //removeSmelting(Items.IRON_INGOT);
    }
}
