package net.maple.io.serialize.serializers;

import java.nio.ByteBuffer;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class DoubleSerializer extends Serializer<Double> {
	
	private static final int SIZE_IN_BYTES = 8;
	
	@Override
	public Double readFrom(Resource resource) {
		byte[] data = resource.read(SIZE_IN_BYTES);
		
		ByteBuffer buffer = ByteBuffer.wrap(data);
		
		return buffer.getDouble();
	}
	
	@Override
	public void writeTo(Resource resource, Double d) {
		ByteBuffer buffer = ByteBuffer.allocate(SIZE_IN_BYTES);
		
		buffer.putDouble(d);
		
		byte[] data = buffer.array();
		
		resource.write(data);
	}
	
}
