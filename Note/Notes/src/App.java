import java.util.Scanner;

public class App {
    private NoteManager manager;
    private Scanner scan;

    public App(){
        this.manager = new NoteManager();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        boolean running = true;
        while(running){
            System.out.println("Welcome to my notes.");
            System.out.println("1. Display all.");
            System.out.println("2. Add a new note.");
            System.out.println("3. Update a note.");
            System.out.println("4. Delete a note.");
            System.out.println("5. Close this program.");

            int choice = scan.nextInt();
            switch(choice){
                case 1 -> displayAllNote();
                case 2 -> addNote();
                case 3 -> updateNote();
                case 4 -> deleteNote();
                case 5 -> running = false;
                default -> System.out.println("Invalid command");
            }

        }
    }

    public void displayAllNote(){
        scan.nextLine();
        manager.displayAllNoteTitles();

        System.out.println("Write the title of interesting note for you:");
        String title = scan.nextLine();
        if(!title.isEmpty()){
            Note note = manager.findNote(title);
            if(note != null){
                System.out.println(note);
            } else{
                System.out.println("");
            }
        }
    }

    public void addNote(){
        scan.nextLine(); // Очистка буфера, если перед этим был вызван nextInt() или next()

        System.out.print("Write the title of your note: ");
        String title = scan.nextLine();

        System.out.print("Write the text of your note: ");
        String text = scan.nextLine();

        Note note = new Note(title, text);
        manager.addNote(note);
    }

    public void updateNote(){
        scan.nextLine();
        System.out.println("Enter the title of note to update: ");
        String title = scan.next();

        if(!title.isEmpty()){
            Note note = manager.findNote(title);
            if(note != null){
                System.out.println("Enter new text for this note: ");
                scan.nextLine();
                String text = scan.nextLine();
                manager.updateNote(note, text);
            } else{
                System.out.println("You dont have this note.");
            }
        }
    }

    public void deleteNote(){
        scan.nextLine();
        System.out.println("Enter a title of note to delete. ");
        String title = scan.nextLine();
        manager.deleteNote(title);
    }
   
    public static void main(String[] args) throws Exception {
       App a = new App();
       a.run();
    }
}
