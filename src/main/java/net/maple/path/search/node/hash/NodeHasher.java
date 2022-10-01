package net.maple.path.search.node.hash;

import net.maple.io.hash.Hasher;
import net.maple.path.search.node.Node;
import net.minecraft.util.math.BlockPos;

public class NodeHasher extends Hasher<Node> {
	
	@Override
	public long hash(Node node) {
		BlockPos pos = node.getPosition();
		
		return Hasher.BLOCK_POS.hash(pos);
	}
	
}
