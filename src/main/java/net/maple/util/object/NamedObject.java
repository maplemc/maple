package net.maple.util.object;

import net.maple.util.text.StringUtil;

public class NamedObject {
	
	private String name;
	
	public NamedObject(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static NamedObject probeArray(NamedObject[] objects, String name) {
		return probeArray(objects, name, true);
	}
	
	public static NamedObject probeArray(NamedObject[] objects, String name, boolean ignoreCase) {
		for(NamedObject object : objects) {
			
			String s = object.getName();
			
			if(StringUtil.equal(s, name, ignoreCase)) return object;
		}
		
		return null;
	}
	
}
