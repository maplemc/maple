package net.maple.path.move.moves;

import net.maple.path.move.Movement;
import net.maple.path.move.moves.types.StaticMove;
import net.maple.util.math.geometry.direction.Direction;

public class AscendMove extends StaticMove {
	
	public AscendMove(Direction dir) {
		super(Movement.ASCEND, dir.up());
	}
	
}
