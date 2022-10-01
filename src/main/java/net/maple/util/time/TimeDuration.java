package net.maple.util.time;

public class TimeDuration {
	
	private static final double DAYS_PER_MONTH = 30.4375;
	private static final double DAYS_PER_YEAR = 365.2425;
	
	public static final long ONE_MILLISECOND = 1;
	public static final long ONE_TICK = 50;
	public static final long ONE_SECOND = 1000;
	
	public static final long ONE_MINUTE = ONE_SECOND * 60;
	public static final long ONE_HOUR = ONE_MINUTE * 60;
	
	public static final long ONE_DAY = ONE_HOUR * 24;
	public static final long ONE_WEEK = ONE_DAY * 7;
	public static final long ONE_MONTH = (long) (ONE_DAY * DAYS_PER_MONTH);
	public static final long ONE_YEAR = (long) (ONE_DAY * DAYS_PER_YEAR);
	
	// TODO limit amount of units to 2 and join them with an 'and'
	public static String format(long duration) {
		String s = null;
		
		while(s == null || duration != 0) {
			
			TimeUnit unit = TimeUnit.getLargestUnit(duration);
			
			long amount = unit.getAmount(duration);
			
			duration -= unit.convertToMS(amount);
			
			s += ", " + unit.format(amount);
		}
		
		return s;
	}
	
}
