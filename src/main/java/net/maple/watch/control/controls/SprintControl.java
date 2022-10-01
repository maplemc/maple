package net.maple.watch.control.controls;

import net.maple.watch.anchor.Anchor;
import net.maple.watch.anchor.anchors.world.entity.player.ClientPlayerAnchor;
import net.maple.watch.control.Control;
import net.maple.watch.control.input.InjectedInput;

public class SprintControl extends Control {
	
	@Override
	public void tick(InjectedInput input, boolean state) {
		ClientPlayerAnchor player = Anchor.PLAYER;
		
		if(player.isSneaking() || !player.isMovingHorizontally()) state = false;
		
		input.sneaking = state;
	}
	
}
