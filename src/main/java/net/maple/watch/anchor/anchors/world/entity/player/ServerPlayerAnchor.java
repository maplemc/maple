package net.maple.watch.anchor.anchors.world.entity.player;

import java.util.function.Supplier;

import net.minecraft.server.network.ServerPlayerEntity;

public class ServerPlayerAnchor extends PlayerAnchor<ServerPlayerEntity> {
	
	public ServerPlayerAnchor(ServerPlayerEntity player) {
		super(player);
	}
	
	public ServerPlayerAnchor(Supplier<ServerPlayerEntity> supplier) {
		super(supplier);
	}
	
}
