package net.maple.watch.anchor.anchors.world.entity;

import java.util.function.Supplier;

import net.maple.watch.anchor.Anchor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class EntityAnchor<T extends Entity> extends Anchor<T> {
	
	public EntityAnchor(T entity) {
		super(entity);
	}
	
	public EntityAnchor(Supplier<T> supplier) {
		super(supplier);
	}
	
	public boolean isSneaking() {
		return entity().isSneaking();
	}
	
	public boolean isSprinting() {
		return entity().isSprinting();
	}
	
	public boolean isInWater() {
		return entity().isTouchingWater();
	}
	
	public boolean isOnGround() {
		return entity().isOnGround();
	}
	
	public boolean isFalling() {
		if(isOnGround()) return false;
		
		return verticalSpeed() < 0;
	}
	
	public boolean isMovingVertically() {
		return verticalSpeed() != 0;
	}
	
	public boolean isMovingHorizontally() {
		return horizontalSpeed() != 0;
	}
	
	public boolean isMoving() {
		return speed() != 0;
	}
	
	public double horizontalSpeed() {
		return velocity().horizontalLength();
	}
	
	public double verticalSpeed() {
		return velocity().getY();
	}
	
	public double speed() {
		return velocity().length();
	}
	
	public Vec3d velocity() {
		return entity().getVelocity();
	}
	
	public BlockPos blockPosition() {
		return entity().getBlockPos();
	}
	
	public Vec3d eyePosition() {
		Vec3d v = position();
		
		T entity = entity();
		
		EntityPose pose = entity.getPose();
		
		float eyeHeight = entity.getEyeHeight(pose);
		
		return v.add(0, eyeHeight, 0);
	}
	
	public Vec3d position() {
		float tickDelta = Anchor.CLIENT.tickDelta();
		
		return entity().getLerpedPos(tickDelta);
	}
	
	public T entity() {
		return object();
	}
	
}
