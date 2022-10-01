package net.maple.path.search.goal.goals;

import net.maple.path.move.cost.costs.TravelCost;
import net.maple.path.search.goal.Goal;
import net.minecraft.util.math.BlockPos;

public class YLevelGoal extends Goal {
	
	private int y;
	
	public YLevelGoal(int y) {
		this.y = y;
	}
	
	@Override
	public double cost(BlockPos pos) {
		int y = pos.getY() - this.y;
		
		return absoluteCost(y);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return pos.getY() == y;
	}
	
	@Override
	public String toString() {
		return String.format("YGoal{y=%s}", y);
	}
	
	public int getY() {
		return y;
	}
	
	public static double absoluteCost(BlockPos pos) {
		int y = pos.getY();
		
		return absoluteCost(y);
	}
	
	public static double absoluteCost(int y) {
		if(y < 0) return TravelCost.JUMP_ONE_BLOCK * y;
		
		return TravelCost.FALL_TWO_BLOCKS / 2 * y;
	}
	
}
