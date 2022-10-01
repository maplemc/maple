package net.maple.util.text;

public class StringUtil {
	
	// TODO remove duplicate code
	public static String trimFirstWord(String s) {
		if(!containsSpaces(s)) return s;
		
		int index = s.indexOf(' ');
		
		return s.substring(index + 1);
	}
	
	// TODO rename to 'firstWordOf'?
	public static String firstWord(String s) {
		if(!containsSpaces(s)) return s;
		
		int index = s.indexOf(' ');
		
		return s.substring(0, index);
	}
	
	public static boolean containsSpaces(String s) {
		return s.contains(" ");
	}
	
	public static boolean equal(String s1, String s2, boolean ignoreCase) {
		return ignoreCase ? s1.equalsIgnoreCase(s2) : s1.equals(s2);
	}
	
}
