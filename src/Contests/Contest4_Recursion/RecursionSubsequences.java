package Contests.Contest4_Recursion;

import java.util.Scanner;
/*
Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.

a. Write a recursive function which returns the count of subsequences for a given string. Print the value returned.

b. Write a recursive function which prints all possible subsequences for a “abcd” has following
subsequences “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.given
string (void is the return type for function).
Note: Use cin for input for C++

Input Format
    Enter a string

Constraints
    None

Output Format
    Print all the subsequences in a space separated manner and display the total no. of subsequences.

Sample Input
    abcd

Sample Output
     d c cd b bd bc bcd a ad ac acd ab abd abc abcd
    16

Explanation
    Print all possible subsequences of the given string.
 */
public class RecursionSubsequences {
    public static void subSequence(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return ;
        }
        char ch=ques.charAt(0);
        subSequence(ques.substring(1),ans);
        subSequence(ques.substring(1),ans+ch);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        subSequence(s,"");
        System.out.println();
        System.out.println((int)Math.pow(2,s.length()));
    }
}
