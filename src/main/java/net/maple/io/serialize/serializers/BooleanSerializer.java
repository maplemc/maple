package net.maple.io.serialize.serializers;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class BooleanSerializer extends Serializer<Boolean> {
	
	@Override
	public Boolean readFrom(Resource resource) {
		byte b = resource.read();
		
		return b != 0;
	}
	
	@Override
	public void writeTo(Resource resource, Boolean b) {
		resource.write((byte) (b ? 1 : 0));
	}
	
}
