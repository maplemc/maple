package net.maple.io.serialize.serializers.list.serializers;

import net.maple.io.serialize.Serializer;
import net.maple.io.serialize.serializers.list.ListSerializer;

public class DoubleListSerializer extends ListSerializer<Double, Serializer<Double>> {
	
	public DoubleListSerializer() {
		super(Serializer.DOUBLE);
	}
	
}
