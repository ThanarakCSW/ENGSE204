package lab1;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        
        int number = 0 ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.println( "Multiplication Table" ) ;
        System.out.print( "Please Enter Number(only integer) : " ) ;
        
        if( input.hasNextInt()) {
            number = input.nextInt() ;
            InputNotcorrect = false ;
            input.close() ;
        }else{
            System.out.println("Enter only Number(only integer)!!!" ) ;
        }// End if
        
        if( InputNotcorrect == false ){
            System.out.println( "Multiplication Table of " + number ) ;
            for( int i=1 ; i<=12 ; i++ ){
                System.out.println( number + " x " + i + " = " + (number*i) ) ;
            }// End for
        }// End if
    }// End main
}// End class