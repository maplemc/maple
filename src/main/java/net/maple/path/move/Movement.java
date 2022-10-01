package net.maple.path.move;

import net.maple.path.move.movements.AscendMovement;
import net.maple.path.move.movements.DescendMovement;
import net.maple.path.move.movements.DiagonalMovement;
import net.maple.path.move.movements.FallMovement;
import net.maple.path.move.movements.LateralMovement;
import net.maple.path.move.movements.PillarMovement;

public abstract class Movement extends MoveChain {
	
	public static final Movement PILLAR = new PillarMovement();
	public static final Movement FALL = new FallMovement();
	
	public static final Movement ASCEND = new AscendMovement();
	public static final Movement DESCEND = new DescendMovement();
	
	public static final Movement DIAGONAL = new DiagonalMovement();
	public static final Movement LATERAL = new LateralMovement();
	
	public abstract MovementState execute(MoveContext context);
	public abstract double cost(MoveContext context);
	
	// TODO composite movement class? -> primary & secondary movement
	
	public Movement or(Movement movement) {
		return new Movement() {
			
			@Override
			public MovementState execute(MoveContext context) {
				MovementState state = execute(context);
				
				if(state != MovementState.FAILED) return state;
				
				return movement.execute(context);
			}
			
			@Override
			public double cost(MoveContext context) {
				return Math.min(cost(context), movement.cost(context));
			}
		};
	}
	
	public Movement and(Movement movement) {
		return new Movement() {
			
			@Override
			public MovementState execute(MoveContext context) {
				return;
			}
			
			@Override
			public double cost(MoveContext context) {
				return;
			}
		};
	}
	
	public Movement then(Movement movement) {
		return new Movement() {
			
			@Override
			public MovementState execute(MoveContext context) {
				MovementState state = execute(context);
				
				if(state == MovementState.ONGOING) return state;
				
				return movement.execute(context);
			}
			
			@Override
			public double cost(MoveContext context) {
				return cost(context) + movement.cost(context);
			}
		};
	}
	
	@Override
	public Movement getMovement(int index) {
		return this;
	}
	
	@Override
	public int length() {
		return 1;
	}
	
}
