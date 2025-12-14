import java.util.Scanner;

/*
 * Class BankAccount
 * This class simulates a secure bank account.
 * Encapsulation is applied to protect the balance from direct modification.
 */
class BankAccount2 {

    // The balance is private to prevent direct access and modification
    private double balance;

    /*
     * Constructor
     * Initializes the account balance.
     * If the initial balance is negative, it is set to 0
     * to ensure the account starts in a valid state.
     */
    public BankAccount2(double initialBalance) {

        // Validate initial balance to prevent negative account state
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    /*
     * Getter method
     * Returns the current account balance.
     */
    public double getBalance() {
        return balance;
    }

    /*
     * Deposit method
     * Adds money to the account only if the amount is positive.
     */
    public void deposit(double amount) {

        // Validate deposit amount
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    /*
     * Withdraw method
     * Removes money from the account based on validation rules.
     */
    public void withdraw(double amount) {

        // Check for invalid withdrawal amount
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class BankApp {

    public static void main(String[] args) {

        // Scanner is used to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt and read initial balance
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        // Prompt and read deposit amount
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();

        // Prompt and read withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();

        // Create a BankAccount object
        BankAccount2 account = new BankAccount2(initialBalance);

        // Perform deposit operation
        account.deposit(depositAmount);

        // Perform withdrawal operation
        account.withdraw(withdrawalAmount);

        // Display the final balance
        System.out.println("Final Balance: " + account.getBalance());

        // Close the scanner to release system resources
        sc.close();
    }
}