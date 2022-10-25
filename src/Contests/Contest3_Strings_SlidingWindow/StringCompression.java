package Contests.Contest3_Strings_SlidingWindow;

import java.util.Scanner;
/*
Take as input S, a string. Write a function that does basic string compression. Print the value returned.
 E.g. for input “aaabbccds” print out a3b2c2d1s1.

Input Format
    A single String S

Constraints
    1 < = length of String < = 1000

Output Format
    The compressed String.

Sample Input
    aaabbccds

Sample Output
    a3b2c2d1s1

Explanation
    In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice,
    'c' is repeated twice and 'd and 's' occurred only once.
 */
public class StringCompression {
    public static String compression(String s){
        String res="";
        res+=s.charAt(0);
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                res+=Integer.toString(c)+s.charAt(i);
                c=1;
            }
            else{
                c++;
            }
        }
        return res+Integer.toString(c);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(compression(str));
    }
}
