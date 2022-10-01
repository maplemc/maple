package net.maple.io.serialize.serializers;

import java.nio.ByteBuffer;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class CharSerializer extends Serializer<Character> {
	
	private static final int SIZE_IN_BYTES = 2;
	
	@Override
	public Character readFrom(Resource resource) {
		byte[] data = resource.read(SIZE_IN_BYTES);
		
		ByteBuffer buffer = ByteBuffer.wrap(data);
		
		return buffer.getChar();
	}
	
	@Override
	public void writeTo(Resource resource, Character c) {
		ByteBuffer buffer = ByteBuffer.allocate(SIZE_IN_BYTES);
		
		buffer.putChar(c);
		
		byte[] data = buffer.array();
		
		resource.write(data);
	}
	
}
