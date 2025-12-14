import java.util.Scanner;

/*
 * Class User
 * This class simulates a user password system.
 * Encapsulation is applied to protect the password from direct access.
 */
class User {

    // The password is private to prevent direct modification
    private String password;

    /*
     * Constructor
     * Initializes the user with an initial password.
     * The initial password is assumed to be valid.
     */
    public User(String initialPassword) {
        this.password = initialPassword;
    }

    /*
     * Getter method
     * Returns the current password.
     * Provides controlled access to the private attribute.
     */
    public String getPassword() {
        return password;
    }

    /*
     * Setter method with validation
     * Updates the password only if it meets the required rules.
     * The password must be at least 8 characters long.
     */
    public void setPassword(String newPassword) {

        // Check if the new password meets the minimum length requirement
        // This validation prevents weak passwords from being set
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            // Do not update the password if the rule is violated
            System.out.println("Password is too short.");
        }
    }
}

public class PasswordInfoApp {

    public static void main(String[] args) {

        // Scanner is used to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the initial password (first line)
        System.err.println("Enter initial password:");
        String initialPassword = sc.nextLine();

        // Read the new password (second line)
        System.err.println("Enter new password:");
        String newPassword = sc.nextLine();

        // Create a User object with the initial password
        User user = new User(initialPassword);

        // Attempt to update the password
        user.setPassword(newPassword);

        // Display the current password stored in the object
        System.out.println(user.getPassword());

        // Close the scanner to release system resources
        sc.close();
    }
}