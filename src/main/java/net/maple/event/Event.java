package net.maple.event;

public class Event {
	
	private EventState state;
	
	public void cancel() {
		setState(EventState.CANCELLED);
	}
	
	public boolean isCancelled() {
		return getState() == EventState.CANCELLED;
	}
	
	public EventState getState() {
		return state;
	}
	
	public void setState(EventState state) {
		this.state = state;
	}
	
}
