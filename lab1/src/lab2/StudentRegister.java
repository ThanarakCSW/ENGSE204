import java.util.Scanner;

class Student3 {
    private String studentId;
    private String name;

    private static int studentCount = 0;

    public Student3(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}

public class StudentRegister {
    
    private static boolean isInteger(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) return false;
                continue;
            }
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the number of students to register (Integer): ");
            String inputLine = scanner.nextLine(); 

            if (isInteger(inputLine)) {
                N = Integer.parseInt(inputLine);
                
                if (N >= 0) {
                    validInput = true;
                } else {
                    System.out.println("The number of students must be a non-negative integer.");
                }
            } else {
                System.out.println("Please enter an integer number only.");
            }
        }
        
        for (int i = 0; i < N; i++) {
            System.out.println("\nStudent Data No. " + (i + 1));
            
            System.out.print("Enter student ID: ");
            String id = scanner.nextLine();
            
            System.out.print("Enter full name: ");
            String fullName = scanner.nextLine();

            new Student3(id, fullName);
        }

        System.out.println("Registration completed successfully.");
        System.out.println("Total number of Student objects created: " + Student3.getStudentCount() + " people");

        scanner.close();
    }
}