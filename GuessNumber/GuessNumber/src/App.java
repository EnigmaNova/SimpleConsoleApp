import java.util.Scanner;

public class App {
    private GuessNumber guessNumber;
    private Scanner scan;
    public App(){
        this.guessNumber = new GuessNumber(); 
        this.scan = new Scanner(System.in);
    }

    public void run(){
        int pcNumber = guessNumber.generate();
        System.out.println("PC generate number.");
        System.out.println("Try to guess this number.");

        boolean running = true;
        while(running){
            System.out.print("Your guess: ");
            int guess = scan.nextInt();
            if(guess == pcNumber){
                running = false;
                System.out.println( "My congratilation! You right!");
            } else if(guess < pcNumber){
                System.out.println( "Little.");
            } else{
                System.out.println("Big.");
            }
        }

    }

    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
