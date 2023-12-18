import java.util.ArrayList;
import java.util.Scanner;

public class Budget {

    double calculateIncome(int income) {
        double totalExpenses;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your rent cost: ");
        double rent =  scanner.nextDouble();
        totalExpenses += rent;

        System.out.println("Enter your utilities cost: ");
        double utilies =  scanner.nextDouble();
        totalExpenses += utilies;

        System.out.println("Enter your transportation cost: ");
        double transportation =  scanner.nextDouble();
        totalExpenses += transportation;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
