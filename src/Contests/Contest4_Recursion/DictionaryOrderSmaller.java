package Contests.Contest4_Recursion;

import java.util.*;
/*
Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the characters
of this string which are in dictionary order smaller than the given string. The output strings must be lexicographically sorted.

Input Format
    Single line input containing a string

Constraints
    Length of string <= 25

Output Format
    Display all the words which are in dictionary order smaller than the string entered in a new line each. The output
    strings must be sorted.

Sample Input
    cab

Sample Output
    abc
    acb
    bac
    bca

Explanation
    The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only four of them are
    lexicographically less than "cab". We print them in lexicographical order.
 */
public class DictionaryOrderSmaller {
    public static void main(String[] args) {
        String actual="cab";
        char[] arr=actual.toCharArray();
        Arrays.sort(arr);
        String str=new String(arr);
        printDictionaryOrderSmaller(str,"",actual);
    }
    public static void printDictionaryOrderSmaller(String ques,String ans,String actual){
        if(ques.length()==0 && ans.compareTo(actual)<0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            printDictionaryOrderSmaller(s1+s2,ans+ch,actual);
        }
    }
}
