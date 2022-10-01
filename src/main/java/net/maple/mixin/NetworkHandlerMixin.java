package net.maple.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.maple.event.Event;
import net.maple.event.EventBus;
import net.maple.event.events.BlockUpdateEvent;
import net.maple.event.events.ChunkUpdateEvent;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;

@Mixin(ClientPlayNetworkHandler.class)
public class NetworkHandlerMixin {
	
	@Inject(method = "onChunkData(Lnet/minecraft/network/packet/s2c/play/ChunkDataS2CPacket;)V", at = @At("TAIL"))
	private void onChunkData(ChunkDataS2CPacket packet, CallbackInfo info) {
		int chunkX = packet.getX();
		int chunkZ = packet.getZ();
		
		Event event = new ChunkUpdateEvent(null);
		
		EventBus.fireEvent(event);
	}
	
	@Inject(method = "onChunkDeltaUpdate(Lnet/minecraft/network/packet/s2c/play/ChunkDeltaUpdateS2CPacket;)V", at = @At("TAIL"))
	private void onChunkDeltaUpdate(ChunkDeltaUpdateS2CPacket packet, CallbackInfo info) {
		packet.visitUpdates((pos, state) -> {
			
			Event event = new BlockUpdateEvent(pos);
			
			EventBus.fireEvent(event);
		});
	}
	
	@Inject(method = "onBlockUpdate(Lnet/minecraft/network/packet/s2c/play/BlockUpdateS2CPacket;)V", at = @At("TAIL"))
	private void onBlockUpdate(BlockUpdateS2CPacket packet, CallbackInfo info) {
		BlockPos pos = packet.getPos();
		
		Event event = new BlockUpdateEvent(pos);
		
		EventBus.fireEvent(event);
	}
	
}
