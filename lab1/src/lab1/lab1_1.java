package lab1;

import java.util.Scanner ;

public class lab1_1 {
    public static void main(String[] args) {
        
        int num1 = 0 ;
        int num2 = 0 ;
        int result ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;

        System.out.print( "Enter Num1 : " ) ;
        
        if( input.hasNextInt()) {

            num1 = input.nextInt() ;
            
            System.out.print( "Enter Num2 : " ) ;

            if( input.hasNextInt()) {
                num2 = input.nextInt() ;
                InputNotcorrect = false ;
                input.close() ;
            }else if (input.hasNextDouble()) {
                System.out.println("Plase Enter Just Only Number" ) ;
                input.next() ;
            }else if (input.hasNextFloat()){
                System.out.println("Plase Enter Just Only Number" ) ;
                input.next() ;
            }else if (input.hasNextBoolean()){
                System.out.println("Plase Enter Just Only Number" ) ;
                input.next() ;
            }else {
            System.out.println("Plase Enter Just Only Number") ;
            input.next() ;
        }// End if
            
        }else if (input.hasNextDouble()) {
            System.out.println("Plase Enter Just Only Number" ) ;
            input.next() ;
        }else if (input.hasNextFloat()){
            System.out.println("Plase Enter Just Only Number" ) ;
            input.next() ;
        }else if (input.hasNextBoolean()){
            System.out.println("Plase Enter Just Only Number" ) ;
            input.next() ;
        }else {
            System.out.println("Plase Enter Just Only Number") ;
            input.next() ;
        }// End if

        if( InputNotcorrect == false ){
            result = num1 + num2 ;
            System.out.println( "Result : " + result ) ;
        }// End if
    }// End main
}// End class

//ผมพิมพ์เองไม่ได้ใช้ AI ครับ T-T