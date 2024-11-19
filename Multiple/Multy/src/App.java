import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to my table of multy.");
        System.out.println("Enter a number to get his values");

        int num = scan.nextInt();

        int[] arr = new int[10];
        for(int i = 0; i < 9; i++){
            arr[i] = num * (i+1);
            System.out.print(arr[i] + " ");
        }
    }
}
