import java.util.Scanner;

public class App {
    private RandomNumber random;
    private Scanner scan;

    public App(){
        this.random = new RandomNumber();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        boolean running = true;
        while(running){
            System.out.println("My generator: ");
            System.out.println("1. generate random numbers.");
            System.out.println("2. exit.");

            int choice = scan.nextInt();
            if(choice == 1){
                rand();
            } else if(choice == 2){
                running = false;
            } else{
                System.out.println("Invalid command.");
            }
        }
    }

    public void rand(){
        System.out.println("write how much numbers you need");
        int count = scan.nextInt();
        System.out.println("Write the left border.");
        int left = scan.nextInt();
        System.out.println("Write the right border.");
        int right = scan.nextInt();
        for(int i = 1; i <= count; i++){
            System.out.print(random.rand(left, right) + " ");
        }
    }
    public static void main(String[] args) throws Exception {
        App gen = new App();
        gen.run();
    }
}
