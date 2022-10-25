package Contests.Contest4_Recursion;

import java.util.Scanner;
/*
Take as input str, a number in form of a string. Write a recursive function to convert the number in string
form to number in integer form. E.g. for “1234” return 1234. Print the value returned.

Input Format
    Enter a number in form of a String

Constraints
    1 <= Length of String <= 10

Output Format
    Print the number after converting it into integer

Sample Input
    1234

Sample Output
    1234

Explanation
    Convert the string to int. Do not use any inbuilt functions.
 */
public class RecursionConvertStringToInteger {
    public static int conversionSToI(String s) {
        if(s.length()==0){
            return 0;
        }
        return conversionSToI(s.substring(0,s.length()-1))*10+(s.charAt(s.length()-1)-'0');
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(conversionSToI(str));
    }
}
