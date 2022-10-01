package net.maple.command.commands;

import net.maple.asset.text.TextAsset;
import net.maple.command.Command;
import net.maple.command.CommandPreset;
import net.maple.util.log.LogUtil;

public class VersionCommand extends Command {
	
	public VersionCommand() {
		super("version");
		
		addExecutor(CommandPreset.EMPTY, (message, arguments) -> {
			
			LogUtil.log("Installed: %s by %s", TextAsset.MOD_NAME_AND_VERSION, TextAsset.MOD_AUTHOR);
			
		});
	}
	
}
