package net.maple.path.move.component.components;

import net.maple.path.move.MoveContext;
import net.maple.path.move.Movement;
import net.maple.path.move.MovementState;
import net.maple.path.move.cost.Cost;
import net.maple.watch.control.Control;

public class SprintMovement extends Movement {
	
	@Override
	public MovementState execute(MoveContext context) {
		Control.SPRINT.activate();
		
		return MovementState.DONE;
	}
	
	@Override
	public double cost(MoveContext context) {
		return Cost.IMMEDIATELY;
	}
	
}
