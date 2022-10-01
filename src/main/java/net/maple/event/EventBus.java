package net.maple.event;

import java.util.HashMap;

public class EventBus {
	
	private static HashMap<Class<? extends Event>, EventListener<?>> listeners = new HashMap<>();
	
	public static void addListener(EventListener<?> listener) {
		Class<? extends Event> clazz = listener.getEventClass();
		
		listeners.put(clazz, listener);
	}
	
	public static void fireEvent(Event event) {
		Class<?> clazz = event.getClass();
		
		EventListener<?> listener = listeners.get(clazz);
		
		listener.accept(event);
	}
	
}
