package net.maple.path.move;

import net.maple.path.search.node.Node;
import net.maple.util.math.geometry.direction.Direction;
import net.maple.watch.anchor.Anchor;
import net.minecraft.entity.player.PlayerEntity;

public class MoveContext {
	
	private Node source;
	private Node destination;
	
	private Direction direction;
	private Movement movement;
	
	private PlayerEntity player;
	
	public MoveContext(Node source, Node destination, Movement movement) {
		this(source, destination, movement, Anchor.PLAYER.player());
	}
	
	public MoveContext(Node source, Node destination, Movement movement, PlayerEntity player) {
		this.source = source;
		this.destination = destination;
		
		this.direction = direction;
		this.movement = movement;
		this.player = player;
	}
	
	// TODO move these helper methods into the direction class?
	
	public boolean isStrictlyVertical() {
		return direction.getDeltaX() == 0 && direction.getDeltaZ() == 0;
	}
	
	public boolean isVertical() {
		return direction.getDeltaY() != 0;
	}
	
	public boolean isDiagonal() {
		return direction.getDeltaX() != 0 && direction.getDeltaZ() != 0;
	}
	
	public boolean isLateral() {
		return !isDiagonal() && !isStrictlyVertical();
	}
	
	public Node getSource() {
		return source;
	}
	
	public Node getDestination() {
		return destination;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public Movement getMovement() {
		return movement;
	}
	
	public PlayerEntity getPlayer() {
		return player;
	}
	
}
