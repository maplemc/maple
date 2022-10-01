package net.maple.command.argument.types;

import net.maple.command.MessageReader;
import net.maple.command.argument.ArgumentType;

public class IntegerArgumentType extends ArgumentType<Integer> {
	
	@Override
	public Integer parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Integer.parseInt(s);
	}
	
}
