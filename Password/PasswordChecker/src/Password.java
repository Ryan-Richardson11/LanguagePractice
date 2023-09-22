import java.util.Scanner;

public class Password {

    String createPassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = input.nextLine();
        return password;
    }

    void checkPassword(String password) {
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    continue;
                }
                if (Character.isLowerCase(password.charAt(i))) {
                    continue;
                }
                if (Character.isDigit(password.charAt(i))) {
                    continue;
                }
                if (password.length() >= 8 && password.length() <= 11) {
                    System.out.println("Password strength: Weak");
                    break;
                }
                if (password.length() >= 12 && password.length() <= 14) {
                    System.out.println("Password strength: Medium");
                    break;
                } else {
                    System.out.println("Password strength: Strong");
                    break;
                }
            }
            System.out.println("Invalid Password");
        }
    }

    public static void main(String[] args) {
        Password password = new Password();
        String ans = password.createPassword();
        password.checkPassword(ans);
    }
}
