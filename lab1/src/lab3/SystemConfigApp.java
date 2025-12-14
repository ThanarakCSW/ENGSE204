import java.util.Scanner;

/*
 * Class SystemConfig
 * This class implements the Singleton Pattern.
 * Only one instance of this class can exist in the entire system.
 */
class SystemConfig {

    // Static instance to store the single object
    private static SystemConfig instance;

    // Instance attributes
    private String serverUrl;
    private int maxConnections;

    /*
     * Private constructor
     * Prevents external classes from creating objects directly.
     * Initializes default configuration values.
     */
    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    /*
     * Public static method to access the single instance.
     * Creates the instance if it does not exist.
     */
    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    /*
     * Getter for server URL
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /*
     * Setter for server URL with validation
     * URL must not be null or empty.
     */
    public void setServerUrl(String url) {
        if (url == null || url.trim().isEmpty()) {
            System.out.println("Invalid URL.");
        } else {
            this.serverUrl = url;
            System.out.println("Server URL updated.");
        }
    }

    /*
     * Getter for maximum connections
     */
    public int getMaxConnections() {
        return maxConnections;
    }

    /*
     * Setter for maximum connections with validation
     */
    public void setMaxConnections(int count) {
        if (count > 0) {
            maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class SystemConfigApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt and read number of commands
        System.out.print("Enter number of commands: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Process each command
        for (int i = 0; i < n; i++) {

            System.out.print("Enter command (SET_URL / SET_MAX / SHOW): ");
            String command = sc.next();

            if (command.equals("SET_URL")) {

                sc.nextLine();
                System.out.print("Enter new server URL: ");
                String url = sc.nextLine();

                SystemConfig config = SystemConfig.getInstance();
                config.setServerUrl(url);

            } else if (command.equals("SET_MAX")) {

                System.out.print("Enter new max connections: ");
                int count = sc.nextInt();

                SystemConfig config = SystemConfig.getInstance();
                config.setMaxConnections(count);

            } else if (command.equals("SHOW")) {

                SystemConfig config = SystemConfig.getInstance();

                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }

        // Close scanner to release system resources
        sc.close();
    }
}
