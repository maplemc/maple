package net.maple.path.search.goal.goals;

import net.maple.path.search.goal.Goal;
import net.minecraft.util.math.BlockPos;

public class InvertedGoal extends Goal {
	
	private Goal goal;
	
	public InvertedGoal(Goal goal) {
		this.goal = goal;
	}
	
	@Override
	public double cost(BlockPos pos) {
		return -goal.cost(pos);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("InvertedGoal{goal=%s}", goal);
	}
	
	public Goal getGoal() {
		return goal;
	}
	
}
