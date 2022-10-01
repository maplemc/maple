package net.maple.io.serialize.serializers.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.Serializer;

public class ListSerializer<T, R extends Serializer<T>> extends Serializer<List<T>> {
	
	private Serializer<T> serializer;
	
	public ListSerializer(Serializer<T> s) {
		this.serializer = s;
	}
	
	@Override
	public List<T> readFrom(Resource resource) {
		int l = Serializer.INTEGER.readFrom(resource);
		
		List<T> list = new ArrayList<>();
		
		for(int i = 0; i < l; i++) {
			
			T object = serializer.readFrom(resource);
			
			list.add(object);
		}
		
		return list;
	}
	
	public void writeTo(Resource resource, T[] array) {
		List<T> list = Arrays.asList(array);
		
		writeTo(resource, list);
	}
	
	@Override
	public void writeTo(Resource resource, List<T> list) {
		int l = list.size();
		
		Serializer.INTEGER.writeTo(resource, l);
		
		list.forEach((t) -> serializer.writeTo(resource, t));
	}
	
	public Serializer<T> getSerializer() {
		return serializer;
	}
	
}
