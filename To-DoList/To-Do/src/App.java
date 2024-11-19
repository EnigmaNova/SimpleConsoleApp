public class App {
    private ToDo todo;
    private UserInput userInput;

    public App(){
        this.todo = new ToDo();
        this.userInput = new UserInput();
    }

    public void run(){
        boolean running = true;
        while(running){
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. View all tasks");
            System.out.println("2. Add a task");
            System.out.println("3. Update a task");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");

            int choice = userInput.getInt();

            switch(choice){
                case 1 -> viewAllTask();
                case 2 -> addTask();
                case 3 -> updateTask();
                case 4 -> deleteTask();
                case 5 -> running = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void viewAllTask(){
        todo.displayAllTaskTitles();
        System.out.print("Enter a task title to view details or press Enter to return to menu: ");
        String title = userInput.getString();
        if(!title.isEmpty()){
            Task task = todo.findTask(title);
            if(task != null){
                System.out.println(task);
            }else{
                System.out.println("Task is not found.");
            } 
        } 
    }

    public void addTask(){
        System.out.print("Enter task title: ");
        String title = userInput.getString();
        System.out.println("Enter task description: ");
        String description = userInput.getString();
        System.out.println("Enter task algorithm: ");
        String algo = userInput.getString();
        Task task = new Task(title, description, algo, false);
        todo.addTask(task);
    }

    public void updateTask(){
        System.out.print("Enter title of task to update: ");
        String title = userInput.getString();
        if(!title.isEmpty()){
            Task task = todo.findTask(title);
            if(task != null){
                System.out.print("Enter new description: ");
                String description = userInput.getString();
                System.out.print("Enter new algoritm:  ");
                String algo = userInput.getString();
                System.out.print("Is the task completed? (true/false): ");
                boolean completed = userInput.getBoolean();
                todo.updateTask(task, description, algo, completed);
            }
        }
    }

    public void deleteTask(){
        System.out.print("Enter title of task to delete: ");
        String title = userInput.getString();
        todo.deleteTask(title);
    }
    public static void main(String[] args) throws Exception {
        App todolist = new App();
        todolist.run();
    }
}
