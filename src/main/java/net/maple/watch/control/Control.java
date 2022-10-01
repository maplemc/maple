package net.maple.watch.control;

import net.maple.watch.control.controls.BackwardControl;
import net.maple.watch.control.controls.FlyControl;
import net.maple.watch.control.controls.ForwardControl;
import net.maple.watch.control.controls.JumpControl;
import net.maple.watch.control.controls.LeftControl;
import net.maple.watch.control.controls.RightControl;
import net.maple.watch.control.controls.SneakControl;
import net.maple.watch.control.controls.SprintControl;
import net.maple.watch.control.input.InjectedInput;

public abstract class Control {
	
	public static final Control FLY = new FlyControl();
	public static final Control SNEAK = new SneakControl();
	public static final Control SPRINT = new SprintControl();
	public static final Control JUMP = new JumpControl();
	
	public static final Control LEFT = new LeftControl();
	public static final Control RIGHT = new RightControl();
	public static final Control FORWARD = new ForwardControl();
	public static final Control BACKWARD = new BackwardControl();
	
	private static final Control[] CONTROLS = new Control[] {
			FORWARD, BACKWARD, LEFT, RIGHT,
			JUMP, SPRINT, SNEAK, FLY
	};
	
	private boolean state;
	
	public abstract void tick(InjectedInput input, boolean state);
	
	public void tick(InjectedInput input) {
		tick(input, state);
	}
	
	public void activate() {
		setState(true);
	}
	
	public boolean isActive() {
		return getState();
	}
	
	public boolean getState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	
	public static Control[] getControls() {
		return CONTROLS;
	}
	
}
