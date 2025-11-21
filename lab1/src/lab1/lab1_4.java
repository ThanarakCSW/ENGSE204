package lab1;

import java.util.Scanner;

public class lab1_4 {
     public static void main(String[] args) {
        
        int score = 0 ;
        String grade = "" ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.println( "Please Enter Number(only integer 1-100)" ) ;
        System.out.print( "Enter Score : " ) ;
        
        if( input.hasNextInt()) {
            score = input.nextInt() ;
            InputNotcorrect = false ;
            input.close() ;
        }else{
            System.out.println("Enter only Number(only integer 1-100)!!!" ) ;
        }// End if
        
        if( InputNotcorrect == false ){
            if (score >= 0 && score <= 100) {
                if (score >= 80) {
                    grade = "A" ;
                } else if (score >= 70) {
                    grade = "B" ;
                } else if (score >= 60) {
                    grade = "C" ;
                } else if (score >= 50) {
                    grade = "D" ; 
                } else {
                    grade = "F" ;
                }// End if
            }// End if
            System.out.println( "Grade is : " + grade ) ;
        }// End if
    }// End main
}// End class
