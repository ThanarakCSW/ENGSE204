
import java.util.Scanner;

class SystemLogger {

    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        if (level == 1) {
            return "INFO";
        } else if (level == 2) {
            return "DEBUG";
        } else if (level == 3) {
            return "ERROR";
        } else {
            return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
        }
    }
}

public class SystemLoggerInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of commands: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter command (SET/LOG): ");
            String command = sc.next();

            if (command.equals("SET")) {

                System.out.print("Enter new log level: ");
                int newLevel = sc.nextInt();
                SystemLogger.setLogLevel(newLevel);

            } else if (command.equals("LOG")) {

                System.out.print("Enter message level: ");
                int level = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter message: ");
                String message = sc.nextLine();

                SystemLogger.log(level, message);
            }
        }

        sc.close();
    }
}
