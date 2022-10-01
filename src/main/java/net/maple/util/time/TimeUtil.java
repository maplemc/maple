package net.maple.util.time;

public class TimeUtil {
	
	public static long ticksToMS(double ticks) {
		return Math.round(ticks * TimeDuration.ONE_TICK);
	}
	
}
