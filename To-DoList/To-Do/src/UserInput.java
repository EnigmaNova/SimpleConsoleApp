import java.util.Scanner;

public class UserInput {
    private Scanner scan;

    public UserInput(){
        this.scan = new Scanner(System.in);
    }

    public String getString(){
        return scan.nextLine();
    }

    public int getInt(){
        return Integer.parseInt(scan.nextLine());
    }

    public boolean getBoolean(){
        return Boolean.parseBoolean(scan.nextLine());
    }
}
