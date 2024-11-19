import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App {

    private Scanner scan;

    public App(){
        this.scan = new Scanner(System.in);
    }

    public static long calculate(int year1, int month1, int day1, int year2, int month2, int day2){
        LocalDate startDate = LocalDate.of(year1, month1, day1);
        LocalDate endDate = LocalDate.of(year2, month2, day2);
            
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public void run(){
        System.out.println("Enter first date: ");
        System.out.println("Enter year: ");
        int year1 = scan.nextInt();
        System.out.println("Enter month: ");
        int month1 = scan.nextInt();
        System.out.println("Enter day: ");
        int day1 = scan.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("Enter year: ");
        int year2 = scan.nextInt();
        System.out.println("Enter month: ");
        int month2 = scan.nextInt();
        System.out.println("Enter day: ");
        int day2 = scan.nextInt();

        long res = calculate(year1, month1, day1, year2, month2, day2);
        System.out.println(res);
    }

    
    
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
