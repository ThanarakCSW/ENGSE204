import java.util.Scanner;

class User {
    // Attribute (Encapsulation)
    private String username;

    // Constructor
    public User(String username) {
        if (username == null || username.isEmpty()) {
            this.username = "Invalid Username";
        } else {
            this.username = username;
        }
    }

    // Getter
    public String getUsername() {
        return username;
    }

    // Method สำหรับแสดงผล
    public void display() {
        System.out.println(username);
    }
}

public class UserInfoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับชื่อผู้ใช้
        System.out.print("Enter username: ");
        String inputUsername = sc.nextLine();

        // สร้างออบเจ็กต์ User
        User user = new User(inputUsername);

        // แสดงผลชื่อผู้ใช้
        user.display();

        sc.close();
    }
}