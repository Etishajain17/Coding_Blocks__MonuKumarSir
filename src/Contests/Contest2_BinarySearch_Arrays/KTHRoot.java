package Contests.Contest2_BinarySearch_Arrays;

import java.util.Scanner;

/*
You are given two integers n and k. Find the greatest integer x, such that, x^k <= n.

Input Format
  First line contains number of test cases, T. Next T lines contains integers, n and k.

Constraints
  1<=T<=10
  1<=N<=10^15
  1<=K<=10^4

Output Format
  Output the integer x

Sample Input
  2
  10000 1
  1000000000000000 10

Sample Output
  10000
  31

Explanation
  For the first test case, for x=10000, 10000^1=10000=n
 */
public class KTHRoot {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.next());
        while(t-- >0){
            long n=Long.parseLong(sc.next());
            long k=Long.parseLong(sc.next());
            long low=1,high=n,ans=0;
            while(low<=high){
                long mid=(long)((low+high)/2);
                if(Math.pow(mid,k)<=n){
                    ans=mid;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            System.out.println(ans);
        }
    }
}
