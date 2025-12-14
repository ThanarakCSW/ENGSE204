import java.util.Scanner;

class BankAccount2 {

    // Instance variable for storing balance of this account
    private double balance;

    // Static variable for counting all transactions in the system
    private static int totalTransactionCount = 0;

    // Constructor (account creation is NOT counted as a transaction)
    public BankAccount2(double initialDeposit) {

        if (initialDeposit >= 0) {
            balance = initialDeposit;
        } else {
            balance = 0;
        }

        System.out.println("Account created.");
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit money with validation
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Withdraw money with validation
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        }
    }

    // Static getter for total transactions
    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class BankAccountApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount2 myAccount = null;

        System.out.print("Enter number of commands: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter command (CREATE, DEPOSIT, WITHDRAW, STATUS, GLOBAL_STATUS): ");
            String command = sc.nextLine();

            if (command.equals("CREATE")) {

                System.out.print("Enter initial deposit: ");
                double amount = sc.nextDouble();
                sc.nextLine();
                myAccount = new BankAccount2(amount);

            } else if (command.equals("DEPOSIT")) {

                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.deposit(amount);
                }

            } else if (command.equals("WITHDRAW")) {

                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.withdraw(amount);
                }

            } else if (command.equals("STATUS")) {

                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Balance: " + myAccount.getBalance());
                }

            } else if (command.equals("GLOBAL_STATUS")) {

                System.out.println("Total Transactions: " + BankAccount2.getTotalTransactionCount());
            }
        }

        sc.close();
    }
}