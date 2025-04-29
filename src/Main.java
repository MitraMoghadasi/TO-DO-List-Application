public class Main {
    public static void main(String[] args) {

        Task firstTask = new Task(1, "Add", "Add data");
        Task secondTask = new Task(2, "Delete", "Delete Data");

        firstTask.isCompleted();

        firstTask.markAsCompleted();

        firstTask.changeStatus(false);

    }
}
