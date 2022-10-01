package net.maple.path.search;

import net.maple.path.Path;
import net.maple.path.move.Move;
import net.maple.path.move.MoveContext;
import net.maple.path.search.goal.Goal;
import net.maple.path.search.node.Node;
import net.maple.path.search.node.collection.NodeMap;
import net.maple.path.search.node.collection.NodeQueue;
import net.maple.path.search.node.collection.NodeSet;
import net.maple.path.search.ps.PartialSolutions;
import net.minecraft.util.math.BlockPos;

public class PathSearch {
	
	private Goal goal;
	
	private NodeMap nodes = new NodeMap(this);
	
	private NodeQueue openNodes = new NodeQueue();
	private NodeSet closedNodes = new NodeSet();
	
	private PartialSolutions solutions = new PartialSolutions();
	
	public PathSearch(Goal goal) {
		this.goal = goal;
	}
	
	public Path search(BlockPos start) {
		Path path = new Path();
		
		return search(start, path);
	}
	
	public Path search(BlockPos start, Path path) {
		Node node = getNode(start);
		
		while(!openNodes.isEmpty()) {
			
			Node n = openNodes.poll();
			
			if(goal.isTerminal(n)) return;
			
			closedNodes.add(n);
			solutions.addNode(n);
			
			addAdjacentNodes(n);
		}
		
		return;
	}
	
	private void addAdjacentNodes(Node source) {
		for(Move move : Move.getMoves()) {
			
			MoveContext context = move.apply(source, nodes);
			
			addAdjacentNode(source, context);
		}
	}
	
	private void addAdjacentNode(Node source, MoveContext context) {
		Node node = context.getDestination();
		
		if(closedNodes.contains(node)) return;
		
		// is inside loaded part of world & movement cost is less than forever
	}
	
	public Node getNode(BlockPos pos) {
		return nodes.getNode(pos);
	}
	
	public Goal getGoal() {
		return goal;
	}
	
	public PartialSolutions getSolutions() {
		return solutions;
	}
	
}
