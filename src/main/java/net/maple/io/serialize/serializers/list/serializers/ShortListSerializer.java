package net.maple.io.serialize.serializers.list.serializers;

import net.maple.io.serialize.Serializer;
import net.maple.io.serialize.serializers.list.ListSerializer;

public class ShortListSerializer extends ListSerializer<Short, Serializer<Short>> {
	
	public ShortListSerializer() {
		super(Serializer.SHORT);
	}
	
}
