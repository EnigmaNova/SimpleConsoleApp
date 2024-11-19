import java.util.Scanner;

public class TemperatureConvertor {
    private final Scanner scanner;

    public TemperatureConvertor(Scanner scan){
        this.scanner = scan;
    }
    
    public void convert() {
        System.out.println("\nTemperature Conversion");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = (temp * 9/5) + 32;
                System.out.println(temp + "°C = " + result + "°F");
                break;
            case 2:
                result = (temp - 32) * 5/9;
                System.out.println(temp + "°F = " + result + "°C");
                break;
            default:
                System.out.println("Invalid choice for temperature conversion.");
        }
    }
}
