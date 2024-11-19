import java.util.Scanner;

public class MassConvertor {
    private final Scanner scanner;

    public MassConvertor(Scanner scan){
        this.scanner = scan;
    }

    public void convert() {
        System.out.println("\nMass Conversion");
        System.out.println("1. Kilograms to Grams");
        System.out.println("2. Grams to Kilograms");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = value * 1000;
                System.out.println(value + " kilograms = " + result + " grams");
                break;
            case 2:
                result = value / 1000;
                System.out.println(value + " grams = " + result + " kilograms");
                break;
            case 3:
                result = value * 0.453592;
                System.out.println(value + " pounds = " + result + " kilograms");
                break;
            case 4:
                result = value / 0.453592;
                System.out.println(value + " kilograms = " + result + " pounds");
                break;
            default:
                System.out.println("Invalid choice for mass conversion.");
        }
    }
}
