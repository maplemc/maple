package net.maple.command.argument.types;

import java.util.UUID;

import net.maple.command.MessageReader;
import net.maple.command.argument.ArgumentType;

public class UUIDArgumentType extends ArgumentType<UUID> {
	
	@Override
	public UUID parseMessage(MessageReader reader) {
		String s = ArgumentType.STRING.parseMessage(reader);
		
		return java.util.UUID.fromString(s);
	}
	
}
