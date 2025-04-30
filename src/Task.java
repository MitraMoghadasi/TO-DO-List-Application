public class Task {
    private Integer id;
    private String title;
    private String description;
    private boolean isCompleted;

    public Task(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = false;
        System.out.println("Task " + id + " : " + title + " Added");
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
        System.out.println("Task is done");
    }
    public void changeStatus(boolean completed) {
        isCompleted = completed;
        System.out.println("task status is changed to : " + isCompleted);
    }


}

