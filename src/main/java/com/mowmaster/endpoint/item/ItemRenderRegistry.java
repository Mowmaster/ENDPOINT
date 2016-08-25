package com.mowmaster.endpoint.item;

import com.mowmaster.endpoint.configs.config;
import com.mowmaster.endpoint.references.reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;


public class ItemRenderRegistry
{
    public static void ItemRR()
    {
        if (config.RecyclableGlass) {
            register(ItemRegistry.glass_tinypile);
            register(ItemRegistry.glass_pile);
            register(ItemRegistry.glass_largepile);
        }
        if (config.HammaTime) {
            register(ItemRegistry.tool_hammer);
            register(ItemRegistry.enderium_blend_dust);
            register(ItemRegistry.fake_pyrothium);
        }
    }
    public static void register(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(reference.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
    }
}
