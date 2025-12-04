import java.util.Scanner;

// Product class to store product name and price
class Product {
    String name;
    double price;

    // Constructor to initialize name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }// End of Product
}// End of Product

// ShoppingCart class to store up to 10 products
class ShoppingCart {
    Product[] items = new Product[10];  // array to store products
    int itemCount = 0;  // count how many products have been added

    // Method to add a product to the cart
    public void addProduct(Product p) {
        if (itemCount < items.length) {  // check if cart has space
            items[itemCount] = p;
            itemCount++;
        } else {
            System.out.println("Cart is full! Cannot add more products.");
        }// End if
    }// End of addProduct

    // Method to calculate the total price of all products
    public double calculateTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].price;
        }// End for
        return total;
    }// End of calculateTotalPrice
}// End of ShoppingCart

public class Cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of products to add
        System.out.print("Enter number of products (0-10): ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Number of products must be an integer!");
            sc.close();
            return;
        }// End if
        int N = sc.nextInt();
        sc.nextLine(); // consume end-of-line

        // Validate N range
        if (N < 0 || N > 10) {
            System.out.println("Error: Number of products must be between 0 and 10!");
            sc.close();
            return;
        }// End if

        ShoppingCart cart = new ShoppingCart();

        // Loop to input product data
        for (int i = 0; i < N; i++) {
            System.out.printf("Product #%d name: ", i + 1);
            String name = sc.nextLine().trim();

            // Validate name not empty
            if (name.isEmpty()) {
                System.out.println("Error: Product name cannot be empty!");
                sc.close();
                return;
            }// End if

            System.out.printf("Product #%d price: ", i + 1);
            // Protect against non-numeric price
            if (!sc.hasNextDouble()) {
                System.out.println("Error: Product price must be a numeric value!");
                sc.close();
                return;
            }// End if
            double price = sc.nextDouble();
            sc.nextLine(); // consume end-of-line

            // Validate price non-negative
            if (price < 0) {
                System.out.println("Error: Product price cannot be negative!");
                sc.close();
                return;
            }// End if

            // Create Product and add to cart
            Product p = new Product(name, price);
            cart.addProduct(p);
        }// End for

        // Calculate and display total price (formatted to 2 decimal places)
        double total = cart.calculateTotalPrice();
        System.out.printf("Total Price: %.1f%n", total);

        sc.close();
    }// End of main
}// End of Cart