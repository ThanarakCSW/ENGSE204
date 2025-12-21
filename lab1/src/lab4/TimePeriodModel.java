package lab4;

// This program demonstrates constructor chaining and validation for a time period.
// Student-style English comments included for clarity.

import java.util.Scanner;

class TimePeriod {

    private int startHour;
    private int endHour;

    // Default constructor (calls main constructor with default hours)
    public TimePeriod() {
        this(9, 17); // 9:00 - 17:00 default working hours
    }

    // Main constructor with two validations
    public TimePeriod(int startHour, int endHour) {

        // --- Validation 1: Hours must stay within 0–23 ---
        if (startHour < 0)
            startHour = 0;
        if (startHour > 23)
            startHour = 23;

        if (endHour < 0)
            endHour = 0;
        if (endHour > 23)
            endHour = 23;

        // --- Validation 2: Ensure startHour < endHour ---
        // If not, swap them to keep the data meaningful
        if (startHour > endHour) {
            int temp = startHour;
            startHour = endHour;
            endHour = temp;
        }

        // Assign validated values
        this.startHour = startHour;
        this.endHour = endHour;
    }

    // Display method
    public void displayPeriod() {
        System.out.println(startHour + ":00 - " + endHour + ":00");
    }
}

public class TimePeriodModel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mode (1=Default, 2=Custom): ");
        int mode = sc.nextInt();

        TimePeriod tp;

        if (mode == 1) {
            // Use default constructor
            tp = new TimePeriod();
        } else {
            // Prompt for custom hours
            System.out.print("Enter start hour: ");
            int start = sc.nextInt();

            System.out.print("Enter end hour: ");
            int end = sc.nextInt();

            tp = new TimePeriod(start, end);
        }

        // Show final validated period
        tp.displayPeriod();

        sc.close(); // Good practice to close scanner
    }
}