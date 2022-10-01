package net.maple.command.commands;

import net.maple.command.Command;
import net.maple.command.CommandPreset;
import net.maple.path.search.goal.Goal;
import net.maple.path.search.goal.goals.StrictDirectionGoal;
import net.maple.watch.anchor.Anchor;

public class TunnelCommand extends Command {
	
	public TunnelCommand() {
		super("tunnel");
		
		addExecutor(CommandPreset.EMPTY, (message, arguments) -> {
			
			// TODO strict direction goal in direction that player is facing
			
//			Goal goal = new StrictDirectionGoal(pos, dir);
//			
//			message.forwardTo(Command.GOTO, CommandPreset.ONE_GOAL, goal);
			
		});
	}
	
}
