import java.util.Scanner;

/*
 * Class Product
 * This class represents a product and tracks
 * the total number of Product objects created.
 * Encapsulation is used to protect internal data.
 */
class Product2 {

    // Instance attribute to store the product name
    private String name;

    // Static attribute to count total Product objects
    private static int productCount = 0;

    /*
     * Constructor
     * Initializes the product name and increments the counter.
     * The counter increases each time a Product object is created.
     */
    public Product2(String name) {
        this.name = name;
        productCount++;
    }

    /*
     * Getter method for product name
     * Provides controlled access to the instance data.
     */
    public String getName() {
        return name;
    }

    /*
     * Static getter method for productCount
     * Allows access to class-level data without an object.
     */
    public static int getProductCount() {
        return productCount;
    }
}

public class ProductInfoApp {

    public static void main(String[] args) {

        // Scanner is used to read input from standard input
        Scanner sc = new Scanner(System.in);

        // Read the number of products to be created
        System.err.println("Enter number of products:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        /*
         * Validate the input value of N
         * The number of products must be greater than zero
         * to ensure meaningful object creation.
         */
        if (n <= 0) {
            System.out.println("Invalid number of products.");
            sc.close();
            return;
        }

        // Loop N times to create Product objects
        for (int i = 0; i < n; i++) {

            // Read the product name
            System.err.println("Enter product name:");
            String productName = sc.nextLine();

            // Create a new Product object
            new Product2(productName);
        }

        // Display the total number of products created
        System.out.print("Total products created: ");
        System.out.println(Product2.getProductCount());

        // Close the scanner to release system resources
        sc.close();
    }
}