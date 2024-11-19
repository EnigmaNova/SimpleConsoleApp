import java.util.Scanner;

public class App {
    SimpleChat simpleChat;
    Scanner scan;

    public App(){
        this.simpleChat = new SimpleChat();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        boolean running = true;
        while(running == true){
            System.out.println("1. start chatting.");
            System.out.println("2. Close this program.");

            int choice = scan.nextInt();
            if(choice == 1){
                System.out.println("Write your santance or question to chat: ");
                String request = scan.next();
                System.out.println( simpleChat.chat(request));
            } else{
                running = false;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
