package com.mowmaster.endpoint.modinteg.Quark;

import com.mowmaster.endpoint.configs.config;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by KingMowmaster on 8/25/2016.
 */
public class quark
{
    public static void checkquark2()
    {
        if (Loader.isModLoaded("Quark"))
        {
            Item QChest = Item.REGISTRY.getObject(new ResourceLocation("quarkcolor:custom_chest"));
            Item QTCrest = Item.REGISTRY.getObject(new ResourceLocation("quarkcolor:custom_chest_trap"));


            if (config.vanillaquark) {
                //Quark Chests into their Vanilla counterparts
                for (int chest = 0; chest <= 4; chest++) {
                    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.CHEST, 1), new ItemStack(QChest, 1, chest));
                    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.TRAPPED_CHEST, 1), new ItemStack(QTCrest, 1, chest));
                }
            }
        }
    }
}
