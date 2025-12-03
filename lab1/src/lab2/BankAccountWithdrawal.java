import java.util.Scanner;

// BankAccount class to simulate a simple bank account with withdraw functionality
class BankAccount3 {
    private String ownerName;
    private double balance;

    // Constructor to initialize owner name and starting balance
    public BankAccount3(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }// End of BankAccount

    // Method to withdraw money from the account
    public void Withdraw(double amount) {
        // Condition 1: Sufficient balance
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
        // Condition 2: Not enough balance
        else {
            System.out.println("Insufficient funds.");
        }// End of if-else
    }// End of Withdraw

    // Method to display the current balance (formatted to 2 decimal places)
    public void displayBalance() {
        System.out.printf("Balance: %.1f%n", balance);
    }
}//End of BankAccount method

public class BankAccountWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input owner name
        System.out.print("Enter owner name: ");
        String name = sc.nextLine();

        // Input initial balance
        System.out.print("Enter initial balance: ");
        double initialBalance = 0;

        // Validate initial balance: must be a number
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Initial balance must be a numeric value!");
            return;
        }//End if
        initialBalance = sc.nextDouble();

        if (initialBalance < 0) {
            System.out.println("Error: Initial balance cannot be negative!");
            return;
        }//End if

        System.out.print("Enter withdrawal amount #1: ");

        if (!sc.hasNextDouble()) {
            System.out.println("Error: Withdrawal amount #1 must be numeric!");
            return;
        }//End if
        double withdraw1 = sc.nextDouble();

        if (withdraw1 <= 0) {
            System.out.println("Error: Withdrawal amount #1 must be greater than 0!");
            return;
        }//End if

        System.out.print("Enter withdrawal amount #2: ");

        if (!sc.hasNextDouble()) {
            System.out.println("Error: Withdrawal amount #2 must be numeric!");
            return;
        }//End if
        double withdraw2 = sc.nextDouble();

        if (withdraw2 <= 0) {
            System.out.println("Error: Withdrawal amount #2 must be greater than 0!");
            return;
        }//End if

        // Create BankAccount object
        BankAccount3 account = new BankAccount3(name, initialBalance);

        // First withdrawal
        account.Withdraw(withdraw1);

        // Second withdrawal
        account.Withdraw(withdraw2);

        // Display final balance
        account.displayBalance();

        sc.close();
    }//End of Main
}// End of BankAccountWithdrawal