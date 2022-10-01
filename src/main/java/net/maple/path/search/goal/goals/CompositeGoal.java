package net.maple.path.search.goal.goals;

import java.util.Arrays;

import net.maple.path.search.goal.Goal;
import net.minecraft.util.math.BlockPos;

public class CompositeGoal extends Goal {
	
	private Goal[] goals;
	
	public CompositeGoal(Goal... goals) {
		this.goals = goals;
	}
	
	@Override
	public double cost(BlockPos pos) {
		double cost = Double.MAX_VALUE;
		
		for(Goal goal : goals) {
			
			double d = goal.cost(pos);
			
			if(d < cost) cost = d;
		}
		
		return cost;
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		for(Goal goal : goals) {
			
			if(goal.isTerminal(pos)) return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("CompositeGoal{goals=%s}", Arrays.toString(goals));
	}
	
	public Goal[] getGoals() {
		return goals;
	}
	
}
