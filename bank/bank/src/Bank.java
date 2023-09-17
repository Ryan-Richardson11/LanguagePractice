import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;
    private int accountNumber;
    private String accountType;
    private double accountBalance = 0.0;

    public Bank(String name, int accountNumber, String accountType, double accountBalance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    void addAccount(ArrayList<Bank>account){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the account holder's name: ");
        name = input.nextLine();
        System.out.println("Enter the account type: ");
        accountType = input.nextLine();
        Random random = new Random();
        int accountNumber = random.nextInt(1000);
        account.add(name, accountNumber, accountType, accountBalance);
    }

    void deposit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter and amount to deposit: ");
        this.accountBalance += input.nextDouble();
    }
        


    public static void main(String[] args) {

    }
}
