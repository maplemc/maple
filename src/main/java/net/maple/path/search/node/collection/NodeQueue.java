package net.maple.path.search.node.collection;

import java.util.PriorityQueue;

import net.maple.path.search.node.Node;

// TODO replace with binary heap implementation
@SuppressWarnings("serial")
public class NodeQueue extends PriorityQueue<Node> {
	
	public NodeQueue() {
		super((n1, n2) -> Double.compare(n1.getCost(), n2.getCost()));
	}
	
}
