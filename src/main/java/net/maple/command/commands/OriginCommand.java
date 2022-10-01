package net.maple.command.commands;

import net.maple.command.Command;
import net.maple.command.CommandPreset;
import net.maple.path.search.goal.Goal;

public class OriginCommand extends Command {
	
	public OriginCommand() {
		super("origin");
		
		addExecutor(CommandPreset.EMPTY, (message, arguments) -> {
			
			message.forwardTo(Command.GOTO, CommandPreset.ONE_GOAL, Goal.ORIGIN);
			
		});
	}
	
}
