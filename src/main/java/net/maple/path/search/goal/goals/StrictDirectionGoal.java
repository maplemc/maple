package net.maple.path.search.goal.goals;

import net.maple.path.move.cost.costs.TravelCost;
import net.maple.path.search.goal.Goal;
import net.maple.util.math.MathConstants;
import net.maple.util.math.geometry.direction.Direction;
import net.minecraft.util.math.BlockPos;

public class StrictDirectionGoal extends Goal {
	
	private BlockPos position;
	
	private Direction direction;
	
	public StrictDirectionGoal(BlockPos pos, Direction dir) {
		this.position = pos;
		this.direction = dir;
	}
	
	@Override
	public double cost(BlockPos pos) {
		pos = pos.subtract(position);
		
		return ;
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("StrictDirectionGoal{pos=%s, dir=%s}", position, direction);
	}
	
	public static double absoluteCost(BlockPos pos) {
		
	}
	
	public static double absoluteCost() {
		
	}
	
	public BlockPos getPosition() {
		return position;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
}
