package net.maple.path.search.ps;

import net.maple.path.search.node.Node;

public class PartialSolutions {
	
	private static final float[] COEFFICIENTS = new float[] {
			1.5f, 2, 2.5f, 3, 4, 5, 10
	};
	
	private PartialSolution[] solutions = new PartialSolution[COEFFICIENTS.length];
	
	public PartialSolutions() {
		for(int i = 0; i < COEFFICIENTS.length; i++) {
			
			float coefficient = COEFFICIENTS[i];
			
			solutions[i] = new PartialSolution(coefficient);
		}
	}
	
	public void addNode(Node node) {
		for(PartialSolution solution : solutions) {
			
			solution.updateNode(node);
		}
	}
	
	public Node getBestSolution() {
		for(PartialSolution solution : solutions) {
			
			if(solution.hasNode()) return solution.getNode();
		}
		
		return null;
	}
	
	public PartialSolution[] getSolutions() {
		return solutions;
	}
	
}
