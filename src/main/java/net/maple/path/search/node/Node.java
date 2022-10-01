package net.maple.path.search.node;

import net.maple.io.hash.Hasher;
import net.maple.path.search.goal.Goal;
import net.maple.path.search.node.hash.NodeHasher;
import net.minecraft.util.math.BlockPos;

public class Node {
	
	private BlockPos position;
	
	private Node parent;
	
	private double cost;
	private double pathCost;
	private double goalCost;
	
	public Node(BlockPos pos, Goal goal) {
		this.position = pos;
		updateGoalCost(goal);
	}
	
	public boolean updateParent(Node parent) {
		
	}
	
	private void updatePathCost() {
		pathCost = parent.getPathCost() + ;
		
		updateCost();
	}
	
	private void updateGoalCost(Goal goal) {
		goalCost = goal.cost(this);
		
		updateCost();
	}
	
	private void updateCost() {
		cost = getPathCost() + getGoalCost();
	}
	
	public double getPartialCost(float coefficient) {
		return getGoalCost() + getPathCost() / coefficient;
	}
	
	public long getHash() {
		return Hasher.NODE.hash(this);
	}
	
	public BlockPos getPosition() {
		return position;
	}
	
	public boolean hasParent() {
		return parent != null;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
		
		updatePathCost();
	}
	
	public double getCost() {
		return cost;
	}
	
	public double getPathCost() {
		return pathCost;
	}
	
	public double getGoalCost() {
		return goalCost;
	}
	
}
