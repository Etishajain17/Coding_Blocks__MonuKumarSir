package Contests.Contest4_Recursion;

import java.util.*;
/*
Take as input N, a number. Take N more inputs and store that in an array. Take as input target, a number

a. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.

b. Write a recursive function which prints subsets of the array which sum to target. Return type of functions is void.

Input Format
    Take as input N, a number. Take N more inputs and store that in an array.Take as input target, a number

Constraints
    None

Output Format
    Display the number of subsets and print the subsets in a space separated manner.

Sample Input
    3
    1
    2
    3
    3

Sample Output
    1 2  3
    2
 */
public class SubsetPrblmRecursion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int total=sc.nextInt();
        System.out.println("\n"+subset(arr,0,0,total,""));
    }
    public static int subset(int[] arr,int idx,int currTotal,int total,String ans){
        if(currTotal==total){
            System.out.print(ans+" ");
            return 1;
        }
        int count=0;
        if(idx<arr.length) {
            count+=subset(arr,idx+1,currTotal+arr[idx],total,ans+arr[idx]+" ");
            count+=subset(arr,idx+1,currTotal,total,ans);
        }
        return count;
    }
}
