import java.util.Scanner;

// Course class
class Course {
    private String courseId;
    private String courseName;

    // Constructor to initialize courseId and courseName
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }// End of Course

    // Returns course information in the format "ID: Name"
    public String getCourseInfo() {
        return courseId + ": " + courseName;
    }// End of getCourseInfo
}// End of Course


// Student class
class Student6 {
    private String studentName;
    private Course enrolledCourse;

    // Constructor to initialize studentName and enrolledCourse
    public Student6(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }// End of Student6

    // Displays student and course information
    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }// End of displayEnrollment
}// End of Student6


// Main class
public class CourseInfo {

    // Check if input is empty or contains only whitespace
    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }// End of isEmpty

    // Check if input contains alphabet letters only (English or Thai allowed)
    public static boolean isAlphabet(String input) {
        return input.matches("[a-zA-Zก-ฮะ-์]+( [a-zA-Zก-ฮะ-์]+)*");
    }// End of isAlphabet

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read course ID
        System.err.print("Enter course ID: ");
        String courseId = sc.nextLine();
        if (isEmpty(courseId)) {
            System.out.println("Invalid input: Course ID cannot be empty.");
            return;
        }// End if

        // Read course name
        System.err.print("Enter course name: ");
        String courseName = sc.nextLine();
        if (isEmpty(courseName) || !isAlphabet(courseName)) {
            System.out.println("Invalid input: Course name must contain alphabet letters only.");
            return;
        }// End if

        // Read student name
        System.err.print("Enter student name: ");
        String studentName = sc.nextLine();
        if (isEmpty(studentName) || !isAlphabet(studentName)) {
            System.out.println("Invalid input: Student name must contain alphabet letters only.");
            return;
        }// End if

        // Create Course object
        Course course = new Course(courseId, courseName);

        // Create Student object
        Student6 student = new Student6(studentName, course);

        // Display final enrollment result
        student.displayEnrollment();
    }// End of main
}// End of CourseInfo