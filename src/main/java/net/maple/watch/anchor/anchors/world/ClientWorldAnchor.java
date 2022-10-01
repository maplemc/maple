package net.maple.watch.anchor.anchors.world;

import java.util.function.Supplier;

import net.minecraft.client.world.ClientWorld;

public class ClientWorldAnchor extends WorldAnchor<ClientWorld> {
	
	public ClientWorldAnchor(ClientWorld world) {
		super(world);
	}
	
	public ClientWorldAnchor(Supplier<ClientWorld> supplier) {
		super(supplier);
	}
	
}
