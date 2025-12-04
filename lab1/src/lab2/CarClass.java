import java.util.Scanner;

// Car class following the UML description
class Car {

    private String model;  // model name
    private int year;      // production year

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }// End of Car

    // Getters
    public String getModel() {
        return model;
    }// End of getModel

    public int getYear() {
        return year;
    }// End of getYear

    // Setter to update year
    public void setYear(int newYear) {
        this.year = newYear;
    }// End of setYear
}// End of Car

public class CarClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input model name
        System.out.print("Enter car model: ");
        String model = sc.nextLine().trim();

        if (model.isEmpty()) {
            System.out.println("Error: Car model cannot be empty!");
            sc.close();
            return;
        }// End if

        // Input initial production year
        System.out.print("Enter production year: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Production year must be an integer!");
            sc.close();
            return;
        }// End if
        int year = sc.nextInt();

        // Input updated year
        System.out.print("Enter updated year: ");
        if (!sc.hasNextInt()) {
            System.out.println("Error: Updated year must be an integer!");
            sc.close();
            return;
        }// End if
        int newYear = sc.nextInt();

        // Create Car object
        Car myCar = new Car(model, year);

        // Update year
        myCar.setYear(newYear);

        // Display result
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        sc.close();
    }// End of main
}// End of CarClass