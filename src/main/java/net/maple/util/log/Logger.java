package net.maple.util.log;

import net.maple.util.log.loggers.ChatLogger;
import net.maple.util.log.loggers.ConsoleLogger;

public abstract class Logger {
	
	public static final Logger CHAT = new ChatLogger();
	public static final Logger CONSOLE = new ConsoleLogger();
	
	private boolean supportsFormatting;
	
	public Logger(boolean supportsFormatting) {
		this.supportsFormatting = supportsFormatting;
	}
	
	public abstract void log(String message);
	
	public boolean isSupportingFormatting() {
		return supportsFormatting;
	}
	
}
