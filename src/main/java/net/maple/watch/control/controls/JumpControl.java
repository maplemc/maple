package net.maple.watch.control.controls;

import net.maple.watch.control.Control;
import net.maple.watch.control.input.InjectedInput;

public class JumpControl extends Control {
	
	@Override
	public void tick(InjectedInput input, boolean state) {
		input.jumping = state;
	}
	
}
