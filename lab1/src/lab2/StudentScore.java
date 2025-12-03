import java.util.Scanner;

// Student class to store student data and process scores
class Student4 {
    private String name;
    private int midtermScore;
    private int finalScore;

    // Constructor to initialize attributes
    public Student4(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }// End of constructor

    // Method to calculate average score
    public double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }// End of calculateAverage method

    // Method to display student summary information
    public void displaySummary() {
        double avg = calculateAverage();
        System.out.println("Name: " + name);
        System.out.println("Average Score: " + avg);

        // Determine pass/fail based on average score
        if (avg >= 50.0) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }// End of if-else
    }// End of displaySummary method
}// End of Student class

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Input and validate midterm score
        System.out.print("Enter Midterm Score (0-100): ");
        int midterm = sc.nextInt();

        // Check if the midterm score is valid
        if (midterm < 0 || midterm > 100) {
            System.out.println("Error: Midterm score must be between 0 and 100!");
            return; // Exit program if invalid
        }

        // Input and validate final score
        System.out.print("Enter Final Score (0-100): ");
        int finalScore = sc.nextInt();

        // Check if the final score is valid
        if (finalScore < 0 || finalScore > 100) {
            System.out.println("Error: Final score must be between 0 and 100!");
            return; // Exit program if invalid
        }

        // Create Student object with validated data
        Student4 std = new Student4(name, midterm, finalScore);

        // Display summary report
        std.displaySummary();

        sc.close();
    }// End of main method
}// End of StudentScore