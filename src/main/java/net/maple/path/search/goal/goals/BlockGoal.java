package net.maple.path.search.goal.goals;

import net.maple.path.search.goal.Goal;
import net.minecraft.util.math.BlockPos;

public class BlockGoal extends Goal {
	
	private BlockPos position;
	
	public BlockGoal(BlockPos pos) {
		this.position = pos;
	}
	
	@Override
	public double cost(BlockPos pos) {
		pos = pos.subtract(position);
		
		return absoluteCost(pos);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return pos.equals(position);
	}
	
	@Override
	public String toString() {
		return String.format("BlockGoal{pos=%s}", position);
	}
	
	public BlockPos getPosition() {
		return position;
	}
	
	public static double absoluteCost(BlockPos pos) {
		return XZGoal.absoluteCost(pos) + YLevelGoal.absoluteCost(pos);
	}
	
}
