public class Contact {
    String name;
    int phoneNumber;
    String email;

    public Contact(String name, int phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    String getName() {
        return this.name;
    }

    void setName(String newName) {
        this.name = newName;
    }

    int getphoneNumber() {
        return this.phoneNumber;
    }

    void setphoneNumber(int newphoneNumber) {
        this.phoneNumber = newphoneNumber;
    }

    String getEmail() {
        return this.email;
    }

    void setEmail(String newEmail) {
        this.email = newEmail;
    }
}
