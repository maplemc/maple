package net.maple.command.argument.types;

import net.maple.command.MessageReader;
import net.maple.command.argument.ArgumentType;

public class FloatArgumentType extends ArgumentType<Float> {
	
	@Override
	public Float parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Float.parseFloat(s);
	}
	
}
