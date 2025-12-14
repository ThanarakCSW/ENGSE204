import java.util.Scanner;

class User {

    // Instance attributes
    private String username;
    private String password;

    // Static attribute shared across the system
    private static int minPasswordLength = 8;

    /*
     * Constructor
     * Creates a user based on the current security policy.
     */
    public User(String username, String password) {

        this.username = username;

        // Validate password using the shared security policy
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    /*
     * Getter for password
     */
    public String getPassword() {
        return password;
    }

    /*
     * Setter for password with validation
     */
    public void setPassword(String newPassword) {

        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    /*
     * Static setter for minimum password length
     */
    public static void setMinLength(int length) {

        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }

    /*
     * Static getter for minimum password length
     */
    public static int getMinLength() {
        return minPasswordLength;
    }
}

public class SecurityPolicy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt and read first minimum length
        System.out.print("Enter new minimum password length: ");
        int minLength1 = sc.nextInt();
        sc.nextLine();

        // Prompt and read user 1 data
        System.out.print("Enter username 1: ");
        String user1Name = sc.nextLine();

        System.out.print("Enter password 1: ");
        String user1Pass = sc.nextLine();

        // Prompt and read user 2 data
        System.out.print("Enter username 2: ");
        String user2Name = sc.nextLine();

        System.out.print("Enter password 2: ");
        String user2Pass = sc.nextLine();

        // Prompt and read second minimum length
        System.out.print("Enter new minimum password length (again): ");
        int minLength2 = sc.nextInt();
        sc.nextLine();

        // Prompt and read new password for user 2
        System.out.print("Enter new password for user 2: ");
        String user2NewPass = sc.nextLine();

        // Step 1: Update security policy
        User.setMinLength(minLength1);

        // Step 2: Create user 1
        User user1 = new User(user1Name, user1Pass);

        // Step 3: Create user 2
        User user2 = new User(user2Name, user2Pass);

        // Step 4: Update security policy again
        User.setMinLength(minLength2);

        // Step 5: Update password for user 2
        user2.setPassword(user2NewPass);

        // Display final passwords
        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());

        sc.close();
    }
}
