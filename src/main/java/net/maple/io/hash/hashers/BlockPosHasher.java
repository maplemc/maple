package net.maple.io.hash.hashers;

import net.maple.io.hash.Hasher;
import net.minecraft.util.math.BlockPos;

public class BlockPosHasher extends Hasher<BlockPos> {
	
	@Override
	public long hash(BlockPos pos) {
		return pos.asLong();
	}
	
	public long hash(int x, int y, int z) {
		return BlockPos.asLong(x, y, z);
	}
	
}
