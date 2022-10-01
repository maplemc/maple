package net.maple.io.serialize.serializers;

import java.nio.ByteBuffer;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class FloatSerializer extends Serializer<Float> {
	
	private static final int SIZE_IN_BYTES = 4;
	
	@Override
	public Float readFrom(Resource resource) {
		byte[] data = resource.read(SIZE_IN_BYTES);
		
		ByteBuffer buffer = ByteBuffer.wrap(data);
		
		return buffer.getFloat();
	}
	
	@Override
	public void writeTo(Resource resource, Float f) {
		ByteBuffer buffer = ByteBuffer.allocate(SIZE_IN_BYTES);
		
		buffer.putFloat(f);
		
		byte[] data = buffer.array();
		
		resource.write(data);
	}
	
}
