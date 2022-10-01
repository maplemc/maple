package net.maple.util.math.geometry.distance.distances;

import net.maple.util.math.geometry.distance.Distance;

public class ManhattanDistance extends Distance {
	
	@Override
	public double compute(int dx, int dy, int dz) {
		return Math.abs(dx) + Math.abs(dy) + Math.abs(dz);
	}
	
}
