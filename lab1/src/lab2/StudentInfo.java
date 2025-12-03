import java.util.Scanner;

class Student {
    private String studentId ;
    private String name ;

    public Student(String studentId, String name) {
        this.studentId = studentId ;
        this.name = name ;
    }// Constructor

    public String getStudentId() {
        return studentId ;
    }// Getter for studentId

    public String getName() {
        return name ;
    }// Getter for name
}// Student Class

 public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Enter StudentID: ");
        String inputStudentId = scanner.nextLine().trim() ;

        if (inputStudentId.isEmpty()) {
            System.out.println("Error: StudentID cannot be empty.") ;
            scanner.close() ;
            return;
        }//end if

        System.out.print("Enter Name-Lastname : ") ;
        String inputName = scanner.nextLine().trim() ;

        if (inputName.isEmpty()) {
            System.out.println("Error: Name-Lastname cannot be empty.") ;
            scanner.close() ;
            return;
        }//end if
        
        Student student1 = new Student(inputStudentId, inputName) ;

        System.out.println("\nStudent Information") ;
        System.out.println("Student ID: " + student1.getStudentId()) ;
        System.out.println("Name - Lastname : " + student1.getName()) ;

        scanner.close() ;
    }//End main
}// End StudentInfo Class