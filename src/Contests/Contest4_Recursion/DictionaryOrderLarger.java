package Contests.Contest4_Recursion;

import java.util.*;
/*
Take as input str, a string. Write a recursive function which prints all the words possible by rearranging the
characters of this string which are in dictionary order larger than the given string.
The output strings must be lexicographically sorted.

Input Format
    Single line input containing a string

Constraints
    Length of string <= 10

Output Format
    Display all the words which are in dictionary order larger than the string entered in a new line each.
    The output strings must be sorted.

Sample Input
    cab

Sample Output
    cba

Explanation
    The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only one of them is
    lexicographically greater than "cab". We only print "cba".
 */
public class DictionaryOrderLarger {
    public static void main(String[] args) {
        String actual="cab";
        char[] arr=actual.toCharArray();
        Arrays.sort(arr);
        String str=new String(arr);
        printDictionaryOrderLarger(str,"",actual);
    }
    public static void printDictionaryOrderLarger(String ques,String ans,String actual){
        if(ques.length()==0 && ans.compareTo(actual)>0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            printDictionaryOrderLarger(s1+s2,ans+ch,actual);
        }
    }
}
