package net.maple.io.serialize.serializers;

import java.nio.ByteBuffer;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class ShortSerializer extends Serializer<Short> {
	
	private static final int SIZE_IN_BYTES = 2;
	
	@Override
	public Short readFrom(Resource resource) {
		byte[] data = resource.read(SIZE_IN_BYTES);
		
		ByteBuffer buffer = ByteBuffer.wrap(data);
		
		return buffer.getShort();
	}
	
	@Override
	public void writeTo(Resource resource, Short s) {
		ByteBuffer buffer = ByteBuffer.allocate(SIZE_IN_BYTES);
		
		buffer.putShort(s);
		
		byte[] data = buffer.array();
		
		resource.write(data);
	}
	
}
