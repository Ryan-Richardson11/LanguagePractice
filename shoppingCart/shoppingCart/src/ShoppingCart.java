import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

    public class Product {
        String productName;
        double price;
        int quantity;

        public Product(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        String getProductName() {
            return productName;
        }

        double getPrice() {
            return price;
        }

        int getQuantity() {
            return quantity;
        }

        void displayOptions() {
            System.out.println("Enter 1 to add a product: ");
            System.out.println("Enter 2 to remove a product: ");
            System.out.println("Enter 3 to view a the cart: ");
            System.out.println("Enter 4 to view the total cost: ");
            System.out.println("Enter 5 to exit the program: ");
        }

        void addProduct(ArrayList<Product>) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a product name: ");
            String productName = input.nextLine();
            System.out.println("Enter a product price: ");
            double price = input.nextDouble();
            System.out.prinln("Enter the product quantity: ");
            int quantity = input.nextInt();
            ArrayList.add(Product(productName, price, quantity));
    }

    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();
    }
}
