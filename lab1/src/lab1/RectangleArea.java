package lab1;

import java.util.Scanner ;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        double width ;
        double height ;

        System.out.println( "Please Enter Number or Decimal" ) ;
        width = getDoubleInput( input, "Enter width (cm): " ) ;
        height = getDoubleInput( input, "Enter height (cm): " ) ;

        double area = width * height ;
        System.out.printf( "Area: %.2f cm.\n", area ) ;

        input.close() ;
    }

    private static double getDoubleInput(Scanner input, String message) {
        double value ;

        while( true ){
            System.out.print( message ) ;
            if(input.hasNextDouble()){
                value = input.nextDouble() ;
                break ;
            }else{
                System.out.println( "Enter only Number or Decimal!!!" ) ;
                input.next() ;
            }//End if
        }// End while
        return value; 
    }// End getDoubleInput Method
}// End RectangleArea Class
