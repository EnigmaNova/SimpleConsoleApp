import java.util.Scanner;

public class App {
    private shifr shif;
    private Scanner scan;

    public App(){
        this.shif = new shifr();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        System.out.println("weclom to Cezar convertor.");
        System.out.println("Enter your message: ");
        String str = scan.nextLine();
        String res = shif.cezarConstr(str);
        System.out.println("your shifed message - " + res);
    }

    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
