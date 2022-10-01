package net.maple.path.move.moves;

import net.maple.path.move.Move;
import net.maple.path.move.MoveContext;
import net.maple.path.move.Movement;
import net.maple.path.search.node.Node;
import net.maple.path.search.node.collection.NodeMap;
import net.maple.util.math.geometry.direction.Direction;
import net.minecraft.util.math.BlockPos;

public class DescendMove extends Move {
	
	public DescendMove(Direction dir) {
		super(dir.down());
	}
	
	@Override
	public MoveContext apply(Node source, NodeMap nodes) {
		// descend destination as far as possible
		
		return apply(source, destination, Movement.DESCEND);
	}
	
}
