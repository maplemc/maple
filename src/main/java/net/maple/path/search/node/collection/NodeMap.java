package net.maple.path.search.node.collection;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.maple.io.hash.Hasher;
import net.maple.path.search.PathSearch;
import net.maple.path.search.goal.Goal;
import net.maple.path.search.node.Node;
import net.minecraft.util.math.BlockPos;

public class NodeMap {
	
	private PathSearch search;
	
	private Long2ObjectOpenHashMap<Node> nodes = new Long2ObjectOpenHashMap<>(1024, 0.75f);
	
	public NodeMap(PathSearch search) {
		this.search = search;
	}
	
	public void addNode(Node node) {
		long hash = node.getHash();
		
		addNode(node, hash);
	}
	
	public void addNode(Node node, long hash) {
		nodes.put(hash, node);
	}
	
	public Node getNode(BlockPos pos) {
		long hash = Hasher.BLOCK_POS.hash(pos);
		
		Node n = nodes.get(hash);
		
		if(n != null) return n;
		
		Goal goal = search.getGoal();
		
		n = new Node(pos, goal);
		
		addNode(n);
		
		return n;
	}
	
	public PathSearch getSearch() {
		return search;
	}
	
}
