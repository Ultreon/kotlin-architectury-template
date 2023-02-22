package com.example.template.mixin.common;

import com.example.template.TemplateMod;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Inject(method = "init", at = @At("HEAD"))
    public void template$injectInit(CallbackInfo ci) {
        TemplateMod.INSTANCE.getLogger().info("Initialized title screen!");
    }
}
