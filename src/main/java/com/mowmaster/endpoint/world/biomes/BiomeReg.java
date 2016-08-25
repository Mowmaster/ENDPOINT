package com.mowmaster.endpoint.world.biomes;

import com.mowmaster.endpoint.configs.config;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

/**
 * Created by KingMowmaster on 8/6/2016.
 */
public class BiomeReg
{
    public static void biomeRegistry()
    {
        initBiome();
        regBiome();
    }


    public static Biome MinersDelight;
    public static final int MinersDelightID = config.MinersDelightBiomeID;

    public static void initBiome()
    {
        MinersDelight = new BiomeMinersDelight(new Biome.BiomeProperties("Miners Delight").setTemperature(0.8f).setRainDisabled().setBaseHeight(2.0f).setHeightVariation(1.5f).setWaterColor(6076655));
        Biome.registerBiome(MinersDelightID,"Miners Delight",MinersDelight);
    }

    public static void regBiome()
    {
        //BiomeDictionary.makeBestGuess(MinersDelight);
        BiomeDictionary.registerBiomeType(MinersDelight, BiomeDictionary.Type.PLAINS);
        BiomeManager.addSpawnBiome(MinersDelight);


    }
}
