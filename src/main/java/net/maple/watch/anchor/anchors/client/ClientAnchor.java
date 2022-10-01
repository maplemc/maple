package net.maple.watch.anchor.anchors.client;

import java.util.function.Supplier;

import net.maple.util.time.TimeDuration;
import net.maple.watch.anchor.Anchor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.world.ClientWorld;

public class ClientAnchor extends Anchor<MinecraftClient> {
	
	public ClientAnchor(MinecraftClient client) {
		super(client);
	}
	
	public ClientAnchor(Supplier<MinecraftClient> supplier) {
		super(supplier);
	}
	
	public float lastFrameDuration() {
		float duration = client().getLastFrameDuration();
		
		return duration * TimeDuration.ONE_TICK;
	}
	
	public float tickDelta() {
		return client().getTickDelta();
	}
	
	@SuppressWarnings("resource")
	public ClientWorld world() {
		return client().world;
	}
	
	@SuppressWarnings("resource")
	public ClientPlayerEntity player() {
		return client().player;
	}
	
	@SuppressWarnings("resource")
	public GameOptions options() {
		return client().options;
	}
	
	public MinecraftClient client() {
		return object();
	}
	
}
