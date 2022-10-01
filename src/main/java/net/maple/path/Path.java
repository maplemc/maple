package net.maple.path;

import java.util.ArrayList;
import java.util.List;

import net.maple.path.move.MoveChain;
import net.maple.path.move.Movement;
import net.maple.path.search.node.Node;

public class Path extends MoveChain {
	
	private List<MoveChain> chains = new ArrayList<>();
	
	@Override
	public Movement getMovement(int index) {
		return null;
	}
	
	@Override
	public int length() {
		return 0;
	}
	
	public List<MoveChain> getChains() {
		return chains;
	}
	
	public static Path fromNode(Node node) {
		Path path = new Path();
		
		while(node != null) {
			
			// add movement to path
			
			node = node.getParent();
		}
		
		return path;
	}
	
}
