import java.util.Scanner;

public class LenghtConvertor {
    private final Scanner scan;

    public LenghtConvertor(Scanner scan){
        this.scan = scan;
    }

    public void convert(){
        System.out.println("\nLength Conversion");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Miles to Kilometers");
        System.out.println("4. Kilometers to Miles");
        System.out.print("Choose an option: ");

        int choice = scan.nextInt();
        double value = scan.nextDouble();
        double result = 0;

        switch(choice){
            case 1: 
                result = value / 1000;
                System.out.println(value + " meters = " + result + " kilometers");
                break;
            
            case 2:
                result = value * 1000;
                System.out.println(value + " kilometers = " + result + " meters");
                break;
            case 3:
                result = value * 1.60934;
                System.out.println(value + " miles = " + result + " kilometers");
                break;
            case 4:
                result = value / 1.60934;
                System.out.println(value + " kilometers = " + result + " miles");
                break;
            default:
                System.out.println("Invalid choice for length conversion.");
        }
    }
}
