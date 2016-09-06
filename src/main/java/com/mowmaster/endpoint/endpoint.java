package com.mowmaster.endpoint;


import com.mowmaster.endpoint.configs.config;
import com.mowmaster.endpoint.modinteg.*;
import com.mowmaster.endpoint.modinteg.Forestry.seedoil;
import com.mowmaster.endpoint.modinteg.Quark.quark;
import com.mowmaster.endpoint.modinteg.Quark.quarkcolor;
import com.mowmaster.endpoint.modinteg.TinkersConstruct.tconintegration;
import com.mowmaster.endpoint.item.ItemRegistry;
import com.mowmaster.endpoint.proxies.CommonProxy;
import com.mowmaster.endpoint.recipies.addRecipies;
import com.mowmaster.endpoint.recipies.removeRecipies;
import com.mowmaster.endpoint.references.reference;
import com.mowmaster.endpoint.world.biomes.BiomeReg;
import com.mowmaster.endpoint.world.worlds.MinersDelightSpawnable;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/*
@Mod(modid = reference.MODID, name = reference.MODNAME, version = reference.VERSION)
public class endpoint
{
    @Mod.Instance(reference.MODID)
    public static endpoint instance;

    @SidedProxy(serverSide = reference.SERVERSIDE, clientSide = reference.CLIENTSIDE)
    public static CommonProxy proxy;


    private static File configDir;
    public static File getConfigDir()
    {
        return configDir;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        configDir = new File(event.getModConfigurationDirectory() + "/" + reference.MODID);
        configDir.mkdirs();
        config.initConfig(new File(configDir.getPath(), reference.MODID + ".cfg"));
        ItemRegistry.registerBottles();
        BiomeReg.biomeRegistry();

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.preInit();
        MinecraftForge.EVENT_BUS.register(this);
        //basicFluid.regFluid();
        tconintegration.checkTCon2();
        if (config.seedoil) {seedoil.checktheForest();}


    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        WorldType MINERSDELIGHT = new MinersDelightSpawnable("Miners Delight");
    }
    @SubscribeEvent
    public void worldLoad(WorldEvent.Load event)
    {
        if (event.getWorld().isRemote && event.getWorld() != null && event.getWorld().provider.getDimension() == 0)
        {
            extrautils2.checkUtils2();
            if (config.quarkcolors){quarkcolor.checkQuark();}
            quark.checkquark2();
            //reliquary.checkXeno();
            removeRecipies.removedCraftingItems();
            removeRecipies.removedSmeltingItems();


            addRecipies.bR();


        }

    }


}
*/
