package lab1;

import java.util.Scanner ;

public class lab1_3 {

    public static void main(String[] args) {
        
        int n = 0 ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.println( "Please Enter Number(only integer)" ) ;
        System.out.print( "Enter Number : " ) ;
        
        if( input.hasNextInt()) {
            n = input.nextInt() ;
            InputNotcorrect = false ;
            input.close() ;
        }else{
            System.out.println("Enter only Number!!!" ) ;
        }// End if
        
        if( InputNotcorrect == false ){
            if( n % 2 == 0 ){
            System.out.println( "Result : " + n + " is Even" ) ;
            }else{
            System.out.println( "Result : " + n + " is Odd" ) ;
            }//End if
        }// End if
    }// End main
}// End class
