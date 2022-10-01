package net.maple.io.serialize.serializers.list.serializers;

import java.util.UUID;

import net.maple.io.serialize.Serializer;
import net.maple.io.serialize.serializers.list.ListSerializer;

public class UUIDListSerializer extends ListSerializer<UUID, Serializer<UUID>> {
	
	public UUIDListSerializer() {
		super(Serializer.UUID);
	}
	
}
