import java.util.Scanner;

public class App {

    private CurrencyConvertor convertor;
    private Scanner scan;

    public App(){
        this.convertor = new CurrencyConvertor();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        System.out.println("welcome to my convertor");

        System.out.print("Enter the currency you are converting from (e.g., USD, EUR, RUB): ");
        String convertFrom = scan.nextLine();

        System.out.print("Enter the currency you are converting to (e.g., USD, EUR, RUB): ");
        String convertTo = scan.nextLine();

        System.out.print("Enter the amount to convert: ");
        while(!scan.hasNextDouble()){
            System.out.println("Invalid input. Please enter a number.");
            scan.next();
            System.out.print("Enter the amount to convert: ");
        }

        double amount = scan.nextDouble();
        
        try{
            double res = convertor.convert(convertFrom, convertTo, amount);
            System.out.printf("%.2f %s is equivalent to %.2f %s%n", amount, convertFrom, res, convertTo);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
