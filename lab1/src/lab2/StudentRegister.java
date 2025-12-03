import java.util.Scanner;

class Student3 {
    private String studentId;
    private String name;

    // Static counter to track how many Student3 objects are created.
    private static int studentCount = 0;

    public Student3(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        studentCount++;
    } // End of constructor.

    public static int getStudentCount() {
        return studentCount;
    } // End of getStudentCount method.
} // End of Student3 class.

public class StudentRegister {

    private static boolean isInteger(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        } // End of if condition.

        for (int index = 0; index < text.length(); index++) {
            // Allow a leading negative sign, but not as a single character.
            if (index == 0 && text.charAt(index) == '-') {
                if (text.length() == 1) {
                    return false;
                } // End of if condition.
                continue;
            } // End of if condition.

            if (!Character.isDigit(text.charAt(index))) {
                return false;
            } // End of if condition.
        } // End of for loop.
        return true;
    } // End of isInteger method.

    private static int readNonNegativeInteger(Scanner scanner, String promptMessage) {
        int nonNegativeNumber = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(promptMessage);
            String inputLine = scanner.nextLine();

            if (isInteger(inputLine)) {
                nonNegativeNumber = Integer.parseInt(inputLine);

                if (nonNegativeNumber >= 0) {
                    validInput = true;
                } else {
                    // Explain why negative numbers are not allowed
                    System.out.println("The number of students must be a non-negative integer.");
                }
            } else {
                // Explain that only integer input is accepted
                System.out.println("Please enter an integer number only.");
            } // End of input validation.
        } // End of while loop.

        return nonNegativeNumber;
    } // End of readNonNegativeInteger method.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and validate the number of students to register.
        int numberOfStudents = readNonNegativeInteger(
                scanner,
                "Enter the number of students to register (Integer): "
        );

        // Loop to collect data for each student.
        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            System.out.println("\nStudent Data No. " + (studentIndex + 1));

            System.out.print("Enter student ID: ");
            String studentId = scanner.nextLine();

            System.out.print("Enter full name: ");
            String fullName = scanner.nextLine();

            // Create a new Student3 object for each student.
            new Student3(studentId, fullName);
        } // End of student data collection loop.

        System.out.println("Registration completed successfully.");
        System.out.println("Total number of Student objects created: "
                + Student3.getStudentCount() + " people");

        scanner.close();
    } // End of main method.
} //End of StudentRegister class.