package lab1;

import java.util.Scanner ;

public class lab1_1 {
    public static void main(String[] args) {
        
        int num1 = 0 ;
        int num2 = 0 ;
        int result ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.println( "Please Enter Number" ) ;
        System.out.println( "Enter Num1 : " ) ;
        
        if( input.hasNextInt()) {
            num1 = input.nextInt() ;

            System.out.println( "Enter Num2 : " ) ;

            if( input.hasNextInt()) {
                num2 = input.nextInt() ;
                InputNotcorrect = false ;
                input.close() ;
            }else{
                System.out.println("Enter only Number!!!" ) ;
            }// End if
        }else{
            System.out.println("Enter only Number!!!" ) ;
        }// End if
        
        if( InputNotcorrect == false ){
            result = num1 + num2 ;
            System.out.println( "Result : " + result ) ;
        }// End if
    }// End main
}// End class