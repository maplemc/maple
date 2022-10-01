package net.maple.command.argument.types;

import net.maple.command.MessageReader;
import net.maple.command.argument.ArgumentType;

public class LongArgumentType extends ArgumentType<Long> {
	
	@Override
	public Long parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Long.parseLong(s);
	}
	
}
