package Contests.Contest3;

import java.util.Scanner;
/*
Take as input S, a string. Write a program that inserts between each pair of characters the difference between
their ascii codes and print the ans.

Input Format
    String

Constraints
    Length of String should be between 2 to 1000.

Output Format
    String

Sample Input
    acb

Sample Output
    a2c-1b

Explanation
For the sample case, the Ascii code of a=97 and c=99 ,the difference between c and a is 2.
Similarly ,the Ascii code of b=98 and c=99 and their difference is -1. So the ans is a2c-1b.
 */
public class DifferenceInAsciiCodes {
    public static String diffInAsciiCodes(String s){
        String res=""+s.charAt(0);
        for(int i=1;i<s.length();i++){
            res+=Integer.toString(s.charAt(i)-s.charAt(i-1))+s.charAt(i);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(diffInAsciiCodes(str));
    }
}
