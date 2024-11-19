import java.util.Scanner;

public class UserInput {
    private Scanner scan;

    public UserInput(){
        this.scan = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("message");
        return scan.nextLine();
    }

    public int getInt(){
        System.out.println("message");
        return Integer.parseInt(scan.nextLine());
    }
}
