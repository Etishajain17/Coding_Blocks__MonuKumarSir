package Contests.Contest3;

import java.util.Scanner;
/*
Given a string, find the first non-repeating character in it. For example, if the input string is “GeeksforGeeks”,
then output should be ‘f’ and if input string is “GeeksQuiz”, then output should be ‘G’.

Input Format
    The first line contains T denoting the number of testcases. Then follows description of testcases.
    Each case begins with a single integer N denoting the length of string. The next line contains the string S.

Constraints
Output Format
    For each testcase, print the first non repeating character present in string. Print -1 if there is no non repeating
    character.

Sample Input
    3
    codingblocks
    abbac
    java

Sample Output
    d
    c
    j
 */
public class NonRepeatingCharacter {
    public static int nonRepeating(String s){
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            int res=nonRepeating(s);
            System.out.println(res==-1?-1:""+s.charAt(res));
        }
    }
}
