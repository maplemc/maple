package net.maple.command.argument.types;

import net.maple.command.MessageReader;
import net.maple.command.argument.ArgumentType;

public class DoubleArgumentType extends ArgumentType<Double> {
	
	@Override
	public Double parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return Double.parseDouble(s);
	}
	
}
