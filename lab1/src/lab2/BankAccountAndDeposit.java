import java.util.Scanner;

// BankAccount class to simulate a simple bank account
class BankAccount {
    private String ownerName;
    private double balance;

    // Constructor to initialize owner name and starting balance
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }// End of constructor

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;  // Add deposit amount to the existing balance
    }// End of deposit method

    // Method to display account summary (formatted to 2 decimals)
    public void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + String.format("%.1f", balance));
    }// End of displaySummary method
}// End of BankAccount class

public class BankAccountAndDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input owner name
        System.out.print("Enter owner name: ");
        String name = sc.nextLine();

        // Input initial balance
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        // Validate initial balance
        if (initialBalance < 0) {
            System.out.println("Error: Initial balance cannot be negative!");
            return;
        }// End of if

        // Input deposit amount
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();

        // Validate deposit amount
        if (depositAmount < 0) {
            System.out.println("Error: Deposit amount cannot be negative!");
            return;
        } else if (depositAmount == 0) {
            System.out.println("Error: Deposit amount cannot be zero!");
            return;
        }// End of if-else

        // Create BankAccount object
        BankAccount account = new BankAccount(name, initialBalance);

        // Deposit money into the account
        account.deposit(depositAmount);

        // Display updated account summary
        account.displaySummary();

        sc.close();
    }// End of main method
}// End of main method
