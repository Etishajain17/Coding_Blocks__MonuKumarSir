package Contests.Contest4_Recursion;
/*
Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board.
Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move
1 step horizontally (right) or 1 step vertically (down).

a. Write a recursive function which returns the count of different ways the player can travel across the board.
Print the value returned.

b. Write a recursive function which returns an ArrayList of moves for all valid paths across the board. Print the value returned.

e.g. for a board of size 3,3; a few valid paths will be “HHVV”, “VVHH”, “VHHV” etc. c. Write a recursive function
which prints moves for all valid paths across the board (void is the return type for function).

Input Format
    Enter the number of rows N and columns M

Constraints
    None

Output Format
    Display the total number of paths and display all the possible paths in a space separated manner

Sample Input
    3
    3

Sample Output
    VVHH VHVH VHHV HVVH HVHV HHVV
    6
 */
public class MazePathCountPrint {
    public static void main(String[] args) {
        int nor=3;
        int noc=3;
        System.out.print("\n"+mazePath(0,0,nor,noc,""));
    }
    public static int mazePath(int row,int col,int nor,int noc,String ans){
        if(row==nor-1 && col==noc-1){
            System.out.print(ans+" ");
            return 1;
        }
        int count=0;
        if(row<nor){
            count+=mazePath(row+1,col,nor,noc,ans+"V");
        }
        if(col<noc){
            count+=mazePath(row,col+1,nor,noc,ans+"H");
        }
        return count;
    }
}
