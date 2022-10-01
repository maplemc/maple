package net.maple.path.move.component;

import net.maple.path.move.Movement;
import net.maple.path.move.component.components.JumpMovement;
import net.maple.path.move.component.components.SprintMovement;

public class MoveComponent {
	
	public static final Movement JUMP = new JumpMovement();
	public static final Movement SPRINT = new SprintMovement();
	
}
