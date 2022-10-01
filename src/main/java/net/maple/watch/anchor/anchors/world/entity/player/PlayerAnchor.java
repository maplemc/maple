package net.maple.watch.anchor.anchors.world.entity.player;

import java.util.function.Supplier;

import net.maple.watch.anchor.anchors.world.entity.EntityAnchor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class PlayerAnchor<T extends PlayerEntity> extends EntityAnchor<T> {
	
	public PlayerAnchor(T player) {
		super(player);
	}
	
	public PlayerAnchor(Supplier<T> supplier) {
		super(supplier);
	}
	
	public void sendMessage(Text message) {
		player().sendMessage(message);
	}
	
	public T player() {
		return entity();
	}
	
}
