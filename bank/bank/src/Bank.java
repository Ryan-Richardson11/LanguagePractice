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
        System.out.println("Enter and amount to withdraw: ");
        double amount = input.nextDouble();
        if (amount <= this.accountBalance) {
            this.accountBalance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    void accountDetails(ArrayList<Bank> accounts) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        int accountNumber = input.nextInt();
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

    void displayAccounts(ArrayList<Bank> accounts) {
        for (Bank account : accounts) {
            System.out.println(account);
        }
    }

    double totalBalance(ArrayList<Bank> accounts) {
        double total = 0.0;
        for (Bank account : accounts) {
            total += account.accountBalance;
        }
        return total;
    }

    public static void main(String[] args) {
        Bank myBank = new Bank("Ryan R", 1111, "Savings", 0.0);
        ArrayList<Bank> bankAccounts = new ArrayList<>();
        while (true) {
            System.out.println("Banking Options: ");
            System.out.println("Enter 1 to add an account: ");
            System.out.println("Enter 2 to display account details: ");
            System.out.println("Enter 3 to display all accounts: ");
            System.out.println("Enter 4 to display total balance: ");
            System.out.println("Enter 5 to withdraw: ");
            System.out.println("Enter 6 to deposit: ");
            System.out.println("Enter any other key to exit: ");
            Scanner input = new Scanner(System.in);
            int ans = input.nextInt();
            if (ans == 1) {
                myBank.addAccount(bankAccounts);
            } else if (ans == 2) {
                myBank.accountDetails(bankAccounts);
            } else if (ans == 3) {
                myBank.displayAccounts(bankAccounts);
            } else if (ans == 4) {
                myBank.totalBalance(bankAccounts);
            } else if (ans == 5) {
                myBank.withdraw();
            } else if (ans == 6) {
                myBank.deposit();
            } else {
                break;
            }
        }
    }
}
