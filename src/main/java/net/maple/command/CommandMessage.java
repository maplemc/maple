package net.maple.command;

import net.maple.command.argument.ArgumentList;

public class CommandMessage {
	
	private Command command;
	
	private MessageReader reader;
	
	private Exception exception;
	
	public CommandMessage(Command command, MessageReader reader) {
		this.command = command;
		this.reader = reader;
	}
	
	public void forwardTo(CommandPreset preset) {
		forwardTo(command, preset);
	}
	
	public void forwardTo(CommandPreset preset, Object... arguments) {
		forwardTo(command, preset, arguments);
	}
	
	public void forwardTo(Command command) {
		command.parseMessage(this);
	}
	
	public void forwardTo(Command command, CommandPreset preset) {
		command.parseMessage(this, preset);
	}
	
	public void forwardTo(Command command, CommandPreset preset, Object... arguments) {
		ArgumentList list = new ArgumentList(arguments);
		
		command.parseMessage(this, preset, list);
	}
	
	public Command getCommand() {
		return command;
	}
	
	public MessageReader getReader() {
		return reader;
	}
	
	public boolean hasException() {
		return exception != null;
	}
	
	public Exception getException() {
		return exception;
	}
	
	public void setException(Exception exception) {
		this.exception = exception;
	}
	
}
