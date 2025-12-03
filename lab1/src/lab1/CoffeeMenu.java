package lab1;

import java.util.Scanner;

public class CoffeeMenu {

    private static String MenuName(int menuNumber) {
        switch (menuNumber) {
            case 1:
                return "Americano";
            case 2:
                return "Latte";
            case 3:
                return "Espresso";
            case 4:
                return "Mocha";
            default:
                return "Invalid Menu. Please select a number 1-4.";
        }// End switch
    }// End MenuName

    private static int CheckMenuInput(Scanner input) {
        if (!input.hasNextInt()) {
            input.next();
            return -1;
        }// End if

        int number = input.nextInt();

        if (number < 1 || number > 4) {
            return -1;
        }// End if

        return number;
    }// End CheckMenuInput

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Coffee Menu");
        System.out.println("1 = Americano");
        System.out.println("2 = Latte");
        System.out.println("3 = Espresso");
        System.out.println("4 = Mocha");
        System.out.println("Please Enter Number (only integer 1-4)");
        System.out.print("Select Menu: ");

        int menuNumber = CheckMenuInput(input);
        String menuName = MenuName(menuNumber);

        System.out.println("Your Menu Choice: " + menuName);
    }// End main
}// End class