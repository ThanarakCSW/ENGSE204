package lab1 ;

import java.util.Scanner ;

public class DashboardDataCenter {

    public static int countonline(int[][] grid){
        int count = 0 ;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if( grid[i][j] == 1 ){
                    count++ ;
                }// End if
            }// End for column
        }// End for
        return count ;
    }// End countonline

    public static void main(String[] args){
        int row ;
        int column ;

        Scanner input = new Scanner(System.in) ;
        System.out.println( "Monitoring Dashboard Data Center" ) ;
        System.out.print( "Please Enter Row Grid(only integer) : " ) ;

        if( input.hasNextInt()){
            row = input.nextInt() ;
            System.out.print( "Please Enter Column Server Grid(only integer) : " ) ;

            if (input.hasNextInt()){
                column = input.nextInt() ;
            }else{
                System.out.println("Enter only Number(only integer)!!!" ) ;
                input.close() ;
                return ;
            }// End if
        }else{
            System.out.println("Enter only Number(only integer)!!!" ) ;
            input.close();
            return;
        }// End if

        int[][] grid = new int[row][column] ;
        int count ;

        System.out.println( " " ) ;
        System.out.println( "Please Enter Status Server ( 0 = Offline, 1 = Online )" ) ;

        for( int i = 0 ; i < row ; i++ ){
            for( int j = 0 ; j < column ; j++ ){
                System.out.print( "Row [" + (i+1) + "] | Column [" + (j+1) + "] : " ) ;
                if( input.hasNextInt()){
                    grid[i][j] = input.nextInt() ;
                    if (grid[i][j] != 0 && grid[i][j] != 1) {
                        System.out.println( "Please Enter 0 Or 1 Only" ) ;
                        input.close() ;
                        return ;
                    }// End if
                }else{
                    System.out.println("Enter only Number(only integer)!!!" ) ;
                    input.close() ;
                    return ;
                }// End if
            }// End for
        }// End for

        count = countonline(grid) ;
        System.out.println("Online Servers is : " + count + " servers") ;
        
    }// End main
}// End class
