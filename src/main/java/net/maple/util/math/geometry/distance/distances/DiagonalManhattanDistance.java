package net.maple.util.math.geometry.distance.distances;

import net.maple.util.math.MathConstants;
import net.maple.util.math.geometry.distance.Distance;

public class DiagonalManhattanDistance extends Distance {
	
	private static final double ROOT_TWO_MINUS_ONE = MathConstants.ROOT_TWO - 1;
	
	@Override
	public double compute(int dx, int dz) {
		dx = Math.abs(dx);
		dz = Math.abs(dz);
		
		int i = Math.min(dx, dz);
		int j = Math.max(dx, dz);
		
		return ROOT_TWO_MINUS_ONE * i + j;
	}
	
}
