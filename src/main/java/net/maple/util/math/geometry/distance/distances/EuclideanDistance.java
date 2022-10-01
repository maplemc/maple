package net.maple.util.math.geometry.distance.distances;

import net.maple.util.math.geometry.distance.Distance;

public class EuclideanDistance extends Distance {
	
	@Override
	public double compute(int dx, int dy, int dz) {
		double distance = Distance.SQUARED_EUCLIDEAN.compute(dx, dy, dz);
		
		return Math.sqrt(distance);
	}
	
}
