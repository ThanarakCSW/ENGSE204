import java.util.Scanner;

// Address class to store student's address information
class Address {
    private String street;
    private String city;
    private String zipCode;

    // Constructor to initialize address fields
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }//End of Address

    // Method to return full address as one formatted string
    public String getFullAddress() {
        return street + ", " + city + ", " + zipCode;
    }//End of getFullAddre
}//End of Address

// Student class that contains name and Address object
class Student5 {
    private String name;
    private Address address;

    // Constructor to initialize name and Address
    public Student5(String name, Address address) {
        this.name = name;
        this.address = address;
    }//End of Student5

    // Method to display student's profile
    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }//End displayProfile
}// End Student

public class AddressInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read student name
        System.out.print("Enter student name: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty!");
            sc.close();
            return;
        }//End if

        // Read street
        System.out.print("Enter street: ");
        String street = sc.nextLine().trim();
        if (street.isEmpty()) {
            System.out.println("Error: Street cannot be empty!");
            sc.close();
            return;
        }//End if

        // Read city
        System.out.print("Enter city: ");
        String city = sc.nextLine().trim();
        if (city.isEmpty()) {
            System.out.println("Error: City cannot be empty!");
            sc.close();
            return;
        }//End if

        // Read zip code
        System.out.print("Enter zip code: ");
        String zipCode = sc.nextLine().trim();

        // Validate zip code (must be 5 digits and numeric)
        if (zipCode.isEmpty()) {
            System.out.println("Error: Zip code cannot be empty!");
            sc.close();
            return;
        }//End if
        if (!zipCode.matches("\\d{5}")) {
            System.out.println("Error: Zip code must be 5 digits (e.g., 10200)!");
            sc.close();
            return;
        }//End if

        // Create Address object
        Address address = new Address(street, city, zipCode);

        // Create Student object and pass the Address object
        Student5 student = new Student5(name, address);

        // Display student profile
        student.displayProfile();

        sc.close();
    }//End of Main
}//End of AddressInfo