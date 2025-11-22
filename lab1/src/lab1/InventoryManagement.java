package lab1;

import java.util.Scanner ;

public class InventoryManagement {

    public static void searchproduct(int[] productid, int[] quantity, int searchid) {
        for (int i = 0; i < productid.length; i++) {
            if (productid[i] == searchid) {
                System.out.println("Stock Quantity: " + quantity[i]) ;
                return ;
            }// End if
        }// End for
        System.out.println("Product : " + searchid + " not found") ;
    }// End searchproduct

    public static void main(String[] args) {

        int n = 0 ;
        int[] productid = null ;
        int[] quantity = null ;
        int searchid ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;
        System.out.println( "InventoryManagement" ) ;
        System.out.print( "Please Enter Number of Size Item(only integer) : " ) ;

        if( input.hasNextInt()) {
            n = input.nextInt() ;
            productid = new int[n] ;
            quantity = new int[n] ;
            InputNotcorrect = false ;
        }else{
            System.out.println("Enter only Number(only integer)!!!" ) ;
        }// End if

        if( InputNotcorrect == false ){

            for( int i=0 ; i<n ; i++ ) {
                System.out.print( "Enter Product ID [Item" + (i+1) + "] : " ) ;
                if( input.hasNextInt()) {
                    productid[i] = input.nextInt() ;
                    System.out.print( "Enter Stock Quantity [Item" + (i+1) + "] : " ) ;

                    if( input.hasNextInt()) {
                        quantity[i] = input.nextInt() ;
                        InputNotcorrect = false ;
                    }else{
                        System.out.println("Enter only Number(only integer)!!!" ) ;
                        InputNotcorrect = true ;
                        input.close() ;
                        return ;
                    }// End if
                }else{
                    System.out.println("Enter only Number(only integer)!!!" ) ;
                    InputNotcorrect = true ;
                    input.close() ;
                    return ;
                }// End if
            }// End for

            if( InputNotcorrect == false ) {
                System.out.print("Enter Product ID to search : ");
                if (input.hasNextInt()) {
                    searchid = input.nextInt();
                    searchproduct(productid, quantity, searchid) ;
                    input.close() ;
                } else {
                    System.out.println("Enter only Number(only integer)!!!" ) ;
                }
            }// End if
        }// End if
    }// End main
}// End class
