package Contests.Contest4_Recursion;

import java.util.*;
/*
Take as input N, the size of a chess board. We are asked to place N number of Knights in it, so that no knight can kill other.

a. Write a recursive function which returns the count of different distinct ways the knights can be placed across the board.
Print the value returned.

b.Write a recursive function which prints all valid configurations (void is the return type for function).

Input Format
    Enter the size of the chessboard N

Constraints
    None

Output Format
    Display the number of ways a knight can be placed and print all the possible arrangements in a space separated manner

Sample Input
    2

Sample Output
    {0-0} {0-1}  {0-0} {1-0}  {0-0} {1-1}  {0-1} {1-0}  {0-1} {1-1}  {1-0} {1-1}
    6
 */


/*
Knight moves in L Shape SO we just need to check four places i.e. row-2,col-1 && row-2,col+1 && row-1,col-2 && row-1,col+2
These are above four places on which knight is there so just the isSafe funtion would change in N queeen prblm.
 */
public class N_KnightPrblm {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[][] board=new boolean[n][n];
        NKnightPrblm(board,n,0,0);
        System.out.print("\n"+count);
    }

    public static void NKnightPrblm(boolean[][] board,int tK,int row,int col){
        if(tK==0){
            count++;
            Display(board);
            return;
        }

        if(row==board.length-1 && col==board.length)
            return;
        if(col==board.length){
            NKnightPrblm(board,tK,row+1,0);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            NKnightPrblm(board,tK-1,row,col+1);
            board[row][col]=false;
        }
        NKnightPrblm(board,tK,row,col+1);
    }

    public static boolean isSafe(boolean[][] board,int row,int col){
        if(row-1>=0 && col-2>=0 && board[row-1][col-2]==true)
            return false;                                 //left2up
        if(row-2>=0 && col-1>=0 && board[row-2][col-1]==true)
            return false;                                //up2left
        if(col+2<board.length && row-1>=0 && board[row-1][col+2]==true)
            return false;                               //right2up
        if(row-2>=0 && col+1<board.length && board[row-2][col+1]==true)
            return false;                                //up2right
        return true;                                     //if all false then safe
    }

    public static void Display(boolean[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]){
                    System.out.print("{"+i+"-"+j+"} ");
                }
            }
        }
        System.out.print(" ");
    }
}
