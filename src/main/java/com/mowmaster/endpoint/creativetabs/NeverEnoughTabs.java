package com.mowmaster.endpoint.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static com.mowmaster.endpoint.item.ItemRegistry.glass_pile;


public class NeverEnoughTabs
{
    public static final CreativeTabs tabBottles = new CreativeTabs("tabBottles") {
        @Override
        public Item getTabIconItem() {
            return glass_pile;
        }
    };
}
