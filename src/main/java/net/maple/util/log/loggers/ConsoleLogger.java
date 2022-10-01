package net.maple.util.log.loggers;

import net.maple.util.log.Logger;

public class ConsoleLogger extends Logger {
	
	public ConsoleLogger() {
		super(false);
	}
	
	@Override
	public void log(String message) {
		// TODO use 'LoggerFactory.getLogger(Constants.MOD_ID).info(message)' instead
		
		System.out.println(message);
	}
	
}
