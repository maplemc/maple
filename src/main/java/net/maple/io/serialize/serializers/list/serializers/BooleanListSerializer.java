package net.maple.io.serialize.serializers.list.serializers;

import net.maple.io.serialize.Serializer;
import net.maple.io.serialize.serializers.list.ListSerializer;

public class BooleanListSerializer extends ListSerializer<Boolean, Serializer<Boolean>> {
	
	public BooleanListSerializer() {
		super(Serializer.BOOLEAN);
	}
	
}
