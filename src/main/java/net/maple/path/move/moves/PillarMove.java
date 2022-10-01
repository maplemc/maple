package net.maple.path.move.moves;

import net.maple.path.move.Movement;
import net.maple.path.move.moves.types.StaticMove;
import net.maple.util.math.geometry.direction.Direction;

public class PillarMove extends StaticMove {
	
	public PillarMove() {
		super(Movement.PILLAR, Direction.UP);
	}
	
}
