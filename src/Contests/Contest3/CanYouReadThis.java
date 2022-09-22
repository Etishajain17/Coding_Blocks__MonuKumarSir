package Contests.Contest3;

import java.util.Scanner;
/*
One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code,
developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case.
ie y.

Input Format
    A single line contains the string.

Constraints
    |S|<=1000

Output Format
    Print words present in the string, in the order in which it appears in the string.

Sample Input
    IAmACompetitiveProgrammer

Sample Output
    I
    Am
    A
    Competitive
    Programmer

Explanation
    There are 5 words in the string.
 */
public class CanYouReadThis {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int j=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                System.out.println(s.substring(j,i));
                j=i;
            }
        }
        System.out.println(s.substring(j));
    }
}
