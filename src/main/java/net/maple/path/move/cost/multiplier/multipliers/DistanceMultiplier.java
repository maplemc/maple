package net.maple.path.move.cost.multiplier.multipliers;

import net.maple.path.move.cost.multiplier.CostMultiplier;
import net.maple.util.math.MathConstants;

public class DistanceMultiplier {
	
	public static final double ONE_BLOCK = CostMultiplier.ONCE;
	public static final double ONE_DIAGONAL_BLOCK = MathConstants.ROOT_TWO * ONE_BLOCK;
	
}
