import java.util.Scanner;

public class App {
    private Mechanism manager;
    private Scanner scan;

    public App(){
        this.manager = new Mechanism();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        System.out.println("Enter a string.");
        String line = scan.nextLine();
        System.out.println("Enter a word that you want to check.");
        String part = scan.nextLine();
        System.out.println(manager.findWord(line, part));
    }

    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
