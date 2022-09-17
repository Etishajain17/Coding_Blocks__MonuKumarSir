package Contests.Contest2;

import java.util.Scanner;
/*
You are given an input array whose each element represents the height of a line towers. The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. You need to find how much water filled between these given towers.

Example : Imgur

Input Format
    The first line consists of number of test cases T. Each test case consists an integer N as number of towers and next line contains the N space separated integers.

Constraints
    1 <= N <= 1000000 1 <= t <= 10 0 <= A[i] <= 10000000

Output Format
    Print how much unit of water collected among towers for each test case.

Sample Input
    2
    6
    3  0  0  2  0  4
    12
    0  1  0  2  1  0  1  3  2  1  2  1

Sample Output
    10
    6
 */
public class RainWaterTrapping {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0 ){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] left=new int[n];
            int[] right=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            left[0]=arr[0];
            right[n-1]=arr[n-1];
            for(int i=1,j=n-2;i<n && j>=0;i++,j--){
                left[i]=Math.max(left[i-1],arr[i]);
                right[j]=Math.max(right[j+1],arr[j]);
            }
            int water=0;
            for(int i=0;i<n;i++){
                // System.out.println(left[i]+" "+right[i]);
                water+=Math.min(left[i],right[i])-arr[i];
            }
            System.out.println(water);
        }
    }
}
