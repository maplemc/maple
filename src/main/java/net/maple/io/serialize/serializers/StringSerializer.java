package net.maple.io.serialize.serializers;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class StringSerializer extends Serializer<String> {
	
	@Override
	public String readFrom(Resource resource) {
		byte[] data = resource.readAll();
		
		return new String(data);
	}
	
	@Override
	public void writeTo(Resource resource, String s) {
		byte[] data = s.getBytes();
		
		resource.write(data);
	}
	
}
