package net.maple.watch.anchor.anchors.world;

import java.util.function.Supplier;

import net.maple.watch.anchor.Anchor;
import net.minecraft.world.World;

public class WorldAnchor<T extends World> extends Anchor<T> {
	
	public WorldAnchor(T world) {
		super(world);
	}
	
	public WorldAnchor(Supplier<T> supplier) {
		super(supplier);
	}
	
	public T world() {
		return object();
	}
	
}
