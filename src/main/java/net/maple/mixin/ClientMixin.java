package net.maple.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.maple.event.Event;
import net.maple.event.EventBus;
import net.maple.event.events.WorldJoinEvent;
import net.maple.event.events.WorldLeaveEvent;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.world.ClientWorld;

@Mixin(MinecraftClient.class)
public class ClientMixin {
	
	// TODO find better methods to inject into
	
	@Inject(method = "joinWorld(Lnet/minecraft/client/world/ClientWorld;)V", at = @At("TAIL"))
	private void joinWorld(ClientWorld world, CallbackInfo info) {
		Event event = new WorldJoinEvent();
		
		EventBus.fireEvent(event);
	}
	
	@Inject(method = "disconnect(Lnet/minecraft/client/gui/screen/Screen;)V", at = @At("HEAD"))
	private void disconnect(Screen screen, CallbackInfo info) {
		Event event = new WorldLeaveEvent();
		
		EventBus.fireEvent(event);
	}
	
}