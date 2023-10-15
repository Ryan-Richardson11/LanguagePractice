import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> book = new ArrayList<>();

    public AddressBook() {
        String name;
        String phoneNumber;
        String email;
    }

    void addContact(String name, int phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        book.add(newContact);
    }
    
    void displayContacts() {
        for (Contact contact : book) {
            System.out.println(contact);
        }
    }

    void searchContact(String name) {
        for (Contact contact : book) {
            if (contact.getName() == name) {
                System.out.println(contact.getName());
                System.out.println(contact.getphoneNumber());
                System.out.println(contact.getEmail());
            }
        }
    }

    void searchContact(String phoneNumber) {
        for (Contact contact : book) {
            if (contact.getphoneNumber() == phoneNumber) {
                System.out.println(contact.getName());
                System.out.println(contact.getphoneNumber());
                System.out.println(contact.getEmail());
            }
        }
    }

    void updateContact() {
        System.out.println("Enter the contacts Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        for (Contact contact : book) {
            if (contact.getName() == name) {
                System.out.println("Update the contacts name: ");
                Scanner updateName = new Scanner(System.in);
                String newName = updateName.nextLine();
                contact.setName(newName);

                System.out.println("Update the contacts number: ");
                Scanner updateNumber = new Scanner(System.in);
                String newNumber = updateNumber.nextLine();
                contact.setphoneNumber(newNumber);

                System.out.println("Update the contacts email: ");
                Scanner updateEmail = new Scanner(System.in);
                String newEmail = updateEmail.nextLine();
                contact.setEmail(newEmail);

                System.out.println("The updated contact is: ");
                System.out.println(contact.getName() + " " + contact.getphoneNumber() + " " contact.getEmail());
            }
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact("Ryan", "9783021710", "ryanrich811@gmail.com");
    }
}
