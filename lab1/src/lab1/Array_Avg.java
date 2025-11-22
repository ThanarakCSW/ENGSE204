package lab1 ;

import java.util.Scanner ;

public class Array_Avg {
    
    public static void main(String[] args) {
        int[] n ;
        int number = 0 ;
        int size = 0 ; 
        int sum = 0 ;
        float avg ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;

        System.out.print( "Please Enter Number(only integer) For Make Array Size : " ) ;
        if( input.hasNextInt()) {
            size = input.nextInt() ;
            InputNotcorrect = false ;
            System.out.println("Array Size (N) is: " + size) ;
        }else{
            System.out.println("Enter only Number(only integer)!!!" ) ;
        }// End if

        
        if( InputNotcorrect == false ){
            n = new int[size] ;

            for (int i = 0; i < size ; i++) {
                System.out.print("Enter N[" + (i + 1) + "]: ") ;
                if( input.hasNextInt()) {
                    number = input.nextInt() ;
                    n[i] = number ;
                    
                }else{
                    System.out.println("Enter only Number(only integer)!!!" ) ;
                }// End if
            }// End for

            for ( int count : n ) {
                sum += count ;
            }// End for
            
            avg = (float) sum / n.length ;

            input.close() ;
            System.out.println(" N Average is: " + avg) ;

        }// End if
    }// End main
}// End class
