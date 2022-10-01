package net.maple.io.serialize.serializers.list.serializers;

import net.maple.io.serialize.Serializer;
import net.maple.io.serialize.serializers.list.ListSerializer;

public class FloatListSerializer extends ListSerializer<Float, Serializer<Float>> {
	
	public FloatListSerializer() {
		super(Serializer.FLOAT);
	}
	
}
