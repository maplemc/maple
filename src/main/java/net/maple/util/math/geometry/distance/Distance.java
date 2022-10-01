package net.maple.util.math.geometry.distance;

import net.maple.util.math.geometry.distance.distances.ChebyshevDistance;
import net.maple.util.math.geometry.distance.distances.DiagonalManhattanDistance;
import net.maple.util.math.geometry.distance.distances.EuclideanDistance;
import net.maple.util.math.geometry.distance.distances.ManhattanDistance;
import net.maple.util.math.geometry.distance.distances.SquaredEuclideanDistance;

public class Distance {
	
	public static final Distance EUCLIDEAN = new EuclideanDistance();
	public static final Distance SQUARED_EUCLIDEAN = new SquaredEuclideanDistance();
	
	public static final Distance MANHATTAN = new ManhattanDistance();
	public static final Distance DIAGONAL_MANHATTAN = new DiagonalManhattanDistance();
	
	public static final Distance CHEBYSHEV = new ChebyshevDistance();
	
	public double compute(int dx, int dz) {
		return compute(dx, 0, dz);
	}
	
	public double compute(int dx, int dy, int dz) {
		throw new UnsupportedOperationException();
	}
	
}
