public class ShoppingCart {

    public class Product {
        String productName;
        double price;
        int quantity;

        public Product() {
            String productName;
            double price;
            int quantity;
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
    }

    public class Cart extends Product {
        void displayOptions() {
            System.out.println("Enter 1 to add a product: ");
            System.out.println("Enter 2 to remove a product: ");
            System.out.println("Enter 3 to view a the cart: ");
            System.out.println("Enter 4 to view the total cost: ");
            System.out.println("Enter 5 to exit the program: ");
        }
    }

    public static void main(String[] args) {

    }
}
