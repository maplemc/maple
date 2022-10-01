package net.maple.command.argument.types;

import net.maple.command.MessageReader;
import net.maple.command.argument.ArgumentType;

public class BooleanArgumentType extends ArgumentType<Boolean> {
	
	@Override
	public Boolean parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Boolean.parseBoolean(s);
	}
	
}
