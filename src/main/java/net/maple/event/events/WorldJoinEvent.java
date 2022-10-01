package net.maple.event.events;

import net.maple.event.Event;
import net.maple.event.EventListener;
import net.maple.watch.anchor.Anchor;

public class WorldJoinEvent extends Event {
	
	static {
		new EventListener<WorldJoinEvent>(WorldJoinEvent.class, (event) -> {
			
			System.out.println("joining world: " + Anchor.CLIENT.world());
			
		});
	}
	
	// TODO world field?
	
}
