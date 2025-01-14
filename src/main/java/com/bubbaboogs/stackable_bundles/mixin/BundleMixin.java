package com.bubbaboogs.stackable_bundles.mixin;

import com.bubbaboogs.stackable_bundles.BundlesConfig;
import com.bubbaboogs.stackable_bundles.Stackable_bundles;
import net.minecraft.component.type.BundleContentsComponent;
import net.minecraft.item.ItemStack;
import org.apache.commons.lang3.math.Fraction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BundleContentsComponent.class)
public abstract class BundleMixin {
    @Inject(method = "getOccupancy(Lnet/minecraft/item/ItemStack;)Lorg/apache/commons/lang3/math/Fraction;", at = @At("HEAD"), cancellable = true)
    private static void adjustOccupancy(ItemStack stack, CallbackInfoReturnable<Fraction> cir) {
        int slotSize = Stackable_bundles.CONFIG.slotSize();

        if (stack.getMaxCount() == 1) {
            cir.setReturnValue(Fraction.getFraction(slotSize, 64));
        }
    }
}
