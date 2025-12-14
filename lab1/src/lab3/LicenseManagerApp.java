import java.util.Scanner;

/*
 * Utility class for managing limited software licenses.
 * All members are static because licenses are shared system-wide.
 */
class LicenseManager {

    // Maximum number of licenses allowed
    private static int maxLicenses = 10;

    // Number of licenses currently in use
    private static int usedLicenses = 0;

    /*
     * Sets the maximum number of licenses.
     * Validation ensures system stability.
     */
    public static void setMax(int max) {

        if (max < 0) {
            System.out.println("Invalid max value.");
            return;
        }

        if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
            return;
        }

        maxLicenses = max;
        System.out.println("Max licenses set to " + max);
    }

    /*
     * Attempts to check out a license.
     * Returns true if successful, false otherwise.
     */
    public static boolean checkOut() {

        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        }

        System.out.println("Checkout failed: No licenses available.");
        return false;
    }

    /*
     * Returns a license back to the pool if possible.
     */
    public static void checkIn() {

        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    /*
     * Displays current license usage status.
     */
    public static void displayStatus() {

        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + (maxLicenses - usedLicenses));
    }
}

public class LicenseManagerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of commands: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter command (SET, CHECKOUT, CHECKIN, STATUS): ");
            String command = sc.nextLine();

            if (command.equals("SET")) {

                System.out.print("Enter new max licenses: ");
                int max = sc.nextInt();
                sc.nextLine();
                LicenseManager.setMax(max);

            } else if (command.equals("CHECKOUT")) {

                LicenseManager.checkOut();

            } else if (command.equals("CHECKIN")) {

                LicenseManager.checkIn();

            } else if (command.equals("STATUS")) {

                LicenseManager.displayStatus();
            }
        }

        sc.close();
    }
}