import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;
    private int accountNumber;
    private String accountType;
    private double accountBalance = 0.0;

    public Bank(String name, int accountNumber, String accountType, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    void addAccount(ArrayList<Bank> accounts) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the account holder's name: ");
        name = input.nextLine();
        System.out.println("Enter the account type: ");
        accountType = input.nextLine();
        Random random = new Random();
        int accountNumber = random.nextInt(1000);
        accounts.add(new Bank(name, accountNumber, accountType, accountBalance));
    }

    int getAccountNumber() {
        return this.accountNumber;
    }

    String getName() {
        return this.name;
    }

    String getAccountType() {
        return this.accountType;
    }

    void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter and amount to deposit: ");
        this.accountBalance += input.nextDouble();
    }

    void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter and amount to deposit: ");
        double amount = input.nextDouble();
        if (amount <= this.accountBalance) {
            this.accountBalance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    void accountDetails(ArrayList<Bank> accounts, int accountNumber) {
        for (Bank account : accounts) {
            if (accountNumber == account.getAccountNumber()) {
                System.out.println("Account Details: ");
                System.out.println("Name: " + account.getName());
                System.out.println("Account Type: " + account.accountType);
                System.out.println("Balance: " + accountBalance);
            }
            System.out.println("Account number not found.");
        }
    }

    public static void main(String[] args) {

    }
}
