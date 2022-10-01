package net.maple.path.search.goal.goals;

import net.maple.path.move.cost.costs.TravelCost;
import net.maple.path.search.goal.Goal;
import net.maple.util.math.MathConstants;
import net.minecraft.util.math.BlockPos;

public class AxisGoal extends Goal {
	
	private static final double ROOT_TWO_OVER_TWO = MathConstants.ROOT_TWO / 2;
	
	@Override
	public double cost(BlockPos pos) {
		return absoluteCost(pos);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		int x = pos.getX();
		int z = pos.getZ();
		
		return x == 0 || z == 0 || Math.abs(x) == Math.abs(z);
	}
	
	@Override
	public String toString() {
		return "AxisGoal";
	}
	
	public static double absoluteCost(BlockPos pos) {
		int x = pos.getX();
		int z = pos.getZ();
		
		return absoluteCost(x, z);
	}
	
	public static double absoluteCost(int x, int z) {
		x = Math.abs(x);
		z = Math.abs(z);
		
		double majorDis = Math.min(x, z);
		double minorDis = Math.abs(x - z) * ROOT_TWO_OVER_TWO;
		
		return Math.min(majorDis, minorDis) * TravelCost.SPRINTING;
	}
	
}
