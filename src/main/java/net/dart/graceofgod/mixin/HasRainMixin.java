package net.dart.graceofgod.mixin;


import net.dart.graceofgod.WeatherMapping;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(World.class)
public class HasRainMixin {
    @Inject(at = @At("HEAD"), method = "hasRain", cancellable = true)
    private void init(BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(WeatherMapping.isRainingAt(pos));
    }
}

