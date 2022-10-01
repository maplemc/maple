package net.maple.watch.control.controls;

import net.maple.util.control.ControlUtil;
import net.maple.watch.control.Control;
import net.maple.watch.control.input.InjectedInput;

public class ForwardControl extends Control {
	
	@Override
	public void tick(InjectedInput input, boolean state) {
		input.movementForward += ControlUtil.digitalToAnalog(state);
	}
	
}
