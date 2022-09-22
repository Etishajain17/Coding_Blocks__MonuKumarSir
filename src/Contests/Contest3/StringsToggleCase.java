package Contests.Contest3;

import java.util.Scanner;
/*
Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

Input Format
    String

Constraints
    Length of string should be between 1 to 1000.

Output Format
    String

Sample Input
    abC

Sample Output
    ABc

Explanation
    Toggle Case means to change UpperCase character to LowerCase character and vice-versa.
 */
public class StringsToggleCase {
    public static String toggleCase(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                s=s.substring(0,i)+(char)((int)(s.charAt(i)+32))+s.substring(i+1,s.length());
            else
                s=s.substring(0,i)+(char)((int)(s.charAt(i)-32))+s.substring(i+1,s.length());
        }
        return s;
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(toggleCase(str));
    }
}
