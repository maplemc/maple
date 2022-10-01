package net.maple.io.hash.hashers;

import net.maple.io.hash.Hasher;

public class DoubleHasher extends Hasher<Double> {
	
	@Override
	public long hash(Double d) {
		return Double.doubleToLongBits(d);
	}
	
}
