import java.util.Scanner;

class User {
    private String username;

    public User(String username) {
        if (username == null || username.isEmpty()) {
            this.username = "Invalid Username";
        } else {
            this.username = username;
        }
    }

    public String getUsername() {
        return username;
    }

    public void display() {
        System.out.print("Username is: " + username);
    }
}

public class UserInfoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = sc.nextLine();

        User user = new User(inputUsername);

        user.display();
        sc.close();
    }
}