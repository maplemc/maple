package net.maple.path.move.moves;

import net.maple.path.move.Movement;
import net.maple.path.move.moves.types.StaticMove;
import net.maple.util.math.geometry.direction.Direction;

public class LateralMove extends StaticMove {
	
	public LateralMove(Direction dir) {
		super(Movement.LATERAL, dir);
	}
	
}
