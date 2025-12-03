import java.util.Scanner;

// Utility class for temperature conversions
class TempConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }//End of celsiusToFahrenheit

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }//End of fahrenheitToCelsius(
}// End of TempCoverter Class

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read mode (C_TO_F or F_TO_C)
        System.out.print("Enter mode (C_TO_F or F_TO_C): ");
        String mode = sc.nextLine().trim(); // trim to remove extra spaces

        // Validate mode
        if (!mode.equals("C_TO_F") && !mode.equals("F_TO_C")) {
            System.out.println("Error: Invalid mode. Use C_TO_F or F_TO_C.");
            sc.close();
            return;
        }//end of if

        // Read temperature value
        System.out.print("Enter temperature value: ");

        // Protect against non-numeric input
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Temperature must be a numeric value!");
            sc.close();
            return;
        }// End of if

        double temp = sc.nextDouble();
        double result;

        // Check mode and call the appropriate static method
        if (mode.equals("C_TO_F")) {
            result = TempConverter.celsiusToFahrenheit(temp);
            // Print result with 2 decimal places
            System.out.printf("Result (Fahrenheit): %.1f%n", result);
        } else { // mode is F_TO_C
            result = TempConverter.fahrenheitToCelsius(temp);
            // Print result with 2 decimal places
            System.out.printf("Result (Celsius): %.1f%n", result);
        }//End of if-else

        sc.close();
    }// End of Main
}//End of TemperatureConverter
