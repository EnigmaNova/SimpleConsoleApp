import java.util.Scanner;

public class App {
    private managerPolindrom manager;
    private Scanner scan;

    public App(){
        this.manager = new managerPolindrom();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        System.out.println("Enter a word to check on polindrom.");
        String text = scan.nextLine();
        boolean isPolindrom = manager.isPolindrom(text);
        if(isPolindrom){
            System.out.println("is a polindrom.");
        } else{
            System.out.println("is not a polindrom.");
        }
    }
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
