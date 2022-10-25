package Contests.Contest4_Recursion;
/*
Take as input N, a number. Write a recursive function which prints counting from 0 to N in lexicographical order.
In lexicographical (dictionary) order 10, 100 and 109 will be printed before 11.

Input Format
    Enter a number N.

Constraints
    None

Output Format
    Display all the numbers upto N in a lexicographical order

Sample Input
    10

Sample Output
    0 1 10 2 3 4 5 6 7 8 9
 */
public class RecursionLexicographicalOrder {
    public static void main(String[] args) {
        int end=10;
        printLexicoCounting(0,end);
    }
    public static void printLexicoCounting(int curr,int end){
        if(curr>end)
            return;
        System.out.print(curr+" ");
        int i=0;
        if(curr==0)
            i=1;
        for (; i <= 9; i++) {
            printLexicoCounting(curr*10+i,end);
        }
    }
}
