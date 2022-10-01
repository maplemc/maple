package net.maple.watch.anchor;

import java.util.function.Supplier;

import net.maple.watch.anchor.anchors.client.ClientAnchor;
import net.maple.watch.anchor.anchors.world.ClientWorldAnchor;
import net.maple.watch.anchor.anchors.world.entity.player.ClientPlayerAnchor;
import net.minecraft.client.MinecraftClient;

public class Anchor<T> {
	
	public static final ClientAnchor CLIENT = new ClientAnchor(() -> MinecraftClient.getInstance());
	
	public static final ClientWorldAnchor WORLD = new ClientWorldAnchor(() -> CLIENT.world());
	public static final ClientPlayerAnchor PLAYER = new ClientPlayerAnchor(() -> CLIENT.player());
	
	private T object;
	
	private Supplier<T> supplier;
	
	public Anchor(T object) {
		this.object = object;
	}
	
	public Anchor(Supplier<T> supplier) {
		this.supplier = supplier;
	}
	
	public T object() {
		if(object != null) return object;
		
		return supplier.get();
	}
	
}
