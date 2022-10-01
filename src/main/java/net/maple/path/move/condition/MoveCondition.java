package net.maple.path.move.condition;

import net.maple.path.move.Movement;

@FunctionalInterface
public interface MoveCondition {
	
	boolean test(Movement movement);
	
	public default MoveCondition or(MoveCondition condition) {
		return (movement) -> test(movement) || condition.test(movement);
	}
	
	public default MoveCondition and(MoveCondition condition) {
		return (movement) -> test(movement) && condition.test(movement);
	}
	
}
