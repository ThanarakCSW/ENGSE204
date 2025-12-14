import java.util.Scanner;

/*
 * Class DatabaseConnection
 * This class simulates a database connection state.
 * Encapsulation is used to protect connection details and status.
 */
class DatabaseConnection {

    // Stores the server name or connection string
    // Declared as private to prevent direct access
    private String connectionString;

    // Stores the current connection status
    // true = connected
    // false = not connected
    private boolean connected;

    /*
     * Constructor
     * Initializes the connection string and sets the initial
     * connection status to false (not connected).
     * Validation is applied to prevent an invalid connection state.
     */
    public DatabaseConnection(String connectionString) {

        // Validate the connection string
        // A connection string must not be null or empty
        if (connectionString == null || connectionString.trim().isEmpty()) {
            this.connectionString = "Invalid Connection";
        } else {
            this.connectionString = connectionString;
        }

        // Initial connection state is always false
        this.connected = false;
    }

    /*
     * isConnected method
     * Returns the current connection status.
     */
    public boolean isConnected() {
        return connected;
    }

    /*
     * connect method
     * Attempts to establish a connection.
     * Connection is allowed only if the current state is not connected
     * and the connection string is valid.
     */
    public void connect() {

        // Prevent connection when the connection string is invalid
        if (connectionString.equals("Invalid Connection")) {
            System.out.println("Connection failed.");
            return;
        }

        // Check if the connection is not yet established
        if (!connected) {
            connected = true;
            System.out.println("Connected to " + connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    /*
     * disconnect method
     * Attempts to terminate the connection.
     * Disconnection is allowed only if the current state is connected.
     */
    public void disconnect() {

        // Check if the connection is currently active
        if (connected) {
            connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

public class ConnectionChecking {

    public static void main(String[] args) {

        // Scanner is used to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the connection string from input
        System.err.println("Enter connection string:");
        String connectionString = sc.nextLine();

        // Create a DatabaseConnection object
        DatabaseConnection db = new DatabaseConnection(connectionString);

        // Test connection behavior
        db.connect();
        db.disconnect();
        db.disconnect(); // Called again to test validation

        // Display the final connection status
        System.out.println(db.isConnected());

        // Close the scanner to release system resources
        sc.close();
    }
}
