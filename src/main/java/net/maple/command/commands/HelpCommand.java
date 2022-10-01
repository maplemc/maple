package net.maple.command.commands;

import net.maple.command.Command;
import net.maple.command.CommandPreset;

public class HelpCommand extends Command {
	
	public HelpCommand() {
		super("help");
		
		addExecutor(CommandPreset.ONE_INTEGER, (message, arguments) -> {
			
		});
	}
	
}
