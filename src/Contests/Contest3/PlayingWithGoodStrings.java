package Contests.Contest3;

import java.util.Scanner;
/*
A Good String is a string which contains only vowels (a,e,i,o,u) . Given a string S, print a single positive integer N
where N is the length of the longest substring of S that is also a Good String.

Note: The time limit for this problem is 1 second, so you need to be clever in how you compute the substrings.

Input Format
    A string 'S'

Constraints
    Length of string < 10^5

Output Format
    A single positive integer N, where N is the length of the longest sub-string of S that is also a Good String.

Sample Input
    cbaeicde

Sample Output
    3

Explanation
    Longest good substring is "aei"
 */
public class PlayingWithGoodStrings {
    public static int goodString(String s){
        int ans=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                c++;
            else {
                ans = Math.max(ans, c);
                c = 0;
            }
        }
        return Math.max(ans,c);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(goodString(str));
    }
}
