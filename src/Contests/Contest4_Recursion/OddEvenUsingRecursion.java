package Contests.Contest4_Recursion;

import java.util.Scanner;
/*
Take as input N, a number. Print odd numbers in decreasing sequence (up until 0) and even numbers in increasing
sequence (up until N) using Recursion

Input Format
Constraints
    1 <= N <=1000

Output Format
Sample Input
    5

Sample Output
    5
    3
    1
    2
    4
 */
public class OddEvenUsingRecursion {
    public static void oddEven(int n,int x) {
        if(x<0)
            return;
        System.out.println(x);
        oddEven(n,x-2);
        if(x<n)
            System.out.println(x+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
            oddEven(n,n-1);
        else
            oddEven(n,n);
    }
}
