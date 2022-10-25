package Contests.Contest4_Recursion;

import java.util.Scanner;

/*
Replace all occurrences of pi with 3.14

Input Format
    Integer N, no of lines with one string per line

Constraints
    0 < N < 1000
    0 <= len(str) < 1000

Output Format
    Output result one per line

Sample Input
    3
    xpix
    xabpixx3.15x
    xpipippixx

Sample Output
    x3.14x
    xab3.14xx3.15x
    x3.143.14p3.14xx

Explanation
    All occurrences of pi have been replaced with "3.14".
 */
public class ReplaceAllPi {
    public static String replaceAll(String s) {
        if(s.length()==0)
            return "";
        if(s.length()>1 && (s.charAt(0)=='p'&& s.charAt(1)=='i')) {
            return "3.14"+replaceAll(s.substring(2));
        }
        return s.charAt(0)+replaceAll(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String str=sc.next();
            System.out.println(replaceAll(str));
        }
    }
}
