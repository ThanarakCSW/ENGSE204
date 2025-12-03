package lab1;

import java.util.Scanner;

public class calculateArea {

    public static double calculatearea(double width, double height) {
        return width * height;
    }// End calculatearea Method

    private static double readdouble(Scanner input, String prompt) {
        System.out.print(prompt);

        while (!input.hasNextDouble()) {
            System.out.println("Enter only Number!!!");
            input.next();
            System.out.print(prompt);
        }// End while
        return input.nextDouble();
    }// End readdouble Method

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Calculate Area of Rectangle (Decimal Allowed)");

            double width = readdouble(input, "Enter Width: ");
            double height = readdouble(input, "Enter Height: ");

            double area = calculatearea(width, height);
            System.out.println("Area is: " + area);
        }// End main
    }// End class
}// End class
