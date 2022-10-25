package Contests.Contest4_Recursion;
/*
Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
The output strings should be printed in the sorted order considering '(' has higher value than ')'.

Input Format
    Single line containing an integral value 'n'.

Constraints
    1<=n<=11

Output Format
    Print the balanced parentheses strings with every possible solution on new line.

Sample Input
    2

Sample Output
    ()()
    (())

 */
public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=2;
        generateParenthesis(n,0,0,"");
    }
    public static void generateParenthesis(int n,int open,int closed,String ans){
        if(open==n && closed==n){
            System.out.println(ans);
            return;
        }
        if(open> n || closed>open)
            return;
        generateParenthesis(n,open,closed+1,ans+")");
        generateParenthesis(n,open+1,closed,ans+"(");
    }
}
