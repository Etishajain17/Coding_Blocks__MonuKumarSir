package Contests.Contest4_Recursion;
/*
You are given an empty chess board of size N*N. Find the number of ways to place N queens on the board, such that no
two queens can kill each other in one move. A queen can move vertically, horizontally and diagonally.

Input Format
    A single integer N, denoting the size of chess board.

Constraints
    1 ≤ N < 15

Output Format
    A single integer denoting the count of solutions.

Sample Input
    4

Sample Output
    2
*/

public class N_QueenHard {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.print(NQueenHard(board,n,0));
    }

    public static int NQueenHard(boolean[][] board,int tq,int row){
        if(tq==0){
            return 1;
        }
        int ans=0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)==true){
                board[row][col]=true;
                ans+=NQueenHard(board,tq-1,row+1);
                board[row][col]=false;
            }
        }
        return ans;
    }

    public static boolean isSafe(boolean[][] board,int row,int col){
        int r=row;
        //vertical
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }

        //Left Diagonal
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }

        //Right Diagonal
        r=row;
        c=col;
        while(r>=0 && c<board.length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
