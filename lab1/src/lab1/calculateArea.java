package lab1;

import java.util.Scanner;

public class calculateArea {

     public static double calculateArea( double width, double height ) {
        return width * height ;
    }// End calculateArea Method

    public static void main(String[] args) {
        double width = 0 ;
        double height = 0 ;
        double area = 0 ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.println( "Calculate Area of Rectangle (Decimal Allowed)" ) ;
        System.out.print( "Enter Width: " ) ;

        if( input.hasNextDouble() ) {
            width = input.nextDouble() ;
            System.out.print("Enter Height: ") ;

            if( input.hasNextDouble()) {
                height = input.nextDouble() ;
                InputNotcorrect = false ;
                input.close() ;
            }else{
            System.out.println("Enter only Number!!!" ) ;
            }// End if
        }else{
            System.out.println("Enter only Number!!!" ) ;
        }// End if
    
        if( InputNotcorrect == false ){
            area = calculateArea( width, height ) ;
            System.out.println( "Area is: " + area ) ;
        }// End if
    }// End main
}// End class
