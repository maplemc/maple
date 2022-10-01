package net.maple.command.argument.types;

import net.maple.command.MessageReader;
import net.maple.command.argument.ArgumentType;

public class CharArgumentType extends ArgumentType<Character> {
	
	@Override
	public Character parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		int length = s.length();
		
		if(length != 1) throw new IllegalArgumentException(); // TODO add exception message
		
		return s.charAt(0);
	}
	
}
