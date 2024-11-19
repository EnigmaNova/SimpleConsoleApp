public class Task {
    private String title;
    private String description;
    private String algo;
    private boolean completed;

    public Task(){}
    public Task(String title, String description, String algo, boolean completed){
        this.title = title;
        this.description = description;
        this.algo = algo;
        this.completed = completed;
    }

    public String getTitle(){return title;}
    public void setTitile(String title){this.title = title;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public String getAlgo(){return algo;}
    public void setAlgo(String algo){this.algo = algo;}

    public boolean getCompleted(){return completed;}
    public void setCompleted(boolean completed){this.completed = completed;}

    @Override
    public String toString() {
        return "Title: " + title +
               "\nDescription: " + description +
               "\nAlgorithm: " + algo +
               "\nCompleted: " + (completed ? "Yes" : "No");
    }
}
