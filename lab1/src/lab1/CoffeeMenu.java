package lab1;

import java.util.Scanner;

public class CoffeeMenu {
     public static void main(String[] args) {
        
        int select = 0 ;
        String menu = "" ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.println( "Coffee Menu" ) ;
        System.out.println( "1 = Americano" ) ;
        System.out.println( "2 = Latte" ) ;
        System.out.println( "3 = Espresso" ) ;
        System.out.println( "4 = Mocha" ) ;
        System.out.println( "Please Enter Number(only integer 1-4)" ) ;
        System.out.print( "Select Menu : " ) ;
        
        if( input.hasNextInt()) {
            select = input.nextInt() ;
            InputNotcorrect = false ;
            input.close() ;
        }else{
            System.out.println("Enter only Number(only integer 1-4)!!!" ) ;
        }// End if
        
        if( InputNotcorrect == false ){
            switch (select) {
            case 1:
                menu = "Americano" ;
                break ;
            case 2:
                menu = "Latte" ;
                break ;
            case 3:
                menu = "Espresso" ;
                break ;
            case 4:
                menu = "Mocha" ;
                break ;
            default:
                menu= "Invalid Menu Please Select 1-4" ;
            }// End if
            System.out.println( "Your Menu Choose : " + menu ) ;
        }// End if
    }// End main
}// End class