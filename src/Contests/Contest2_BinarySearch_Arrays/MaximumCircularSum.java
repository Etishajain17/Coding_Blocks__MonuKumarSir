package Contests.Contest2_BinarySearch_Arrays;

import java.util.*;
/*
You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum
sum of consecutive numbers.

Input Format
    First line contains integer t which is number of test case.
    For each test case, it contains an integer n which is the size of array and next line contains n space
    separated integers denoting the elements of the array.

Constraints
    1<=t<=100
    1<=n<=1000
    |Ai| <= 10000

Output Format
    Print the maximum circular sum for each testcase in a new line.

Sample Input
    1
    7
    8 -8 9 -9 10 -11 12

Sample Output
    22

Explanation
    Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)
 */
public class MaximumCircularSum {
    public static int Kadane(int[] arr){
        int sum=arr[0],maxs=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum<0)
                sum=0;
            sum+=arr[i];
            maxs=Math.max(maxs,sum);
        }
        return maxs;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            int max1=Kadane(arr);
            for(int i=0;i<n;i++){
                arr[i]*=-1;
            }
            int max2=sum+Kadane(arr);
            System.out.println(Math.max(max1,max2));
        }
    }
}
