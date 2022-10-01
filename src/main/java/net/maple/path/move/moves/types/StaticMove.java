package net.maple.path.move.moves.types;

import net.maple.path.move.Move;
import net.maple.path.move.MoveContext;
import net.maple.path.move.Movement;
import net.maple.path.search.node.Node;
import net.maple.path.search.node.collection.NodeMap;
import net.maple.util.math.geometry.direction.Direction;

public class StaticMove extends Move {
	
	private Movement movement;
	
	public StaticMove(Movement movement, Direction dir) {
		super(dir);
		
		this.movement = movement;
	}
	
	@Override
	public MoveContext apply(Node source, NodeMap nodes) {
		return apply(source, nodes, movement);
	}
	
	public Movement getMovement() {
		return movement;
	}
	
}
