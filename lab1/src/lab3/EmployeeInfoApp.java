import java.util.Scanner;

/*
 * Class Employee
 * This class represents an employee record.
 * The employee ID is read-only and cannot be modified after object creation.
 * Encapsulation is used to protect employee data.
 */
class Employee {

    // Read-only attribute: employee ID cannot be changed after construction
    private String employeeId;

    // Writable attribute: department can be updated with validation
    private String department;

    /*
     * Constructor
     * Initializes the employee ID and department.
     * Validation is applied to ensure the department is not empty.
     */
    public Employee(String employeeId, String department) {

        this.employeeId = employeeId;

        // Validate initial department to prevent invalid state
        if (department == null || department.trim().isEmpty()) {
            this.department = "Unknown";
        } else {
            this.department = department;
        }
    }

    /*
     * Getter method for employeeId
     * Provides read-only access to the employee ID.
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /*
     * Getter method for department
     * Returns the current department of the employee.
     */
    public String getDepartment() {
        return department;
    }

    /*
     * Setter method for department
     * Updates the department only if the new value is valid.
     */
    public void setDepartment(String newDepartment) {

        // Validate new department value
        // Prevents assigning an empty or null department
        if (newDepartment == null || newDepartment.trim().isEmpty()) {
            System.out.println("Invalid department.");
            return;
        }

        this.department = newDepartment;
    }
}

public class EmployeeInfoApp {

    public static void main(String[] args) {

        // Scanner is used to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt and read employee ID
        System.out.print("Enter employee ID: ");
        String employeeId = sc.nextLine();

        // Prompt and read initial department
        System.out.print("Enter initial department: ");
        String initialDepartment = sc.nextLine();

        // Prompt and read new department
        System.out.print("Enter new department: ");
        String newDepartment = sc.nextLine();

        // Create an Employee object with initial data
        Employee employee = new Employee(employeeId, initialDepartment);

        // Attempt to update the department
        employee.setDepartment(newDepartment);

        // Display the employee ID (read-only)
        System.out.println(employee.getEmployeeId());

        // Display the current department
        System.out.println(employee.getDepartment());

        // Close the scanner to release system resources
        sc.close();
    }
}