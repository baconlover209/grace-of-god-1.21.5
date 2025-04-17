package net.dart.graceofgod;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;

public class WeatherMapping {

    public static Biome.Precipitation precipitationTypeAt(BlockPos pos) {

        boolean weatherSelect = Math.sin(0.05 * pos.getX()) > 0;

        if(weatherSelect){
            return Biome.Precipitation.RAIN;
        }
        else {
            return Biome.Precipitation.NONE;
        }
    }

    public static boolean isRainingAt(BlockPos pos) {

        return precipitationTypeAt(pos) != Biome.Precipitation.NONE;

    }
}
