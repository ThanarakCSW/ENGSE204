package lab1 ;

import java.util.Scanner ;

public class Minesweeper {

    public static int countmine(char[][] map, int targetR, int targetC){
        int count = 0 ;
        int row = map.length ;
        int column = map[0].length ;

        for(int i = targetR - 1 ; i <= targetR + 1 ; i++){
            for(int j = targetC - 1 ; j <= targetC + 1 ; j++){

                if(i == targetR && j == targetC){
                    continue ;
                }

                if(i >= 0 && i < row && j >= 0 && j < column){
                    if(map[i][j] == '*'){
                        count++ ;
                    }// End if
                }// End if

            }// End for
        }// End for

        return count ;
    }// End countmine Method

    public static void main(String[] args){

        int row = 0 ;
        int column = 0 ;
        int targetR = 0 ;
        int targetC = 0 ;
        boolean InputNotcorrect = true ;

        Scanner input = new Scanner(System.in) ;

        System.out.println( "Minesweeper Logic" ) ;
        System.out.print( "Please Enter Number(only integer) For Row : " ) ;
        if(input.hasNextInt()){
            row = input.nextInt() ;
            InputNotcorrect = false ;
        }else {
            System.out.println( "Enter only Number(only integer)!!!" ) ;
            input.close() ;
            return ;
        }// End if

        if(InputNotcorrect == false){
            System.out.print( "Please Enter Number(only integer) For Column : " ) ;
            if(input.hasNextInt()){
                column = input.nextInt() ;
            }else{
                System.out.println( "Enter only Number(only integer)!!!" ) ;
                input.close() ;
                return ;
            }
        }

        char[][] map = new char[row][column] ;
        System.out.println( "Please Enter Map (* or .) : " ) ;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){

                System.out.print( "Map[" + i + "] | [" + j + "] : " ) ;
                String s = input.next() ;
                char c = s.charAt(0) ;

                if(c == '*' || c == '.'){
                    map[i][j] = c ;
                }else {
                    System.out.println( "Please Enter * or . Only" ) ;
                    input.close() ;
                    return ;
                }// End if
            }// End for
        }// End for

        System.out.print( "Please Enter Target Row (only integer): " ) ;
        if(input.hasNextInt()){
            targetR = input.nextInt() ;
        }else {
            System.out.println( "Enter only Number(only integer)!!!" ) ;
            input.close() ;
            return;
        }// End if

        System.out.print( "Please Enter Target Column (only integer): " ) ;
        if(input.hasNextInt()){
            targetC = input.nextInt() ;
        }else{
            System.out.println( "Enter only Number(only integer)!!!" ) ;
            input.close() ;
            return ;
        }// End if

        if(map[targetR][targetC] == '*'){
            System.out.println("Mine!!!") ;
        }else{
            int count = countmine(map, targetR, targetC) ;
            System.out.println( "Around Have Mine : " + count ) ;
        }// End else
    }// End main
}// End class
