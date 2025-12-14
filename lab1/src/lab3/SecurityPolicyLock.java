import java.util.Scanner;

class User {

    // Instance variables
    private String username;
    private int failedAttempts;
    private boolean isLocked;

    // Static variable: shared security policy
    private static int maxAttempts = 3;

    // Constructor: initialize user state
    public User(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    // Static method to update security policy
    public static void setPolicy(int max) {

        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    // Login method with security rules
    public void login(String password) {

        // Condition 1: account already locked
        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        // Condition 2: correct password
        if (password.equals("pass123")) {
            failedAttempts = 0;
            System.out.println("Login successful.");
            return;
        }

        // Condition 3: incorrect password
        failedAttempts++;

        // Check if account should be locked
        if (failedAttempts >= maxAttempts) {
            isLocked = true;
            System.out.println("Login failed. Account locked.");
        } else {
            int remaining = maxAttempts - failedAttempts;
            System.out.println("Login failed. " + remaining + " attempts left.");
        }
    }
}

public class SecurityPolicyLock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create user
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        User user = new User(username);

        // Number of commands
        System.out.print("Enter number of commands: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter command (SET_POLICY or LOGIN): ");
            String command = sc.nextLine();

            if (command.equals("SET_POLICY")) {

                System.out.print("Enter new max attempts: ");
                int max = sc.nextInt();
                sc.nextLine();
                User.setPolicy(max);

            } else if (command.equals("LOGIN")) {

                System.out.print("Enter password: ");
                String password = sc.nextLine();
                user.login(password);
            }
        }

        sc.close();
    }
}