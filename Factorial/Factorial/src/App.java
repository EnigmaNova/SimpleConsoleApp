import java.util.Scanner;

public class App {
    private Caltulate manager;
    private Scanner scan;

    public App(){
        this.manager = new Caltulate();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        System.out.println("Enter a number: ");
        double num = scan.nextDouble();

        System.out.println(manager.fact(num));
    }
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
