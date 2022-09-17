package Contests.Contest2;

import java.util.*;
/*
Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of
all the elements of arr except arr[i].

Input Format
    First line contains integer N as size of array.
    Next line contains a N integer as element of array.

Constraints
    arr[i]<=10000000

Output Format
    print output array

Sample Input
    4
    1 2 3 4

Sample Output
    24 12 8 6
 */
public class ProductOfArrayExceptSelf {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long[] left=new long[n];
        long[] right=new long[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1,j=n-2;i<n && j>=0;i++,j--){
            left[i]=arr[i-1]*left[i-1];
            right[j]=arr[j+1]*right[j+1];
        }
        for(int i=0;i<n;i++){
            System.out.print((left[i]*right[i])+" ");
        }
    }
}
