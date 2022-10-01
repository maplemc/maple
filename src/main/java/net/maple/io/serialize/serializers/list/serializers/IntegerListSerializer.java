package net.maple.io.serialize.serializers.list.serializers;

import net.maple.io.serialize.Serializer;
import net.maple.io.serialize.serializers.list.ListSerializer;

public class IntegerListSerializer extends ListSerializer<Integer, Serializer<Integer>> {
	
	public IntegerListSerializer() {
		super(Serializer.INTEGER);
	}
	
}
