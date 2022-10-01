package net.maple.path.search.goal.goals;

import net.maple.path.search.goal.Goal;
import net.minecraft.util.math.BlockPos;

public class TwoBlockGoal extends Goal {
	
	private BlockPos position;
	
	public TwoBlockGoal(BlockPos pos) {
		this.position = pos;
	}
	
	@Override
	public double cost(BlockPos pos) {
		pos = pos.subtract(position);
		
		return absoluteCost(pos);
	}
	
	@Override
	public boolean isTerminal(BlockPos pos) {
		return pos.equals(position) || pos.equals(position.down());
	}
	
	@Override
	public String toString() {
		return String.format("TwoBlockGoal{pos=%s}", position);
	}
	
	public BlockPos getPosition() {
		return position;
	}
	
	public static double absoluteCost(BlockPos pos) {
		if(pos.getY() < 0) pos = pos.up();
		
		return BlockGoal.absoluteCost(pos);
	}
	
}
