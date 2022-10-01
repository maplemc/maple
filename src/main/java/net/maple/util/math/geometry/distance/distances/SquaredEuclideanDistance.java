package net.maple.util.math.geometry.distance.distances;

import net.maple.util.math.geometry.distance.Distance;

public class SquaredEuclideanDistance extends Distance {
	
	@Override
	public double compute(int dx, int dy, int dz) {
		return dx * dx + dy * dy + dz * dz;
	}
	
}
