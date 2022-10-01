package net.maple.command.argument.types;

import net.maple.command.MessageReader;
import net.maple.command.argument.ArgumentType;

public class ShortArgumentType extends ArgumentType<Short> {
	
	@Override
	public Short parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Short.parseShort(s);
	}
	
}
