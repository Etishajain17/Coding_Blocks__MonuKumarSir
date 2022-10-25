package Contests.Contest3_Strings_SlidingWindow;

import java.util.Scanner;

/*
Take as input S, a string. Write a program that gives the count of substrings of this string which are palindromes
and Print the ans.

Input Format
    Single line input containing a string

Constraints
    Length of string is between 1 to 1000.

Output Format
    Integer output showing the number of palindromic substrings.

Sample Input
    abc

Sample Output
    3

Explanation
    For the given sample case , the palindromic substrings of the string abc are "a","b" and "c".So, the ans is 3.

 */
public class StringsCountPalindromicSubstrings {
    public static boolean isPallindrome(String s){
        int low=0,high=s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
    public static int countPallindromeSubstring(String s){
        int c=0;
        for (int len = 1; len <=s.length(); len++) {
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                c+=(s.substring(i,j).length()==1 || isPallindrome(s.substring(i,j)))==true?1:0;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(countPallindromeSubstring(str));
    }
}
