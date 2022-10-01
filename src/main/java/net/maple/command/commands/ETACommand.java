package net.maple.command.commands;

import net.maple.command.Command;
import net.maple.command.CommandPreset;
import net.maple.util.log.LogUtil;

public class ETACommand extends Command {
	
	public ETACommand() {
		super("eta");
		
		addExecutor(CommandPreset.EMPTY, (message, arguments) -> {
			
			LogUtil.log("Estimated time until arrival: N/A");
			
		});
	}
	
}
