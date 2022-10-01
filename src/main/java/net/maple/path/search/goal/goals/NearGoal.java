package net.maple.path.search.goal.goals;

import net.maple.path.search.goal.Goal;
import net.minecraft.util.math.BlockPos;

public class NearGoal extends Goal {
	
	private BlockPos position;
	
	private double distance;
	
	public NearGoal(BlockPos pos, double distance) {
		this.position = pos;
		this.distance = distance;
	}
	
	@Override
	public double cost(BlockPos pos) {
		pos = pos.subtract(position);
		
		return BlockGoal.absoluteCost(pos);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return pos.isWithinDistance(position, distance);
	}
	
	@Override
	public String toString() {
		return String.format("NearGoal{pos=%s, dis=%s}", position, distance);
	}
	
	public BlockPos getPosition() {
		return position;
	}
	
	public double getDistance() {
		return distance;
	}
	
}
