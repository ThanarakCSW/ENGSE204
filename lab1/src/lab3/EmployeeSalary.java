import java.util.Scanner;

/*
 * Class Employee
 * This class represents an employee whose salary information is confidential.
 * Encapsulation is used to protect sensitive salary data.
 */
class Employee {

    // Stores the employee name
    private String name;

    // Stores the monthly salary (confidential data)
    private double monthlySalary;

    /*
     * Constructor
     * Initializes the employee name and monthly salary.
     * Salary must be greater than zero; otherwise, it is set to zero.
     */
    public Employee(String name, double monthlySalary) {

        this.name = name;

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    /*
     * Getter method for employee name
     */
    public String getName() {
        return name;
    }

    /*
     * Method to increase monthly salary
     * Applies a raise only if the amount is valid.
     */
    public void giveRaise(double amount) {

        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    /*
     * Private helper method
     * Calculates annual salary.
     */
    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    /*
     * Public method to calculate tax
     * Uses the private annual salary internally.
     */
    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt and read employee name
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        // Prompt and read monthly salary
        System.out.print("Enter monthly salary: ");
        double monthlySalary = sc.nextDouble();

        // Prompt and read tax rate
        System.out.print("Enter tax rate: ");
        double taxRate = sc.nextDouble();

        // Prompt and read raise amount
        System.out.print("Enter raise amount: ");
        double raiseAmount = sc.nextDouble();

        // Create employee object
        Employee emp = new Employee(name, monthlySalary);

        // Calculate and display tax before raise (1 decimal place)
        System.out.printf("Tax (Before): %.1f%n", emp.calculateTax(taxRate));

        // Apply salary raise
        emp.giveRaise(raiseAmount);

        // Calculate and display tax after raise (1 decimal place)
        System.out.printf("Tax (After): %.1f%n", emp.calculateTax(taxRate));

        sc.close();
    }
}