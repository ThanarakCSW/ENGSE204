import java.util.Scanner;

/*
 * Class InventoryItem
 * This class represents an inventory item with controlled stock management.
 * Encapsulation is applied to protect product data and stock quantity.
 */
class InventoryItem {

    // Stores the product name
    private String productName;

    // Stores the current stock quantity
    private int stock;

    /*
     * Constructor
     * Initializes the product name and stock.
     * Negative initial stock is converted to zero
     * to ensure a valid inventory state.
     */
    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;

        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    /*
     * Getter method for product name
     */
    public String getProductName() {
        return productName;
    }

    /*
     * Getter method for stock
     */
    public int getStock() {
        return stock;
    }

    /*
     * addStock method
     * Increases stock only when the amount is positive.
     */
    public void addStock(int amount) {
        if (amount > 0) {
            stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    /*
     * sellStock method
     * Decreases stock based on validation rules.
     */
    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount <= stock) {
            stock -= amount;
            System.out.println("Sale successful.");
        } else {
            System.out.println("Not enough stock.");
        }
    }
}

public class ManageStock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt and read product name
        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        // Prompt and read initial stock
        System.out.print("Enter initial stock: ");
        int initialStock = sc.nextInt();

        // Create inventory item
        InventoryItem item = new InventoryItem(productName, initialStock);

        // Prompt and read number of commands
        System.out.print("Enter number of commands: ");
        int n = sc.nextInt();

        // Process commands
        for (int i = 0; i < n; i++) {

            // Prompt and read command type
            System.out.print("Enter command (ADD/SELL): ");
            String command = sc.next();

            // Prompt and read amount
            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            // Validate command type
            if (command.equals("ADD")) {
                item.addStock(amount);
            } else if (command.equals("SELL")) {
                item.sellStock(amount);
            } else {
                // Handle invalid command
                System.out.println("Invalid command.");
            }
        }

        // Display the final stock
        System.out.println("Final Stock: " + item.getStock());

        sc.close();
    }
}