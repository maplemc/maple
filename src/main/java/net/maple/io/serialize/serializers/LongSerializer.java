package net.maple.io.serialize.serializers;

import java.nio.ByteBuffer;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class LongSerializer extends Serializer<Long> {
	
	private static final int SIZE_IN_BYTES = 8;
	
	@Override
	public Long readFrom(Resource resource) {
		byte[] data = resource.read(SIZE_IN_BYTES);
		
		ByteBuffer buffer = ByteBuffer.wrap(data);
		
		return buffer.getLong();
	}
	
	@Override
	public void writeTo(Resource resource, Long l) {
		ByteBuffer buffer = ByteBuffer.allocate(SIZE_IN_BYTES);
		
		buffer.putLong(l);
		
		byte[] data = buffer.array();
		
		resource.write(data);
	}
	
}
