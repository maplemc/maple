package net.maple.util.log;

public class LogUtil {
	
	public static void logWarning(String message, Object... arguments) {
		log(LogChannel.WARNING, message, arguments);
	}
	
	public static void logError(String message, Object... arguments) {
		log(LogChannel.ERROR, message, arguments);
	}
	
	public static void log(String message, Object... arguments) {
		log(LogChannel.INFO, message, arguments);
	}
	
	public static void log(LogChannel channel, String message, Object... arguments) {
		log(Logger.CHAT, channel, message, arguments);
	}
	
	public static void logWarningToConsole(String message, Object... arguments) {
		logToConsole(LogChannel.WARNING, message, arguments);
	}
	
	public static void logErrorToConsole(String message, Object... arguments) {
		logToConsole(LogChannel.ERROR, message, arguments);
	}
	
	public static void logToConsole(String message, Object... arguments) {
		logToConsole(LogChannel.INFO, message, arguments);
	}
	
	public static void logToConsole(LogChannel channel, String message, Object... arguments) {
		log(Logger.CONSOLE, channel, message, arguments);
	}
	
	private static void log(Logger logger, LogChannel channel, String message, Object... arguments) {
		message = channel.formatMessage(message, logger);
		
		String s = String.format(message, arguments);
		
		logger.log(s);
	}
	
}
