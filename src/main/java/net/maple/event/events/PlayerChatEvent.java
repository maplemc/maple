package net.maple.event.events;

import net.maple.command.CommandManager;
import net.maple.event.Event;
import net.maple.event.EventListener;
import net.minecraft.text.Text;

public class PlayerChatEvent extends Event {
	
	static {
		new EventListener<PlayerChatEvent>(PlayerChatEvent.class, (event) -> {
			
			Type type = event.getType();
			
			if(type != Type.MESSAGE) return;
			
			String message = event.getMessage();
			
			if(CommandManager.isCommandMessage(message)) {
				CommandManager.parseMessage(message);
				
				event.cancel();
			}
		});
	}
	
	private Type type;
	
	private String message;
	private Text preview;
	
	public PlayerChatEvent(String message, Text preview) {
		this(Type.MESSAGE, message, preview);
	}
	
	public PlayerChatEvent(Type type, String message, Text preview) {
		this.type = type;
		this.message = message;
		this.preview = preview;
	}
	
	public Type getType() {
		return type;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Text getPreview() {
		return preview;
	}
	
	public enum Type {
		
		MESSAGE, COMMAND;
		
	}
	
}
