package net.maple.util.log;

import net.minecraft.util.Formatting;

public enum LogChannel {
	
	INFO(Formatting.GRAY), WARNING(Formatting.YELLOW), ERROR(Formatting.RED);
	
	private Formatting formatting;
	
	private LogChannel(Formatting formatting) {
		this.formatting = formatting;
	}
	
	public String formatMessage(String message, Logger logger) {
		if(logger.isSupportingFormatting()) return formatting + message;
		
		String name = name();
		
		return String.format("[%s] %s", name, message);
	}
	
	public Formatting getFormatting() {
		return formatting;
	}
	
}
