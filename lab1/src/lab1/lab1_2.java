package lab1;

import java.util.Scanner ;

public class lab1_2 {
    public static void main(String[] args) {
        
        double width = 0 ;
        double height = 0 ;
        double area ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.println( "Please Enter Number or Decimal" ) ;
        System.out.print( "Enter width(cm) : " ) ;
        
        if( input.hasNextDouble()) {
            width = input.nextDouble() ;

            System.out.print( "Enter height(cm) : " ) ;

            if( input.hasNextDouble()) {
                height = input.nextDouble() ;
                InputNotcorrect = false ;
                input.close() ;
            }else{
                System.out.println("Enter only Number or Decimal!!!" ) ;
            }// End if
        }else{
            System.out.println("Enter only Number or Decimal!!!" ) ;
        }// End if
        
        if( InputNotcorrect == false ){
            area = width * height ;
            System.out.printf( "Area : %.2f cm.\n", area) ;
        }// End if
    }// End main
}// End class