package net.maple.event.events;

import net.maple.event.Event;
import net.maple.event.EventListener;
import net.minecraft.util.math.BlockPos;

public class BlockUpdateEvent extends Event {
	
	static {
		new EventListener<BlockUpdateEvent>(BlockUpdateEvent.class, (event) -> {
			
			
			
		});
	}
	
	private BlockPos position;
	
	public BlockUpdateEvent(BlockPos pos) {
		this.position = pos;
	}
	
	public BlockPos getPosition() {
		return position;
	}
	
}
