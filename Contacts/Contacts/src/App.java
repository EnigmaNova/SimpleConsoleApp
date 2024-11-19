import java.util.Scanner;

public class App {
    private ContactManager manager;
    private Scanner scan;
    
    public App(){
        this.manager = new ContactManager();
        this.scan = new Scanner(System.in);
    }

    public void run(){
        boolean running = true;
        while(running){
            System.out.println("My contact list: ");
            System.out.println("1. Display all contacts.");
            System.out.println("2. Add new contact.");
            System.out.println("3. Update contact.");
            System.out.println("4. Delete contact.");
            System.out.println("5. Close this program.");

            int choice = scan.nextInt();
            switch(choice){
                case 1 -> displayAllContactsName();
                case 2 -> addContact();
                case 3 -> updateContact();
                case 4 -> deleteContact();
                case 5 -> running = false;
                default -> System.out.println("Invalid command.");
            }
        }
    }

    public void displayAllContactsName(){
        manager.displayAllContactsName();

        System.out.print("Write the name of interesting contact for more information.");
        String name = scan.next();
        if(!name.isEmpty()){
            Contact contact = manager.findContact(name);
            if(contact != null){
                System.out.println(contact);
            } else{
                System.out.println("The contact not found.");
            }
        }
    }

    public void addContact(){
        System.out.print("Enter the name of new contact: ");
        String name = scan.next();
        System.out.print("Enter the phone of new contact: ");
        String phone = scan.next();
        System.out.print("Enter the email of new contact: ");
        String email = scan.next();
        Contact contact = new Contact(name, phone, email);
        manager.addContact(contact);
    }

    public void updateContact(){
        System.out.print("Enter the name of updating contact: ");
        String name = scan.nextLine();

        if(!name.isEmpty()){
            Contact contact = manager.findContact(name);
            if(contact != null){
                System.out.print("Enter a new phone for the contact: ");
                String phone = scan.nextLine();
                System.out.print("Enter a new email for the contact: ");
                String email = scan.nextLine();
                manager.updateContact(contact, phone, email);
            }
        }
    }

    public void deleteContact(){
        System.out.print("Enter a name of contact to delete: ");
        String name = scan.nextLine();
        manager.deleteContact(name);
    }
    public static void main(String[] args) throws Exception {
        App a = new App();
        a.run();
    }
}
