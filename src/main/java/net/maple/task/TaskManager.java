package net.maple.task;

public class TaskManager {
	
	private static Task task;
	
	public static void startTask(Task task) {
		task = task;
	}
	
	public static void stopTask() {
		task = null;
	}
	
	public static Task getTask() {
		return task;
	}
	
}
