package net.maple.event.events;

import net.maple.event.Event;
import net.maple.event.EventListener;
import net.maple.watch.anchor.Anchor;

public class WorldLeaveEvent extends Event {
	
	static {
		new EventListener<WorldLeaveEvent>(WorldLeaveEvent.class, (event) -> {
			
			System.out.println("leaving world: " + Anchor.CLIENT.world());
			
		});
	}
	
	// TODO world field?
	
}
