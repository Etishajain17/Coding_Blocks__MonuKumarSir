package Contests.Contest3_Strings_SlidingWindow;

import java.util.Scanner;
/*
Take as input S, a string. Write a function that replaces every even character with the character having just higher
ASCII code and every odd character with the character having just lower ASCII code. Print the value returned.

Input Format
    String

Constraints
    Length of string should be between 1 to 1000.

Output Format
    String

Sample Input
    abcg

Sample Output
    badf
 */
public class StringsOddEvenCharacter {
    public static String oddEvenCharacter(String s){
        for(int i=0;i<s.length();i++){
            if(i%2==0)
                s=s.substring(0,i)+(char)((int)s.charAt(i)+1)+s.substring(i+1,s.length());
            else
                s=s.substring(0,i)+(char)((int)s.charAt(i)-1)+s.substring(i+1,s.length());
        }
        return s;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(oddEvenCharacter(str));
    }
}
