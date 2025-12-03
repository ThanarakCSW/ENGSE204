import java.util.Scanner;

class Student2 {
    private String studentId;
    private String name;

    public Student2(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    } // Constructor

    public void displayInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Name - Lastname : " + this.name);
    } // displayInfo method

    public String getStudentId() {
        return studentId;
    } // Getter for studentId

    public String getName() {
        return name;
    } // Getter for name
} // Student Class

 public class StudentInfo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter StudentID: ");
        String inputStudentId = scanner.nextLine().trim();

        if (inputStudentId.isEmpty()) {
            System.out.println("Error: StudentID cannot be empty.");
            scanner.close();
            return;
        } // end if

        System.out.print("Enter Name-Lastname : ");
        String inputName = scanner.nextLine().trim();

        if (inputName.isEmpty()) {
            System.out.println("Error: Name-Lastname cannot be empty.");
            scanner.close();
            return;
        } // end if

        Student2 student = new Student2(inputStudentId, inputName);
        
        student.displayInfo();

        scanner.close();
    } // End main
} // End StudentInfo2 Class