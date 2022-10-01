package net.maple.util.math.geometry.direction;

import net.minecraft.util.math.Vec3d;

// TODO move somewhere else, possibly combine with direction class
public class Rotation {
	
	
	
	private float yaw;
	private float pitch;
	
	private Vec3d unitVector;
	
	public Rotation(float yaw) {
		this(yaw, 0);
	}
	
	public Rotation(float yaw, float pitch) {
		this.yaw = yaw;
		this.pitch = pitch;
		
		this.unitVector = Vec3d.fromPolar(pitch, yaw);
	}
	
	public float getYaw() {
		return yaw;
	}
	
	public float getPitch() {
		return pitch;
	}
	
	public Vec3d getUnitVector() {
		return unitVector;
	}
	
	public static Direction ofVector(Vec3d vector) {
		return 
	}
	
}
