package net.maple.task.tasks;

import net.maple.path.search.goal.Goal;
import net.maple.task.Task;

public class CustomGoalTask extends Task {
	
	private Goal goal;
	
	public CustomGoalTask(Goal goal) {
		this.goal = goal;
	}
	
	@Override
	public Goal goal() {
		return goal;
	}
	
	public Goal getGoal() {
		return goal;
	}
	
}
