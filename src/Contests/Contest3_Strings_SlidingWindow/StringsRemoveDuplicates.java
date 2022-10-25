package Contests.Contest3_Strings_SlidingWindow;

import java.util.Scanner;
/*
Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

Input Format
    String

Constraints
    A string of length between 1 to 1000

Output Format
    String

Sample Input
    aabccba

Sample Output
    abcba

Explanation
    For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2.
    After removing all of the consecutive occurences, the Final ans will be : - "abcba".

 */
public class StringsRemoveDuplicates {
    public static String removeConsecutiveDuplicate(String s){
        String res=""+s.charAt(0);
        int k=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=res.charAt(k)) {
                res+=s.charAt(i);
                k++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(removeConsecutiveDuplicate(str));
    }
}
