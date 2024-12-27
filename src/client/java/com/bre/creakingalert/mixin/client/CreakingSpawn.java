package com.bre.creakingalert.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.mob.CreakingEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(CreakingEntity.class)
public abstract class CreakingSpawn {

    @Inject(at = @At("TAIL"), method = "initHomePos")
    public void initHomePos(BlockPos homePos, CallbackInfo ci) {
        MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(Text.of("Creaking spawned with home at " + homePos));
    }
}
