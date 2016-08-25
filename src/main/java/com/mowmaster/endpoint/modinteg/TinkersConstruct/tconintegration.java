package com.mowmaster.endpoint.modinteg.TinkersConstruct;

import com.mowmaster.endpoint.configs.config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Loader;
import slimeknights.tconstruct.library.TinkerRegistry;

import static com.mowmaster.endpoint.item.ItemRegistry.glass_largepile;
import static com.mowmaster.endpoint.item.ItemRegistry.glass_pile;
import static com.mowmaster.endpoint.item.ItemRegistry.glass_tinypile;
import static slimeknights.tconstruct.shared.TinkerFluids.*;
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.cast;
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.castCustom;
import static slimeknights.tconstruct.smeltery.TinkerSmeltery.clayCast;

public class tconintegration
{
    public static void checkTCon2()
    {
        if (Loader.isModLoaded("tconstruct"))
        {



            if (config.smeltcasts)
            {
                TinkerRegistry.registerMelting(cast, brass, 144);
                TinkerRegistry.registerMelting(castCustom, brass, 144);
                TinkerRegistry.registerMelting(clayCast, clay, 288);
            }

            if (config.chainsteel)
            {
                TinkerRegistry.registerMelting(Items.CHAINMAIL_HELMET, steel, 720);
                TinkerRegistry.registerMelting(Items.CHAINMAIL_CHESTPLATE, steel, 1152);
                TinkerRegistry.registerMelting(Items.CHAINMAIL_LEGGINGS, steel, 1008);
                TinkerRegistry.registerMelting(Items.CHAINMAIL_BOOTS, steel, 576);
            }

            if (config.RecyclableGlass) {
                //Support Endpoint Glass Parts
                TinkerRegistry.registerMelting(glass_largepile, glass, 11664);
                TinkerRegistry.registerMelting(glass_pile, glass, 1296);
                TinkerRegistry.registerMelting(glass_tinypile, glass, 486);

                if (config.recyclebottles)
                {
                    TinkerRegistry.registerMelting(Items.GLASS_BOTTLE,glass,1296 );
                }
            }

        }

    }
}
