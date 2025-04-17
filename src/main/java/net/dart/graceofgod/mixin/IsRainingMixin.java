package net.dart.graceofgod.mixin;

import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(World.class)
public class IsRainingMixin {
    @Inject(at = @At("HEAD"), method = "isRaining", cancellable = true)
    private void init(CallbackInfoReturnable<Boolean> cir) {
      cir.setReturnValue(false);
    }
}
