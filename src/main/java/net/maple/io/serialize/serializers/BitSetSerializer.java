package net.maple.io.serialize.serializers;

import java.util.BitSet;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class BitSetSerializer extends Serializer<BitSet> {
	
	@Override
	public BitSet readFrom(Resource resource) {
		int l = Serializer.INTEGER.readFrom(resource);
		
		byte[] data = resource.read(l);
		
		return BitSet.valueOf(data);
	}
	
	@Override
	public void writeTo(Resource resource, BitSet bitSet) {
		byte[] data = bitSet.toByteArray();
		
		int l = data.length;
		
		Serializer.INTEGER.writeTo(resource, l);
		
		resource.write(data);
	}
	
}
