package net.maple.io.serialize;

import net.maple.io.resource.Resource;
import net.maple.io.serialize.serializers.BitSetSerializer;
import net.maple.io.serialize.serializers.BooleanSerializer;
import net.maple.io.serialize.serializers.CharSerializer;
import net.maple.io.serialize.serializers.DoubleSerializer;
import net.maple.io.serialize.serializers.FloatSerializer;
import net.maple.io.serialize.serializers.IntegerSerializer;
import net.maple.io.serialize.serializers.LongSerializer;
import net.maple.io.serialize.serializers.ShortSerializer;
import net.maple.io.serialize.serializers.StringSerializer;
import net.maple.io.serialize.serializers.UUIDSerializer;
import net.maple.io.serialize.serializers.list.serializers.BooleanListSerializer;
import net.maple.io.serialize.serializers.list.serializers.DoubleListSerializer;
import net.maple.io.serialize.serializers.list.serializers.FloatListSerializer;
import net.maple.io.serialize.serializers.list.serializers.IntegerListSerializer;
import net.maple.io.serialize.serializers.list.serializers.LongListSerializer;
import net.maple.io.serialize.serializers.list.serializers.ShortListSerializer;
import net.maple.io.serialize.serializers.list.serializers.UUIDListSerializer;

public abstract class Serializer<T> {
	
	public static final BitSetSerializer BIT_SET = new BitSetSerializer();
	
	public static final StringSerializer STRING = new StringSerializer();
	public static final CharSerializer CHAR = new CharSerializer();
	
	public static final UUIDSerializer UUID = new UUIDSerializer();
	public static final UUIDListSerializer UUID_LIST = new UUIDListSerializer();
	
	public static final DoubleSerializer DOUBLE = new DoubleSerializer();
	public static final DoubleListSerializer DOUBLE_LIST = new DoubleListSerializer();
	
	public static final FloatSerializer FLOAT = new FloatSerializer();
	public static final FloatListSerializer FLOAT_LIST = new FloatListSerializer();
	
	public static final LongSerializer LONG = new LongSerializer();
	public static final LongListSerializer LONG_LIST = new LongListSerializer();
	
	public static final IntegerSerializer INTEGER = new IntegerSerializer();
	public static final IntegerListSerializer INTEGER_LIST = new IntegerListSerializer();
	
	public static final ShortSerializer SHORT = new ShortSerializer();
	public static final ShortListSerializer SHORT_LIST = new ShortListSerializer();
	
	public static final BooleanSerializer BOOLEAN = new BooleanSerializer();
	public static final BooleanListSerializer BOOLEAN_LIST = new BooleanListSerializer();
	
	public abstract T readFrom(Resource resource);
	public abstract void writeTo(Resource resource, T object);
	
}
