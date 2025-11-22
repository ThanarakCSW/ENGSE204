package lab1;

import java.util.Scanner ;

public class SumArray_method {
    
    public static int sumArray( int[] array ) {
        int sum = 0 ;
        for( int i=0 ; i<array.length ; i++ ) {
            sum += array[i] ;
        }// End for
        return sum ;
    }// End SumArray Method

    public static void main(String[] args) {
        int sum ;
        int n = 0 ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.println( "Sum of Array" ) ;
        System.out.print( "Please Enter Number of Array(only integer) : " ) ;
        
        if( input.hasNextInt()) {
            n = input.nextInt() ;
            InputNotcorrect = false ;
        }else{
            System.out.println("Enter only Number(only integer)!!!" ) ;
        }// End if
        
        if( InputNotcorrect == false ){
            int[] array = new int[n] ;
            for( int i=0 ; i<n ; i++ ) {
                System.out.print( "Enter Array [" + (i+1) + "] : " ) ;
                if( input.hasNextInt()) {
                    array[i] = input.nextInt() ;
                }else{
                    System.out.println("Enter only Number(only integer)!!!" ) ;
                    InputNotcorrect = true ;
                    input.close() ;
                    break ;
                }// End if
            }// End for
        
            if( InputNotcorrect == false ) {
                sum = sumArray( array ) ;
                System.out.println( "Sum Array is : " + sum ) ;
            }// End if
        }// End if
    }// End main
}//End class
