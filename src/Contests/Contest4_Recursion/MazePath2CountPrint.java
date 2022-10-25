package Contests.Contest4_Recursion;
/*
Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board.
Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can
move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).

a. Write a recursive function which returns the count of different ways the player can travel across the board.
Print the value returned.

b. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).

Input Format
    Enter the number of rows N1 and number of columns N2

Constraints
    None

Output Format
    Display the total number of paths and print all the possible paths in a space separated manner

Sample Input
    3
    3

Sample Output
    VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
    13

 */
public class MazePath2CountPrint {
    public static void main(String[] args) {
        int nor=3;
        int noc=3;
        System.out.print("\n"+mazePathD(0,0,nor,noc,""));
    }
    public static int mazePathD(int row,int col,int nor,int noc,String ans){
        if(row==nor-1 && col==noc-1){
            System.out.print(ans+" ");
            return 1;
        }
        int count=0;
        if(row<nor && col<noc){
            count+=mazePathD(row+1,col,nor,noc,ans+"V");
            count+=mazePathD(row,col+1,nor,noc,ans+"H");
            count+=mazePathD(row+1,col+1,nor,noc,ans+"D");
        }
        return count;
    }
}
