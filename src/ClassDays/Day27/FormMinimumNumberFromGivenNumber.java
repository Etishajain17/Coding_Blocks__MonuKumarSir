package ClassDays.Day27;

import java.util.Stack;

/*

link: https://hack.codingblocks.com/app/contests/2883/174/problem
link: https://leetcode.com/problems/construct-smallest-number-from-di-string/

Given an array of patterns containing only I’s and D’s. I for increasing and D for decreasing.
Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.

Input Format
    The First Line contains an Integer N, size of the array. Next Line contains N Strings separated by space.

Constraints
    1 ≤ T ≤ 100 1 ≤ Length of String ≤ 8

Output Format
    Print the minimum number for each String separated by a new Line.

Sample Input
    4
    D I DD II

Sample Output
    21
    12
    321
    123

Explanation
    For the Given sample case, For a Pattern of 'D' print a decreasing sequence which is 2 1.
 */
public class FormMinimumNumberFromGivenNumber {
    public static void main(String[] args) {
        String s="IIIDIDDD";
        System.out.println(FormNumber(s));
    }
    public static String FormNumber(String s){
        int[] ans=new int[s.length()+1];
        int count=1;
        Stack<Integer> st =new Stack<>();
        for (int i = 0; i <=s.length() ; i++) {
            if(i==s.length() || s.charAt(i)=='I'){
                ans[i]=count++;
                while(!st.isEmpty()){
                    ans[st.pop()]=count++;
                }
            }else{
                st.push(i);
            }
        }
        String str="";
        for(int val:ans){
            str+=val;
        }
        return str;
    }
}
