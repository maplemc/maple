package net.maple.watch.control.input;

import net.maple.watch.control.Control;
import net.minecraft.client.input.Input;

public class InjectedInput extends Input {
	
	@Override
	public void tick(boolean slowDown, float f) {
		for(Control control : Control.getControls()) control.tick(this);
		
		if(slowDown) {
			
            movementSideways *= f;
            movementForward *= f;
        }
	}
	
}
