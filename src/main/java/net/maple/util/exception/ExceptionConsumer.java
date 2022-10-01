package net.maple.util.exception;

@FunctionalInterface
public interface ExceptionConsumer {
	
	public static ExceptionConsumer EMPTY = (exception) -> {};
	
	void accept(Exception exception);
	
}
