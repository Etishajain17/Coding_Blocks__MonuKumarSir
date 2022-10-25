package Contests.Contest4_Recursion;

import java.util.*;
/*
Take as input str, a string. A “twin” is defined as two instances of a char separated by a char. E.g. "AxA" the A's make
a “twin”. “twins” can overlap, so "AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which recursively
counts number of “twins” in a string. Print the value returned.

Input Format
    Enter the string

Constraints
    None

Output Format
    Display the number of twins

Sample Input
    AXAXA

Sample Output
    3
 */
public class RecursionTwins {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(checkTwins(str,1,0));
    }
    public static int checkTwins(String str,int idx,int ans){
        if(idx==str.length()-1)
            return ans;
        if(str.charAt(idx-1)==str.charAt(idx+1))
            ans++;
        return checkTwins(str,idx+1,ans);
    }
}
