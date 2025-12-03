import java.util.Scanner;

// Rectangle class to store width and height, and calculate area & perimeter
class Rectangle {
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }// End of constructor

    // Method to calculate the area of the rectangle
    public double getArea() {
        return width * height;
    }// End of getArea method

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }// End of Rectangle class
}// End of getPerimeter method

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input width
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        // Validate width
        if (width < 0) {
            System.out.println("Error: Width cannot be negative!");
            return;
        } else if (width == 0) {
            System.out.println("Error: Width cannot be zero!");
            return;
        }// End of if-else

        // Input height
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        // Validate height
        if (height < 0) {
            System.out.println("Error: Height cannot be negative!");
            return;
        } else if (height == 0) {
            System.out.println("Error: Height cannot be zero!");
            return;
        }// End of if-else

        // Create Rectangle object
        Rectangle rect = new Rectangle(width, height);

        // Display results
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        sc.close();
    }// End of main method
}// End of RectangleArea class
