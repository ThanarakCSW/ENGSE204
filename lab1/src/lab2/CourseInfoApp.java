import java.util.Scanner;

class Course {
    private String courseId;
    private String courseName;

    // Constructor to initialize courseId and courseName
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Return formatted course information
    public String getCourseInfo() {
        return courseId + ": " + courseName;
    }
}

class Student6 {
    private String studentName;
    private Course enrolledCourse;

    // Constructor to initialize studentName and enrolledCourse
    public Student6(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    // Display student name and full course info
    public void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo()); // Adjusted to use getCourseInfo()
    }
}

public class CourseInfoApp {
    // Validate empty string
    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    // Validate English alphabet-only name
    public static boolean isAlphabet(String input) {
        // Updated regex to only allow English letters (a-z, A-Z) and spaces.
        return input.matches("[a-zA-Z]+( [a-zA-Z]+)*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read course ID (Course ID is often alphanumeric, so we only check for empty)
        System.out.print("Enter Course ID: ");
        String courseId = sc.nextLine();
        if (isEmpty(courseId)) {
            System.out.println("Invalid input: Course ID cannot be empty.");
            sc.close();
            return;
        }

        // Read course name
        System.out.print("Enter Course Name (English only): ");
        String courseName = sc.nextLine();
        if (isEmpty(courseName)) {
            System.out.println("Invalid input: Course name cannot be empty.");
            sc.close();
            return;
        } else if (!isAlphabet(courseName)) {
            System.out.println("Invalid input: Course name must contain **English alphabet letters only**.");
            sc.close();
            return;
        }

        // Read student name
        System.out.print("Enter Student Name (English only): ");
        String studentName = sc.nextLine();
        if (isEmpty(studentName)) {
            System.out.println("Invalid input: Student name cannot be empty.");
            sc.close();
            return;
        } else if (!isAlphabet(studentName)) {
            System.out.println("Invalid input: Student name must contain **English alphabet letters only**.");
            sc.close();
            return;
        }

        // Create objects
        Course course = new Course(courseId, courseName);
        Student6 student = new Student6(studentName, course);

        // Display result
        student.displayEnrollment();

        // Close scanner
        sc.close();
    }
}