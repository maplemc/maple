package net.maple.util.time;

import java.util.Date;

public class Time {
	
	public static final long UNIX_EPOCH = 0;
	
	public static long currentTime() {
		return System.currentTimeMillis();
	}
	
	public static String format(long time) {
		return new Date(time).toString();
	}
	
}
