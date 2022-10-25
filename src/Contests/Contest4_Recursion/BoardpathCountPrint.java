package Contests.Contest4_Recursion;
/*
Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders).
Take as input M, a number. M is the number of faces of the dice.

a. Write a recursive function which returns the count of different ways the board can be traveled using the dice.
Print the value returned.

b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function).

Input Format
    Enter a number N (size of the board) and number M(number of the faces of a dice)

Constraints
    None

Output Format
    Display the number of paths and print all the paths in a space separated manner

Sample Input
    3
    3

Sample Output
    111 12 21 3
    4

 */
public class BoardpathCountPrint {
    public static void main(String[] args) {
        int sob=3;
        int nof=3;
        System.out.println("\n"+boardPath(sob,nof,0,""));
    }
    public static int boardPath(int sob,int nof,int cur,String ans){
        if(cur==sob){
            System.out.print(ans+" ");
            return 1;
        }
        if(cur>sob)
            return 0;
        int count=0;
        for (int i = 1; i <= nof; i++) {
            count+=boardPath(sob,nof,cur+i,ans+i);
        }
        return count;
    }
}
