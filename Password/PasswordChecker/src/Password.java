import java.util.Scanner;

public class Password {

    String createPassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password ('Exit' to exit): ");
        String password = input.nextLine();
        return password;
    }

    void checkPassword(String password) {

        if (password.length() >= 8) {
            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    hasLowercase = true;
                } else if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                }
            }
            if (hasUppercase && hasLowercase && hasDigit == true) {
                if (password.length() >= 8 && password.length() <= 11) {
                    System.out.println("Password strength: Weak");
                } else if (password.length() >= 12 && password.length() <= 14) {
                    System.out.println("Password strength: Medium");
                } else {
                    System.out.println("Password strength: Strong");
                }
            } else {
                System.out.println("Invalid Password");

            }
        }
    }

    public static void main(String[] args) {
        Password password = new Password();
        while (true) {
            String ans = password.createPassword();
            if (ans.equals("Exit")) {
                break;
            } else {
                password.checkPassword(ans);
            }
        }
    }
}
