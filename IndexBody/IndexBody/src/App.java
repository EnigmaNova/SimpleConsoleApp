import java.util.Scanner;

public class App {
    private IndexBody manager;
    private Scanner scan;

    public App(){
        this.manager = new IndexBody();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        System.out.println("Welcome to my app to calculate the mass of body.");
        System.out.println("Please, write the next datas to calculate");
        System.out.println("your height (in meters): ");
        double height = scan.nextDouble();
        System.out.println("please write your wes(kg): ");
        int wes = scan.nextInt();

        if(height > 0 && wes > 0){
            System.out.println( manager.calculation(height, wes)+ " - your index of body");
        } else{
            System.out.println("we cannot calculate it.");
        }
    }
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
