package net.dart.graceofgod.mixin;

import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(World.class)
public class GetRainGradientMixin {
    @Inject(at = @At("HEAD"), method = "getRainGradient", cancellable = true)
    private void init(CallbackInfoReturnable<Float> cir) {
      cir.setReturnValue(1.0F);
    }
}
