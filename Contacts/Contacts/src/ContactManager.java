import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> list;

    public ContactManager(){
        list = new ArrayList<>();
    }

    public void addContact(Contact contact){
        list.add(contact);
        System.out.println("Contact added successfully");
    }

    public Contact findContact(String name){
        for(Contact contact : list){
            if(contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }

    public void updateContact(Contact contact, String phone, String email){
        contact.setEmail(email);
        contact.setPhone(phone);
        System.out.println("Contact updated successfully");
    }

    public void deleteContact(String name){
        Contact contact = findContact(name);
        if(contact != null){
            list.remove(contact);
            System.out.println("Task deleted successfully.");
        } else{
            System.out.println("Contact not found.");
        }
    }

    public void displayAllContactsName(){
        if(list.isEmpty()){
            System.out.println("No contacts available.");
        } else{
            System.out.println("Contact names: ");
            for(Contact contact : list){
                System.out.println("- " + contact.getName());
            }
        }
    }
}
