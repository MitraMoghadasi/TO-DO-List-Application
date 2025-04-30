import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Task firstTask = new Task(1, "Add", "Add data");
//        Task secondTask = new Task(2, "Delete", "Delete Data");
//
//        firstTask.isCompleted();
//
//        firstTask.markAsCompleted();
//
//        firstTask.changeStatus(false);

        TasksList tasksList = new TasksList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your Todo List!");

        while (true) {
            System.out.println("\nChoose an action: add | view | complete [number] | exit");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("add")) {
//            System.out.println("Enter task id: ");
//            Integer id = Integer.valueOf(scanner.nextLine());
                int newId = tasksList.getTasksListSize() + 1;
                System.out.println("Enter task title: ");
                String title = scanner.nextLine();
                System.out.print("Enter task description: ");
                String description = scanner.nextLine();

                Task task = new Task(newId, title, description);
                tasksList.addTask(task);
                System.out.println("Task added");
            } else if (input.equalsIgnoreCase("view")) {
                tasksList.viewTasks();
            } else if (input.startsWith("complete")) {
                String[] parts = input.split(" ");

                if (parts.length == 2) {
                    try {
                        int index = Integer.parseInt(parts[1]) - 1;
                        tasksList.markAsCompleted(index);
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a valid number");
                    }
                } else System.out.println("Correct format : complete 1");
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Unknown command, Try again");
            }
        }
        scanner.close();
    }
}
