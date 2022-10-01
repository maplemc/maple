package net.maple.io.serialize.serializers;

import java.nio.ByteBuffer;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class IntegerSerializer extends Serializer<Integer> {
	
	private static final int SIZE_IN_BYTES = 4;
	
	@Override
	public Integer readFrom(Resource resource) {
		byte[] data = resource.read(SIZE_IN_BYTES);
		
		ByteBuffer buffer = ByteBuffer.wrap(data);
		
		return buffer.getInt();
	}
	
	@Override
	public void writeTo(Resource resource, Integer i) {
		ByteBuffer buffer = ByteBuffer.allocate(SIZE_IN_BYTES);
		
		buffer.putInt(i);
		
		byte[] data = buffer.array();
		
		resource.write(data);
	}
	
}
