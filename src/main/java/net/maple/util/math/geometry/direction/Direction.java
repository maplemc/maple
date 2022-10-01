package net.maple.util.math.geometry.direction;

import net.minecraft.util.math.Vec3i;

public class Direction extends Vec3i {
	
	public static final Direction NORTH = new Direction(0, -1);
	public static final Direction SOUTH = new Direction(0, 1);
	public static final Direction EAST = new Direction(1, 0);
	public static final Direction WEST = new Direction(-1, 0);
	
	public static final Direction NORTHEAST = NORTH.add(EAST);
	public static final Direction NORTHWEST = NORTH.add(WEST);
	public static final Direction SOUTHEAST = SOUTH.add(EAST);
	public static final Direction SOUTHWEST = SOUTH.add(WEST);
	
	public static final Direction UP = new Direction(1);
	public static final Direction DOWN = new Direction(-1);
	
	public static final Direction NEUTRAL = new Direction();
	
	public Direction() {
		this(0);
	}
	
	public Direction(int dy) {
		this(0, dy, 0);
	}
	
	public Direction(int dx, int dz) {
		this(dx, 0, dz);
	}
	
	public Direction(int dx, int dy, int dz) {
		super(dx, dy, dz);
	}
	
	public Direction(Vec3i vector) {
		super(vector.getX(), vector.getY(), vector.getZ());
	}
	
	public Direction north() {
		return add(NORTH);
	}
	
	public Direction south() {
		return add(SOUTH);
	}
	
	public Direction east() {
		return add(EAST);
	}
	
	public Direction west() {
		return add(WEST);
	}
	
	public Direction up() {
		return add(UP);
	}
	
	public Direction down() {
		return add(DOWN);
	}
	
	public Direction add(Direction dir) {
		Vec3i v = (Vec3i) this;
		
		v.add(dir);
		
		return new Direction(v);
	}
	
	public float getDeltaX() {
		return getX();
	}
	
	public float getDeltaY() {
		return getY();
	}
	
	public float getDeltaZ() {
		return getZ();
	}
	
}
