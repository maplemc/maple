package net.maple.command;

import net.maple.command.argument.ArgumentList;

@FunctionalInterface
public interface CommandExecutor {
	
	void execute(CommandMessage message, ArgumentList arguments);
	
}
