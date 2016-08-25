package com.mowmaster.endpoint.item;

import net.minecraft.item.Item;

import static com.mowmaster.endpoint.creativetabs.NeverEnoughTabs.tabBottles;


public class basicItem extends Item
{
    public basicItem(String unloc)
    {
        super();
        this.setUnlocalizedName(unloc);
        this.maxStackSize = 64;
        this.setCreativeTab(tabBottles);
    }
}
