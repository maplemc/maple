package net.maple.command.commands;

import net.maple.command.Command;
import net.maple.command.CommandPreset;
import net.maple.command.argument.ArgumentType;
import net.maple.path.search.goal.Goal;
import net.maple.path.search.goal.goals.BlockGoal;
import net.maple.path.search.goal.goals.NearGoal;
import net.maple.path.search.goal.goals.XZGoal;
import net.maple.path.search.goal.goals.YLevelGoal;
import net.maple.util.log.LogUtil;
import net.minecraft.util.math.BlockPos;

public class GotoCommand extends Command {
	
	private static final CommandPreset BLOCK_POS_DOUBLE_PRESET = new CommandPreset(ArgumentType.BLOCK_POS, ArgumentType.DOUBLE);
	
	public GotoCommand() {
		super("goto");
		
		addExecutor(BLOCK_POS_DOUBLE_PRESET, (message, arguments) -> {
			
			BlockPos pos = (BlockPos) arguments.first();
			double distance = (double) arguments.second();
			
			Goal goal = new NearGoal(pos, distance);
			
			message.forwardTo(CommandPreset.ONE_GOAL, goal);
			
		});
		
		addExecutor(CommandPreset.ONE_BLOCK_POS, (message, arguments) -> {
			
			BlockPos pos = (BlockPos) arguments.first();
			
			Goal goal = new BlockGoal(pos);
			
			message.forwardTo(CommandPreset.ONE_GOAL, goal);
			
		});
		
		addExecutor(CommandPreset.TWO_INTEGERS, (message, arguments) -> {
			
			int x = (int) arguments.first();
			int z = (int) arguments.second();
			
			Goal goal = new XZGoal(x, z);
			
			message.forwardTo(CommandPreset.ONE_GOAL, goal);
			
		});
		
		addExecutor(CommandPreset.ONE_INTEGER, (message, arguments) -> {
			
			int y = (int) arguments.first();
			
			Goal goal = new YLevelGoal(y);
			
			message.forwardTo(CommandPreset.ONE_GOAL, goal);
			
		});
		
		addExecutor(CommandPreset.ONE_GOAL, (message, arguments) -> {
			
			// TODO announce new goal
			
			Goal goal = (Goal) arguments.first();
			
			LogUtil.log("Goal set (%s).", goal);
			
		});
	}
	
}
