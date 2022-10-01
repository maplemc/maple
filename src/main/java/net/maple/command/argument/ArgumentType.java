package net.maple.command.argument;

import net.maple.command.MessageReader;
import net.maple.command.argument.types.BlockPosArgumentType;
import net.maple.command.argument.types.BooleanArgumentType;
import net.maple.command.argument.types.CharArgumentType;
import net.maple.command.argument.types.DoubleArgumentType;
import net.maple.command.argument.types.FloatArgumentType;
import net.maple.command.argument.types.GoalArgumentType;
import net.maple.command.argument.types.IntegerArgumentType;
import net.maple.command.argument.types.LongArgumentType;
import net.maple.command.argument.types.ShortArgumentType;
import net.maple.command.argument.types.StringArgumentType;
import net.maple.command.argument.types.UUIDArgumentType;

public class ArgumentType<T> {
	
	public static final GoalArgumentType GOAL = new GoalArgumentType();
	public static final BlockPosArgumentType BLOCK_POS = new BlockPosArgumentType();
	
	public static final UUIDArgumentType UUID = new UUIDArgumentType();
	
	public static final DoubleArgumentType DOUBLE = new DoubleArgumentType();
	public static final FloatArgumentType FLOAT = new FloatArgumentType();
	
	public static final LongArgumentType LONG = new LongArgumentType();
	public static final IntegerArgumentType INTEGER = new IntegerArgumentType();
	public static final ShortArgumentType SHORT = new ShortArgumentType();
	
	public static final BooleanArgumentType BOOLEAN = new BooleanArgumentType();
	
	public static final CharArgumentType CHAR = new CharArgumentType();
	public static final StringArgumentType STRING = new StringArgumentType();
	
	public T parseMessage(MessageReader reader) {
		throw new IllegalArgumentException();
	}
	
}
