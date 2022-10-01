package net.maple.command;

import java.util.HashMap;
import java.util.LinkedHashMap;

import net.maple.command.argument.ArgumentList;
import net.maple.command.commands.AxisCommand;
import net.maple.command.commands.ETACommand;
import net.maple.command.commands.GotoCommand;
import net.maple.command.commands.HelpCommand;
import net.maple.command.commands.OriginCommand;
import net.maple.command.commands.StopCommand;
import net.maple.command.commands.ThisWayCommand;
import net.maple.command.commands.TunnelCommand;
import net.maple.command.commands.VersionCommand;
import net.maple.util.exception.ExceptionUtil;
import net.maple.util.object.NamedObject;

public class Command extends NamedObject {
	
	public static final Command TUNNEL = new TunnelCommand();
	public static final Command THIS_WAY = new ThisWayCommand();
	public static final Command AXIS = new AxisCommand();
	public static final Command ORIGIN = new OriginCommand();
	public static final Command GOTO = new GotoCommand();
	
	public static final Command STOP = new StopCommand();
	public static final Command ETA = new ETACommand();
	public static final Command VERSION = new VersionCommand();
	public static final Command HELP = new HelpCommand();
	
	private static final Command[] COMMANDS = new Command[] {
			HELP, VERSION, ETA, STOP,
			GOTO, ORIGIN, AXIS, THIS_WAY, TUNNEL
	};
	
	private HashMap<CommandPreset, CommandExecutor> executors = new LinkedHashMap<>();
	
	public Command(String name) {
		super(name);
	}
	
	public void addExecutor(CommandPreset preset, CommandExecutor executor) {
		executors.put(preset, executor);
	}
	
	public boolean parseMessage(CommandMessage message) {
		for(CommandPreset preset : executors.keySet()) {
			
			boolean parsed = parseMessage(message, preset);
			
			if(parsed) return true;
		}
		
		return false;
	}
	
	public boolean parseMessage(CommandMessage message, CommandPreset preset) {
		return !ExceptionUtil.catchExceptions(() -> {
			
			ArgumentList arguments = preset.parseMessage(message);
			
			parseMessage(message, preset, arguments);
			
		}, (exception) -> message.setException(exception));
	}
	
	public void parseMessage(CommandMessage message, CommandPreset preset, ArgumentList arguments) {
		CommandExecutor executor = executors.get(preset);
		
		executor.execute(message, arguments);
	}
	
	public HashMap<CommandPreset, CommandExecutor> getExecutors() {
		return executors;
	}
	
	public static Command getCommand(String name) {
		return (Command) NamedObject.probeArray(COMMANDS, name);
	}
	
	public static Command[] getCommands() {
		return COMMANDS;
	}
	
}
