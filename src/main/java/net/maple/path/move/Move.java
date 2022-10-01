package net.maple.path.move;

import net.maple.path.move.moves.AscendMove;
import net.maple.path.move.moves.DescendMove;
import net.maple.path.move.moves.DiagonalMove;
import net.maple.path.move.moves.LateralMove;
import net.maple.path.move.moves.PillarMove;
import net.maple.path.search.node.Node;
import net.maple.path.search.node.collection.NodeMap;
import net.maple.util.math.geometry.direction.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;

public abstract class Move {
	
	public static final Move PILLAR = new PillarMove();
	
	public static final Move ASCEND_NORTH = new AscendMove(Direction.NORTH);
	public static final Move ASCEND_SOUTH = new AscendMove(Direction.SOUTH);
	public static final Move ASCEND_EAST = new AscendMove(Direction.EAST);
	public static final Move ASCEND_WEST = new AscendMove(Direction.WEST);
	public static final Move ASCEND_NORTHEAST = new AscendMove(Direction.NORTHEAST);
	public static final Move ASCEND_NORTHWEST = new AscendMove(Direction.NORTHWEST);
	public static final Move ASCEND_SOUTHEAST = new AscendMove(Direction.SOUTHEAST);
	public static final Move ASCEND_SOUTHWEST = new AscendMove(Direction.SOUTHWEST);
	
	public static final Move DESCEND = new DescendMove(Direction.DOWN);
	public static final Move DESCEND_NORTH = new DescendMove(Direction.NORTH);
	public static final Move DESCEND_SOUTH = new DescendMove(Direction.SOUTH);
	public static final Move DESCEND_EAST = new DescendMove(Direction.EAST);
	public static final Move DESCEND_WEST = new DescendMove(Direction.WEST);
	public static final Move DESCEND_NORTHEAST = new DescendMove(Direction.NORTHEAST);
	public static final Move DESCEND_NORTHWEST = new DescendMove(Direction.NORTHWEST);
	public static final Move DESCEND_SOUTHEAST = new DescendMove(Direction.SOUTHEAST);
	public static final Move DESCEND_SOUTHWEST = new DescendMove(Direction.SOUTHWEST);
	
	public static final Move DIAGONAL_NORTHEAST = new DiagonalMove(Direction.NORTHEAST);
	public static final Move DIAGONAL_NORTHWEST = new DiagonalMove(Direction.NORTHWEST);
	public static final Move DIAGONAL_SOUTHEAST = new DiagonalMove(Direction.SOUTHEAST);
	public static final Move DIAGONAL_SOUTHWEST = new DiagonalMove(Direction.SOUTHWEST);
	
	public static final Move LATERAL_NORTH = new LateralMove(Direction.NORTH);
	public static final Move LATERAL_SOUTH = new LateralMove(Direction.SOUTH);
	public static final Move LATERAL_EAST = new LateralMove(Direction.EAST);
	public static final Move LATERAL_WEST = new LateralMove(Direction.WEST);
	
	private static final Move[] MOVES = new Move[] {
			LATERAL_NORTH, LATERAL_SOUTH, LATERAL_EAST, LATERAL_WEST,
			DIAGONAL_NORTHEAST, DIAGONAL_NORTHWEST, DIAGONAL_SOUTHEAST, DIAGONAL_SOUTHWEST,
			
			ASCEND_NORTH, ASCEND_SOUTH, ASCEND_EAST, ASCEND_WEST,
			ASCEND_NORTHEAST, ASCEND_NORTHWEST, ASCEND_SOUTHEAST, ASCEND_SOUTHWEST,
			
			DESCEND, DESCEND_NORTH, DESCEND_SOUTH, DESCEND_EAST, DESCEND_WEST,
			DESCEND_NORTHEAST, DESCEND_NORTHWEST, DESCEND_SOUTHEAST, DESCEND_SOUTHWEST,
			
			PILLAR
	};
	
	private Direction direction;
	
	public Move(Direction dir) {
		this.direction = dir;
	}
	
	public abstract MoveContext apply(Node source, NodeMap nodes);
	
	protected MoveContext apply(Node source, NodeMap nodes, Movement movement) {
		BlockPos pos = source.getPosition();
		
		pos = pos.add(direction);
		
		Node destination = nodes.getNode(pos);
		
		return apply(source, destination, movement);
	}
	
	protected MoveContext apply(Node source, Node destination, Movement movement) {
		return new MoveContext(source, destination, movement);
	}
	
	public Vec3i getDirection() {
		return direction;
	}
	
	public static Move[] getMoves() {
		return MOVES;
	}
	
}
