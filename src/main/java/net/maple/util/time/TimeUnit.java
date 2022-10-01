package net.maple.util.time;

public class TimeUnit {
	
	public static final TimeUnit YEAR = new TimeUnit(TimeDuration.ONE_YEAR, "year", "years");
	public static final TimeUnit MONTH = new TimeUnit(TimeDuration.ONE_MONTH, "month", "months");
	public static final TimeUnit WEEK = new TimeUnit(TimeDuration.ONE_WEEK, "week", "weeks");
	public static final TimeUnit DAY = new TimeUnit(TimeDuration.ONE_DAY, "day", "days");
	
	public static final TimeUnit HOUR = new TimeUnit(TimeDuration.ONE_HOUR, "hour", "hours");
	public static final TimeUnit MINUTE = new TimeUnit(TimeDuration.ONE_MINUTE, "minute", "minutes");
	public static final TimeUnit SECOND = new TimeUnit(TimeDuration.ONE_SECOND, "second", "seconds");
	public static final TimeUnit TICK = new TimeUnit(TimeDuration.ONE_TICK, "tick", "ticks");
	public static final TimeUnit MILLISECOND = new TimeUnit(TimeDuration.ONE_MILLISECOND, "ms");
	
	private static final TimeUnit[] UNITS = new TimeUnit[] {
			MILLISECOND, TICK, SECOND, MINUTE, HOUR,
			DAY, WEEK, MONTH, YEAR
	};
	
	private long duration;
	
	private String singular;
	private String plural;
	
	public TimeUnit(long duration, String symbol) {
		this(duration, symbol, symbol);
	}
	
	public TimeUnit(long duration, String singular, String plural) {
		this.duration = duration;
		
		this.singular = singular;
		this.plural = plural;
	}
	
	public long convertToMS(long amount) {
		return convertTo(amount, TimeUnit.MILLISECOND);
	}
	
	public long convertTo(long amount, TimeUnit unit) {
		long l = amount * duration;
		
		return unit.getAmount(l);
	}
	
	public String format(long amount) {
		return amount + " " + getName(amount);
	}
	
	public String getName(long amount) {
		return amount == 1 ? singular : plural;
	}
	
	public long getAmount(long duration) {
		return duration / this.duration;
	}
	
	public String getSingular() {
		return singular;
	}
	
	public String getPlural() {
		return plural;
	}
	
	public long getDuration() {
		return duration;
	}
	
	public static TimeUnit getLargestUnit(long duration) {
		for(int i = UNITS.length - 1; i > 0; i--) {
			
			TimeUnit unit = UNITS[i];
			
			if(duration >= unit.getDuration()) return unit;
		}
		
		return MILLISECOND;
	}
	
	public static TimeUnit[] getUnits() {
		return UNITS;
	}
	
}
