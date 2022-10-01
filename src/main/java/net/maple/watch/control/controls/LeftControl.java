package net.maple.watch.control.controls;

import net.maple.util.control.ControlUtil;
import net.maple.watch.control.Control;
import net.maple.watch.control.input.InjectedInput;

public class LeftControl extends Control {
	
	@Override
	public void tick(InjectedInput input, boolean state) {
		input.movementSideways += ControlUtil.digitalToAnalog(state);
	}
	
}
