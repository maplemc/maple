package net.maple.path.search.goal.goals;

import net.maple.path.move.cost.costs.TravelCost;
import net.maple.path.search.goal.Goal;
import net.maple.util.math.geometry.distance.Distance;
import net.minecraft.util.math.BlockPos;

public class XZGoal extends Goal {
	
	private int x;
	private int z;
	
	public XZGoal(int x, int z) {
		this.x = x;
		this.z = z;
	}
	
	@Override
	public double cost(BlockPos pos) {
		int x = pos.getX() - this.x;
		int z = pos.getZ() - this.z;
		
		return absoluteCost(x, z);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return pos.getX() == x && pos.getZ() == z;
	}
	
	@Override
	public String toString() {
		return String.format("XZGoal{x=%s, z=%s}", x, z);
	}
	
	public int getX() {
		return x;
	}
	
	public int getZ() {
		return z;
	}
	
	public static double absoluteCost(BlockPos pos) {
		int x = pos.getX();
		int z = pos.getZ();
		
		return absoluteCost(x, z);
	}
	
	public static double absoluteCost(int x, int z) {
		double distance = Distance.DIAGONAL_MANHATTAN.compute(x, z);
		
		return distance * TravelCost.SPRINTING;
	}
	
}
