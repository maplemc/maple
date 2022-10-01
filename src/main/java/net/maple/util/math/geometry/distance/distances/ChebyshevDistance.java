package net.maple.util.math.geometry.distance.distances;

import net.maple.util.math.geometry.distance.Distance;

public class ChebyshevDistance extends Distance {
	
	@Override
	public double compute(int dx, int dz) {
		return Math.max(dx, dz);
	}
	
}
