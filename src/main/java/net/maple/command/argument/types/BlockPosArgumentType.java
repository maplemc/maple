package net.maple.command.argument.types;

import net.maple.command.MessageReader;
import net.maple.command.argument.ArgumentType;
import net.minecraft.util.math.BlockPos;

public class BlockPosArgumentType extends ArgumentType<BlockPos> {
	
	@Override
	public BlockPos parseMessage(MessageReader reader) {
		int x = ArgumentType.INTEGER.parseMessage(reader);
		int y = ArgumentType.INTEGER.parseMessage(reader);
		int z = ArgumentType.INTEGER.parseMessage(reader);
		
		return new BlockPos(x, y, z);
	}
	
}
