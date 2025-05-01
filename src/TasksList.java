import java.util.ArrayList;

public class TasksList {
    private ArrayList<Task> tasksList;

    public TasksList() {
        tasksList = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        tasksList.add(task);
        System.out.println("Task is added");
    }

    public void viewTasks() {
        System.out.println("List of tasks : ");
        for (int i = 0; i < tasksList.size(); i++) {
            Task task = tasksList.get(i);
            System.out.println(task.getTitle() + " - " + (task.isCompleted() ? "Done" : "In progress"));
        }
    }

    public void markAsCompleted(int index) {
        if (index >= 0 && index < tasksList.size()) {
            Task task = tasksList.get(index);
            task.markAsCompleted();
            int id = index + 1;
            System.out.println("Task number: " + id + " is done");
        } else {
            System.out.println("Invalid task");
        }
    }

    public int getTasksListSize() {
        return tasksList.size();
    }
}
