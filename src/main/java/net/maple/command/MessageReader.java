package net.maple.command;

public class MessageReader {
	
	private String message;
	
	private int pointer;
	
	public MessageReader(String message) {
		this.message = message;
	}
	
	public char next() {
		char character = peek();
		
		skip();
		
		return character;
	}
	
	public char peek() {
		return message.charAt(pointer);
	}
	
	public void skip() {
		pointer++;
	}
	
	public void reset() {
		pointer = 0;
	}
	
	public boolean hasNext() {
		return available() > 0;
	}
	
	public int available() {
		return length() - pointer;
	}
	
	public int length() {
		return message.length();
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getPointer() {
		return pointer;
	}
	
	public void setPointer(int pointer) {
		this.pointer = pointer;
	}
	
}
