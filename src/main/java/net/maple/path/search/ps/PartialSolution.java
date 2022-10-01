package net.maple.path.search.ps;

import net.maple.path.search.node.Node;

public class PartialSolution {
	
	private float coefficient;
	
	private Node node;
	
	private double score;
	
	public PartialSolution(float coefficient) {
		this.coefficient = coefficient;
	}
	
	// TODO rename?
	public void updateNode(Node node) {
		boolean better = true;
		
		double score = node.getPartialCost(coefficient);
		
		if(this.node != null) better = score < this.score;
		
		if(better) {
			
			this.node = node;
			this.score = score;
		}
	}
	
	public boolean hasNode() {
		return node != null;
	}
	
	public float getCoefficient() {
		return coefficient;
	}
	
	public Node getNode() {
		return node;
	}
	
	public double getScore() {
		return score;
	}
	
}
