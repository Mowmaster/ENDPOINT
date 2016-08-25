package com.mowmaster.endpoint.modinteg;


import com.mowmaster.endpoint.configs.config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.mowmaster.endpoint.recipies.removeRecipies.removeCrafting;


public class extrautils2
{
    public static void checkUtils2()
    {
        if (Loader.isModLoaded("ExtraUtils2"))
        {
            Item EU2Drum = Item.REGISTRY.getObject(new ResourceLocation("extrautils2:Drum"));

            if (config.VoidDrums == true)
            {
                GameRegistry.addShapelessRecipe(new ItemStack(EU2Drum, 1, 0), new ItemStack(EU2Drum, 1, 0));
                GameRegistry.addShapelessRecipe(new ItemStack(EU2Drum, 1, 1), new ItemStack(EU2Drum, 1, 1));
                GameRegistry.addShapelessRecipe(new ItemStack(EU2Drum, 1, 2), new ItemStack(EU2Drum, 1, 2));
                GameRegistry.addShapelessRecipe(new ItemStack(EU2Drum, 1, 3), new ItemStack(EU2Drum, 1, 3));
                GameRegistry.addShapelessRecipe(new ItemStack(EU2Drum, 1, 4), new ItemStack(EU2Drum, 1, 4));
            }




        }
    }
}
