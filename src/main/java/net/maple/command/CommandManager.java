package net.maple.command;

import net.maple.util.log.LogUtil;
import net.maple.util.text.StringUtil;
import net.minecraft.util.Formatting;

public class CommandManager {
	
	private static final String COMMAND_PREFIX = "#";
	
	private static final int COMMAND_PREFIX_LENGTH = COMMAND_PREFIX.length();
	
	public static void parseMessage(String message) {
		message = message.substring(COMMAND_PREFIX_LENGTH);
		
		LogUtil.log(Formatting.WHITE + "> %s", message);
		
		String name = StringUtil.firstWord(message);
		
		Command command = Command.getCommand(name);
		
		if(command == null) {
			
			LogUtil.logError("Command not found!");
			
			return;
		}
		
		message = StringUtil.trimFirstWord(message);
		
		MessageReader reader = new MessageReader(message);
		
		CommandMessage m = new CommandMessage(command, reader);
		
		boolean parsed = command.parseMessage(m);
		
		if(!parsed) {
			
			Exception exception = m.getException();
			
			LogUtil.logError("Command exception occured: %s", exception);
		}
	}
	
	public static boolean isCommandMessage(String message) {
		return message.startsWith(COMMAND_PREFIX);
	}
	
}
