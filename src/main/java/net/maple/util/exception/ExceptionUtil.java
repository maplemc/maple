package net.maple.util.exception;

public class ExceptionUtil {
	
	public static boolean catchExceptions(Runnable runnable) {
		return catchExceptions(runnable, ExceptionConsumer.EMPTY);
	}
	
	public static boolean catchExceptions(Runnable runnable, ExceptionConsumer consumer) {
		try {
			
			runnable.run();
			
			return false;
			
		} catch(Exception exception) {
			
			consumer.accept(exception);
			
			return true;
		}
	}
	
}
