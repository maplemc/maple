package net.maple.io.serialize.serializers.list.serializers;

import net.maple.io.serialize.Serializer;
import net.maple.io.serialize.serializers.list.ListSerializer;

public class LongListSerializer extends ListSerializer<Long, Serializer<Long>> {
	
	public LongListSerializer() {
		super(Serializer.LONG);
	}
	
}
