package com.mowmaster.endpoint.configs;

import net.minecraftforge.common.config.Configuration;

import java.io.File;


public class config
{




    public static Configuration configFile;

    //End Point
    public static boolean RecyclableGlass;
    public static boolean FlintForDays;
    public static boolean LeatherForDays;
    public static boolean CompactUncrafting;
    public static boolean HammaTime;

    //Forestry
    public static boolean seedoil;

    //TCon
    public static boolean smeltcasts;
    public static boolean chainsteel;
    public static boolean recyclebottles;

    // Extra Utils 2
    public static boolean VoidDrums;

    // Quark
    public static boolean quarkcolors;
    public static boolean vanillaquark;


    public static int MinersDelightBiomeID;


    public static void initConfig(File file)
    {
        configFile = new Configuration(file);
        syncConfig();

    }

    public static void syncConfig()
    {
        String category;

        //category = "HardRecipes";
        //configFile.addCustomCategoryComment(category,"Harder Recipes");

        //harderRecipes = configFile.getBoolean("Harder Recipes",category,false,"Are the default recipes to easy for a pro like you?");
        //rftoolsHARD = configFile.getBoolean("Harder Recipes for RFTools",category,false,"For those who don't want to make dimensions in your first 10 minutes of playing");

        category = "Forestry";
        configFile.addCustomCategoryComment(category,"Forestry Tweaks");
        seedoil = configFile.getBoolean("Seed Oils",category,true,"Should all seeds make Seed oil?");

        category = "Quark";
        configFile.addCustomCategoryComment(category,"Quark Tweaks");
        quarkcolors = configFile.getBoolean("Quark Colors",category,true,"Should Quark be more Colorful?");
        vanillaquark = configFile.getBoolean("Quark to Vanilla",category,true,"Should Quark Items be able to go back to its Vanilla State?");

        category = "Tinkers Construct";
        configFile.addCustomCategoryComment(category,"TCon Tweaks");
        smeltcasts = configFile.getBoolean("Smelt Casts",category,true,"Should Casts be Smeltable?");
        chainsteel = configFile.getBoolean("CHainmail to Steel",category,true,"Can Chainmail be Melted Down into Steel?");
        recyclebottles = configFile.getBoolean("Recyclable Bottles",category,true,"Can Bottles be Melted in the Smeltery? ~May Look Funny, *requires RecyclableGlass = true~");


        category = "Biome";
        configFile.addCustomCategoryComment(category,"Biome ID Settings");
        MinersDelightBiomeID = configFile.getInt("MinersDelightBiomeID",category,40,40,80,"Biome ID for Miners Delight");


        category = "Items";
        configFile.addCustomCategoryComment(category,"Added by MBIM");
        RecyclableGlass = configFile.getBoolean("Recycleable Glass",category,true,"Do you want to be able to recycle glass?");
        HammaTime = configFile.getBoolean("Hamma Time!",category,true,"Do you need more Hammers in your life?");



        category = "Vanilla";
        configFile.addCustomCategoryComment(category,"Vanilla Tweaks");

        FlintForDays = configFile.getBoolean("Flint For Days",category,true,"Should two gravel make flint?");
        LeatherForDays = configFile.getBoolean("Leather For Days",category,true,"Can you make Leather out of Rotting Flesh?");
        CompactUncrafting = configFile.getBoolean("Compact Uncrafting",category,true,"Should Uncrafting of some blocks be Possible?");


        category = "Extra Utilities 2";
        configFile.addCustomCategoryComment(category,"Extra Utils 2 Tweeks");
        VoidDrums = configFile.getBoolean("Void Drums",category,false,"Can you void liquids by crafting drums?");







        configFile.save();
    }
}
