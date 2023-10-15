import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> book = new ArrayList<>();

    public AddressBook() {
        String name;
        int phoneNumber;
        String email;
    }

    void addContact(String name, int phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        book.add(newContact);
    }
    
    void displayContacts() {
        for (Contact contact : book) {
            System.out.println(contact.getName());
            System.out.println(contact.getphoneNumber());
            System.out.println(contact.getEmail());
            System.out.println("----------------------------");
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

    void searchContact(int phoneNumber) {
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
            if (contact.getName().equals(name)) {
                System.out.println("Update the contacts name: ");
                Scanner updateName = new Scanner(System.in);
                String newName = updateName.nextLine();
                contact.setName(newName);

                System.out.println("Update the contacts number: ");
                Scanner updateNumber = new Scanner(System.in);
                int newNumber = updateNumber.nextInt();
                contact.setphoneNumber(newNumber);

                System.out.println("Update the contacts email: ");
                Scanner updateEmail = new Scanner(System.in);
                String newEmail = updateEmail.nextLine();
                contact.setEmail(newEmail);

                System.out.println("The updated contact is: ");
                System.out.println(contact.getName() + " " + contact.getphoneNumber() + " " + contact.getEmail());
            }
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        addressBook.addContact("Ryan", 1710, "ryanrich811@gmail.com");
        addressBook.addContact("Sydnie", 6463, "Sydniedrattee@gmail.com");
        addressBook.addContact("Mike", 9063, "MikeSmith@gmail.com");
        addressBook.addContact("John", 1123, "JohnDoe@gmail.com");

        addressBook.displayContacts();

        addressBook.searchContact("Ryan");

        addressBook.updateContact();
    }
}
