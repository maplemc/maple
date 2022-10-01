package net.maple.event;

import java.util.function.Consumer;

public class EventListener<T extends Event> {
	
	private Class<T> eventClass;
	
	private Consumer<T> consumer;
	
	public EventListener(Class<T> eventClass, Consumer<T> consumer) {
		this.eventClass = eventClass;
		this.consumer = consumer;
		
		EventBus.addListener(this);
	}
	
	@SuppressWarnings("unchecked")
	public void accept(Event event) {
		consumer.accept((T) event);
	}
	
	public Class<T> getEventClass() {
		return eventClass;
	}
	
	public Consumer<T> getConsumer() {
		return consumer;
	}
	
}
