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

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void displayOptions() {
            System.out.println("Enter 1 to add a product: ");
            System.out.println("Enter 2 to remove a product: ");
            System.out.println("Enter 3 to view a the cart: ");
            System.out.println("Enter 4 to view the total cost: ");
            System.out.println("Enter anything else to exit the program: ");
        }

        public void addProduct(ArrayList<Product> cart) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a product name: ");
            String productName = input.nextLine();
            System.out.println("Enter a product price: ");
            double price = input.nextDouble();
            System.out.println("Enter the product quantity: ");
            int quantity = input.nextInt();
            cart.add(new Product(productName, price, quantity));
            input.close();
        }

        public void deleteProduct(ArrayList<Product> cart) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a product name to delete: ");
            productName = input.nextLine();
            for (Product product : cart) {
                if (productName == product.getProductName()){
                    cart.remove(product);
                }
                else {
                    System.out.println("The product is not in the cart.");
                }
            }
            input.close();
        }

        public void displayCart(ArrayList<Product> cart) {
            for (Product product: cart){
                System.out.println(product);
            }
        }

        public double cartCost(ArrayList<Product> cart) {
            double total = 0;
            for (Product product : cart) {
                total += product.getPrice();
            }
            return total;
        }
    }

    public static void main(String[] args) {
        ShoppingCart shopping = new ShoppingCart();
        ArrayList<Product> cart = new ArrayList<>();
        shopping.displayOptions();
        Scanner input = new Scanner(System.in);
        int ans = input.nextInt();
        if (ans == 1) {
            addProduct(cart);
        }
        else if (ans == 2) {
            deleteProduct(cart);
        }
        else if (ans == 3) {
            displayCart(cart);
        }
        else if (ans == 4) {
            cartCost(cart);
        }
        else {
            break;
        }
    }
}
