import java.util.Scanner;

public class UserInput {
    private Scanner scan;

    UserInput(){
        this.scan = new Scanner(System.in);
    }

    public double getOperand(){
        System.out.println("please, write a first number: ");
        return scan.nextDouble();
    }

    public String getOperator(){
        System.out.println("please, write the operator: ");
        return scan.next();
    }
}
