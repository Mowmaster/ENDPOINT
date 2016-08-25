package com.mowmaster.endpoint.proxies;


import com.mowmaster.endpoint.item.ItemRenderRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
    @Override
    @SideOnly(Side.CLIENT)

    public void preInit()
    {
        ItemRenderRegistry.ItemRR();

    }
}
