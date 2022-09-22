package Contests.Contest3;

import java.util.Scanner;
/*
Take as input S, a string. Write a function that does basic string compression. Print the value returned.
E.g. for input “aaabbccds” print out a3b2c2ds.

Input Format
    A single String S.

Constraints
    A string of length between 1 to 1000

Output Format
    The compressed String.

Sample Input
    aaabbccds

Sample Output
    a3b2c2ds

Explanation
    In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice.
    But, 'd' and 's' occurred only once that's why we do not write their occurrence.
 */
public class StringCompression2 {
    public static String stringCompression(String s){
        int c=1;
        String res=""+s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                if(c>1)
                    res+=Integer.toString(c);
                res+=s.charAt(i);
                c=1;
            }
            else
                c++;
        }
        if(c>1)
            res+=Integer.toString(c);
        return res;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(stringCompression(str));
    }
}
