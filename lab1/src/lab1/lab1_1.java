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
            } 
            else if (input.hasNextDouble()) {
                System.out.println("ไม่สามารถใส่ข้อมูลเป็นทศนิยมได้" ) ;
                input.next() ;
            }
            else {
                System.out.println("ไม่สามารถใส่ข้อมูลเป็นตัวอักษรได้" ) ;
                input.next() ;
            }// End if
            
        } 
        else if (input.hasNextDouble()) {
            System.out.println("ไม่สามารถใส่ข้อมูลเป็นทศนิยมได้") ;
            input.next() ;
        }
        else {
            System.out.println("ไม่สามารถใส่ข้อมูลเป็นตัวอักษรได้") ;
            input.next() ;
        }// End if
        
        // --- คำนวณและแสดงผลลัพธ์ ---
        if( InputNotcorrect == false ){
            result = num1 + num2 ;
            System.out.println( "Result : " + result ) ;
        } else {
            // เพิ่มข้อความแจ้งเตือนว่าไม่สามารถคำนวณได้
            System.out.println("ข้อมูลไม่ถูกต้อง") ;
        }
    }// End main
}// End class