package lab1;

import java.util.Scanner;

public class lab1_1 {

    public static void main(String[] args) {

        int num1;
        int num2;
        int result;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Number");
        System.out.print("Enter Num1 : ");

        if (!input.hasNextInt()) {
            System.out.println("Enter only Number!!!");
            input.close();
            return;
        }//end if

        num1 = input.nextInt();

        System.out.print("Enter Num2 : ");

        if (!input.hasNextInt()) {
            System.out.println("Enter only Number!!!");
            input.close();
            return;
        }//end if

        num2 = input.nextInt();
        input.close();

        result = num1 + num2;
        System.out.println("Result : " + result);
    }//end main
}//end class