package Contests.Contest3_Strings_SlidingWindow;

import java.util.Scanner;
/*
Take as input S, a string. Write a function that returns true if the string is a palindrome and false otherwise.
Print the value returned.

Input Format
    String

Constraints
    String length between 1 to 1000 characters

Output Format
    Boolean

Sample Input
    abba

Sample Output
    true

Explanation
A string is said to be palindrome if reverse of the string is same as string.
For example, “abba” is palindrome as it's reverse is "abba", but “abbc” is not palindrome as it's reverse is "cbba".
 */
public class StringsIsPalindrome {
    public static boolean isPalindrome(String s){
        int low=0,high=s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(isPalindrome(str));
    }
}
