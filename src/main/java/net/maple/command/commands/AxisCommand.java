package net.maple.command.commands;

import net.maple.command.Command;
import net.maple.command.CommandPreset;
import net.maple.path.search.goal.Goal;

public class AxisCommand extends Command {
	
	public AxisCommand() {
		super("axis");
		
		addExecutor(CommandPreset.EMPTY, (message, arguments) -> {
			
			message.forwardTo(Command.GOTO, CommandPreset.ONE_GOAL, Goal.AXIS);
			
		});
	}
	
}
