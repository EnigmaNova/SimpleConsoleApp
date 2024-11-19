import java.util.ArrayList;

public class ToDo {
    private ArrayList<Task> list;

    public ToDo(){
        this.list = new ArrayList<>();
    }

    public void addTask(Task task){
        list.add(task);
        System.out.println("Task added successfully.");
    }

    public Task findTask(String title){
        for (Task task : list) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                return task;
            }
        }
        return null;
    }
    public void updateTask(Task task, String description, String algo, boolean completed){
        task.setDescription(description);
        task.setAlgo(algo);
        task.setCompleted(completed);
        System.out.println("Task updated successfully.");
    }

    public void deleteTask(String title){
        Task task = findTask(title);
        if(task != null){
            list.remove(task);
            System.out.println("Task deleted successfully.");
        } else{
            System.out.println("Task not found.");
        }
    }

    public void displayAllTaskTitles() {
        if (list.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Task Titles:");
            for (Task task : list) {
                System.out.println("- " + task.getTitle());
            }
        }
    }
}
