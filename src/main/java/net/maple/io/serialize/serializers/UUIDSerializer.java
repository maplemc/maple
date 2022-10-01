package net.maple.io.serialize.serializers;

import java.util.UUID;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class UUIDSerializer extends Serializer<UUID> {
	
	@Override
	public UUID readFrom(Resource resource) {
		long l1 = Serializer.LONG.readFrom(resource);
		long l2 = Serializer.LONG.readFrom(resource);
		
		return new UUID(l1, l2);
	}
	
	@Override
	public void writeTo(Resource resource, UUID id) {
		long l1 = id.getMostSignificantBits();
		long l2 = id.getLeastSignificantBits();
		
		Serializer.LONG.writeTo(resource, l1);
		Serializer.LONG.writeTo(resource, l2);
	}
	
}
