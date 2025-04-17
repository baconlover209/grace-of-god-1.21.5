package net.dart.graceofgod.mixin;


import net.dart.graceofgod.WeatherMapping;
import net.minecraft.client.render.WeatherRendering;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkSectionPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WeatherRendering.class)
public class GetPrecipitationMixin {
    @Inject(at = @At("HEAD"), method = "getPrecipitationAt", cancellable = true)
    private void init(World world, BlockPos pos, CallbackInfoReturnable<Biome.Precipitation> cir) {
        cir.setReturnValue(WeatherMapping.precipitationTypeAt(pos));
    }
}
