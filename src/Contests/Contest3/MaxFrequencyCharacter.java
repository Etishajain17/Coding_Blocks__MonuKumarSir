package Contests.Contest3;

import java.util.*;
/*
Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

Input Format
    String

Constraints
    A string of length between 1 to 1000.

Output Format
    Character

Sample Input
    aaabacb

Sample Output
    a

Explanation
    For the given input string, a appear 4 times. Hence, it is the most frequent character.
 */

public class MaxFrequencyCharacter {
    public static char maxFrequency(String s){
        int max=0,maxi=0;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(max<arr[i]){
                max=arr[i];
                maxi=i;
            }
        }
        return (char)(maxi+97);
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(maxFrequency(str));
    }
}