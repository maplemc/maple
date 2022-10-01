package net.maple.util.control;

public class ControlUtil {
	
	public static boolean analogToDigital(float state) {
		return state >= 0.5f;
	}
	
	public static float digitalToAnalog(boolean state) {
		return state ? 1 : 0;
	}
	
}
