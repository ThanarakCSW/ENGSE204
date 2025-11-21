package lab1 ;

import java.util.Scanner ;

public class lab1_2 {
    public static void main(String[] args) {
        
        double width = 0 ;
        double height = 0;
        double result ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;

        System.out.print( "Enter Width : " ) ;
        
        if( input.hasNextDouble()) {
            width = input.nextDouble() ;

            System.out.print( "Enter Height : " ) ;

            if( input.hasNextInt()) {
                height = input.nextInt() ;
                InputNotcorrect = false ;
                input.close() ;
            }else{
                System.out.print("Enter only decimal!!!") ;
            }// End if
        }else{
            System.out.print("Enter only decimal!!!") ;
        }// End if
        
        if( InputNotcorrect == false ){
            result = width + height ;
            System.out.println( "Result : " + result ) ;
        }// End if
    }// End main
}// End class