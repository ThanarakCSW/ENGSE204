import java.util.Scanner;

/**
 * Product class to store product name and price
 */
class Product {
    String name;
    double price;

    /**
     * Constructor to initialize name and price
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    } 
    // End of Product
}

/**
 * ShoppingCart class to store up to 10 products
 */
class ShoppingCart {
    Product[] items = new Product[10];  // array to store products
    int itemCount = 0;  // count how many products have been added

    /**
     * Method to add a product to the cart
     */
    public void addProduct(Product p) {
        if (itemCount < items.length) {  // check if cart has space
            items[itemCount] = p;
            itemCount++;
        } else {
            System.out.println("Cart is full! Cannot add more products.");
        }
        // End if
    }
    // End of addProduct

    /**
     * Method to calculate the total price of all products
     */
    public double calculateTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].price;
        }
        // End for
        return total;
    }
    // End of calculateTotalPrice
}
// End of ShoppingCart

/**
 * Main application class (renamed from Cart to follow PascalCase convention)
 */
public class ShoppingCartApp {

    /**
     * Helper method to read and validate the number of products (N)
     */
    private static int getUserInputN(Scanner sc) {
        System.out.print("Enter number of products (0-10): ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Number of products must be an integer!");
            sc.nextLine(); // consume invalid input
            return -1; // Indicate error
        }
        int N = sc.nextInt();
        sc.nextLine(); // consume end-of-line

        // Validate N range
        if (N < 0 || N > 10) {
            System.out.println("Error: Number of products must be between 0 and 10!");
            return -1; // Indicate error
        }
        return N;
    }

    /**
     * Helper method to read product details, create a Product object, and add to the cart
     */
    private static boolean readProductDetails(Scanner sc, ShoppingCart cart, int productIndex) {
        System.out.printf("Product #%d name: ", productIndex + 1);
        String name = sc.nextLine().trim();

        // Validate name not empty
        if (name.isEmpty()) {
            System.out.println("Error: Product name cannot be empty!");
            return false;
        }

        System.out.printf("Product #%d price: ", productIndex + 1);
        // Protect against non-numeric price
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Product price must be a numeric value!");
            sc.nextLine(); // consume invalid input
            return false;
        }
        double price = sc.nextDouble();
        sc.nextLine(); // consume end-of-line

        // Validate price non-negative
        if (price < 0) {
            System.out.println("Error: Product price cannot be negative!");
            return false;
        }

        // Create Product and add to cart
        Product p = new Product(name, price);
        cart.addProduct(p);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read and validate number of products
        int N = getUserInputN(sc);
        if (N == -1) {
            sc.close();
            return;
        }

        ShoppingCart cart = new ShoppingCart();

        // 2. Loop to input product data
        for (int i = 0; i < N; i++) {
            if (!readProductDetails(sc, cart, i)) {
                sc.close();
                return; // Stop if input validation fails
            }
        }
        // End for

        // 3. Calculate and display total price (formatted to 1 decimal place as per original code)
        double total = cart.calculateTotalPrice();
        System.out.printf("Total Price: %.1f%n", total);

        sc.close();
    }
    // End of main
}
// End of ShoppingCartApp