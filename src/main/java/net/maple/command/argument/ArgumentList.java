package net.maple.command.argument;

import java.util.ArrayList;
import java.util.List;

public class ArgumentList {
	
	private List<Object> arguments = new ArrayList<>();
	
	public ArgumentList(Object... arguments) {
		for(Object argument : arguments) {
			
			addArgument(argument);
		}
	}
	
	public void addArgument(Object argument) {
		arguments.add(argument);
	}
	
	public Object first() {
		return getArgument(0);
	}
	
	public Object second() {
		return getArgument(1);
	}
	
	public Object third() {
		return getArgument(2);
	}
	
	public Object getArgument(int index) {
		return arguments.get(index);
	}
	
	public List<Object> getArguments() {
		return arguments;
	}
	
}
