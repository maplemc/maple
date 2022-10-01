package net.maple.io.hash.hashers.types;

import net.maple.io.hash.Hasher;

public class ObjectHasher<T> extends Hasher<T> {
	
	@Override
	public long hash(T object) {
		return object.hashCode();
	}
	
}
