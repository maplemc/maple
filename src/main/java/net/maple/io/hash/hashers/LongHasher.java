package net.maple.io.hash.hashers;

import net.maple.io.hash.Hasher;

public class LongHasher extends Hasher<Long> {
	
	@Override
	public long hash(Long l) {
		return l;
	}
	
}
