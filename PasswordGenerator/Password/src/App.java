import java.util.Scanner;

public class App {
    private PasswordGenerator pass;
    private Scanner scan;

    public App(){
        this.pass = new PasswordGenerator();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        boolean running = true;
        while(running){

            System.out.print("Введите длину пароля: ");
            int length = scan.nextInt();

            System.out.print("Включить заглавные буквы? (y/n): ");
            boolean up = scan.next().equalsIgnoreCase("y");

            System.out.print("Включить строчные буквы? (y/n): ");
            boolean low = scan.next().equalsIgnoreCase("y");

            System.out.print("Включить цифры? (y/n): ");
            boolean dig = scan.next().equalsIgnoreCase("y");

            System.out.print("Включить специальные символы? (y/n): ");
            boolean special = scan.next().equalsIgnoreCase("y");

            try{
                String password = pass.generate(length, up, low, dig, special);
                System.out.println("generated password: " + password);
            } catch(IllegalArgumentException e){
                System.out.println("we have a problem: ");
                e.printStackTrace();
            }

            System.out.println();
            System.out.println("do you need a new password?(yes/no)");
            String choice = scan.next();
            if(choice.equals("no")){
                running = false;
            }

        }
        scan.close();
    }
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
