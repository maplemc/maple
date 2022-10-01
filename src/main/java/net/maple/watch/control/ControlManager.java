package net.maple.watch.control;

public class ControlManager {
	
	// TODO onTick -> inject/uninject based on isInControl
	
	public static boolean isInControl() {
		for(Control control : Control.getControls()) {
			
			if(control.isActive()) return true;
		}
		
		return false;
	}
	
}
