package lab1;

import java.util.Scanner ;

public class lab1_1 {
    public static void main(String[] args) {
        
        int num1 ;
        int num2 ;
        int result ;

        Scanner input = new Scanner(System.in) ;

        System.out.print( "Enter Num1 : " ) ;
        num1 = input.nextInt() ;

        System.out.print( "Enter Num2 : " );
        num2 = input.nextInt() ;

        result = num1 + num2 ;
        System.out.println( "Result : " + result ) ;

        input.close();
    }//End main
}//End class