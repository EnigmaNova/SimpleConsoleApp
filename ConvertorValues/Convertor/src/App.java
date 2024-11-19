import java.util.Scanner;

public class App {

    private UnitConvertor converter;
    private Scanner scan;

    public App(){
        this.converter = new UnitConvertor();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        boolean running = true;
        while(running){
            System.out.println("\nPhysical Unit Converter");
            System.out.println("1. Convert Length");
            System.out.println("2. Convert Mass");
            System.out.println("3. Convert Temperature");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();

            switch(choice){
                case 1:
                    converter.convertLenght();
                    break;
                case 2:
                    converter.convertMass();
                    break;
                case 3:
                    converter.convertTemp();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the progtam.");
                default:
                    System.out.println("Invalid choice. Please try again.");            
            }
        }
    }
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
