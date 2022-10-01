package net.maple.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.maple.event.Event;
import net.maple.event.EventBus;
import net.maple.event.events.PlayerChatEvent;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.text.Text;

@Mixin(ClientPlayerEntity.class)
public class PlayerMixin {
	
	@Inject(method = "sendCommand(Ljava/lang/String;Lnet/minecraft/text/Text;)V", at = @At("HEAD"), cancellable = true)
	private void sendCommand(String message, Text preview, CallbackInfo info) {
		Event event = new PlayerChatEvent(PlayerChatEvent.Type.COMMAND, message, preview);
		
		EventBus.fireEvent(event);
		
		if(event.isCancelled()) info.cancel();
	}
	
	@Inject(method = "sendChatMessage(Ljava/lang/String;Lnet/minecraft/text/Text;)V", at = @At("HEAD"), cancellable = true)
	private void sendChatMessage(String message, Text preview, CallbackInfo info) {
		Event event = new PlayerChatEvent(message, preview);
		
		EventBus.fireEvent(event);
		
		if(event.isCancelled()) info.cancel();
	}
	
}
