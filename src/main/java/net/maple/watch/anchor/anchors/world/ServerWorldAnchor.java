package net.maple.watch.anchor.anchors.world;

import java.util.function.Supplier;

import net.minecraft.server.world.ServerWorld;

public class ServerWorldAnchor extends WorldAnchor<ServerWorld> {
	
	public ServerWorldAnchor(ServerWorld world) {
		super(world);
	}
	
	public ServerWorldAnchor(Supplier<ServerWorld> supplier) {
		super(supplier);
	}
	
}
