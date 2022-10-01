package net.maple.io.hash;

import net.maple.io.hash.hashers.BlockPosHasher;
import net.maple.io.hash.hashers.BooleanHasher;
import net.maple.io.hash.hashers.CharHasher;
import net.maple.io.hash.hashers.DoubleHasher;
import net.maple.io.hash.hashers.FloatHasher;
import net.maple.io.hash.hashers.IntegerHasher;
import net.maple.io.hash.hashers.LongHasher;
import net.maple.io.hash.hashers.ShortHasher;
import net.maple.io.hash.hashers.StringHasher;
import net.maple.path.search.node.hash.NodeHasher;

public abstract class Hasher<T> {
	
	public static final NodeHasher NODE = new NodeHasher();
	public static final BlockPosHasher BLOCK_POS = new BlockPosHasher();
	
	public static final StringHasher STRING = new StringHasher();
	public static final CharHasher CHAR = new CharHasher();
	
	public static final DoubleHasher DOUBLE = new DoubleHasher();
	public static final FloatHasher FLOAT = new FloatHasher();
	
	public static final LongHasher LONG = new LongHasher();
	public static final IntegerHasher INTEGER = new IntegerHasher();
	public static final ShortHasher SHORT = new ShortHasher();
	
	public static final BooleanHasher BOOLEAN = new BooleanHasher();
	
	public abstract long hash(T object);
	
}
