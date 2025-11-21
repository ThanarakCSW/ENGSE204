package lab1;

import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        int[] N ;
        int number = 0 ;
        int sum = 0 ;
        int size = 0 ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;

        System.out.print( "Please Enter Number(only integer) For Make Array Size : " ) ;
        if( input.hasNextInt()) {
            size = input.nextInt() ;
            InputNotcorrect = false ;
            System.out.println("Array Size (N) is: " + size);
        }else{
            System.out.println("Enter only Number(only integer)!!!" ) ;
        }// End if

        
        if( InputNotcorrect == false ){
            N = new int[size] ;

            for (int i = 0; i < size ; i++) {
                System.out.print("Enter N[" + (i + 1) + "]: ");
                if( input.hasNextInt()) {
                    number = input.nextInt() ;
                    N[i] = number ;
                    
                }else{
                    System.out.println("Enter only Number(only integer)!!!" ) ;
                }// End if
            sum += N[i] ;
            }// End for
            input.close() ;
            System.out.println("Sum N is: " + sum);
        }// End if
    }// End main
}// End class
