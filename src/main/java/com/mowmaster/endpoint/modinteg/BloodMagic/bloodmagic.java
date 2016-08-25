package com.mowmaster.endpoint.modinteg.BloodMagic;

import net.minecraftforge.fml.common.Loader;

/**
 * Created by KingMowmaster on 8/2/2016.
 */
public class bloodmagic
{
    public static void bloodCheck()
    {
        if (Loader.isModLoaded("bloodmagic"))
        {
            //AlchemyArrayRecipeRegistry.registerCraftingRecipe();
        }
    }
}
