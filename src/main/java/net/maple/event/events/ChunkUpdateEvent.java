package net.maple.event.events;

import net.maple.event.Event;
import net.maple.event.EventListener;
import net.minecraft.util.math.ChunkPos;

public class ChunkUpdateEvent extends Event {
	
	static {
		new EventListener<ChunkUpdateEvent>(ChunkUpdateEvent.class, (event) -> {
			
			
			
		});
	}
	
	private ChunkPos position;
	
	public ChunkUpdateEvent(ChunkPos pos) {
		this.position = pos;
	}
	
	public ChunkPos getPosition() {
		return position;
	}
	
}
