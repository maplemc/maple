package net.maple.command.commands;

import net.maple.command.Command;
import net.maple.command.CommandPreset;
import net.maple.path.search.goal.Goal;
import net.maple.path.search.goal.goals.XZGoal;

public class ThisWayCommand extends Command {
	
	private static final int DEFAULT_DISTANCE = 1000;
	
	public ThisWayCommand() {
		super("thisway");
		
		addExecutor(CommandPreset.ONE_INTEGER, (message, arguments) -> {
			
			int distance = (int) arguments.first();
			
//			Goal goal = new XZGoal();
//			
//			message.forwardTo(Command.GOTO, CommandPreset.ONE_GOAL, goal);
			
		});
		
		addExecutor(CommandPreset.EMPTY, (message, arguments) -> {
			
			message.forwardTo(CommandPreset.ONE_INTEGER, DEFAULT_DISTANCE);
			
		});
	}
	
}
