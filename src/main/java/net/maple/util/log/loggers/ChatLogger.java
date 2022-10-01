package net.maple.util.log.loggers;

import net.maple.util.log.Logger;
import net.maple.watch.anchor.Anchor;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class ChatLogger extends Logger {
	
	public ChatLogger() {
		super(true);
	}
	
	// TODO move to text constants
	private static final String MESSAGE_PREFIX = Formatting.LIGHT_PURPLE + "Maple" + Formatting.DARK_GRAY + " | " + Formatting.WHITE;
	
	@Override
	public void log(String message) {
		message = MESSAGE_PREFIX + message;
		
		Text text = Text.of(message);
		
		Anchor.PLAYER.sendMessage(text);
	}
	
}
