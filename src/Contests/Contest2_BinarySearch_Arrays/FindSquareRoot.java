package Contests.Contest2_BinarySearch_Arrays;

import java.util.Scanner;
/*
Implement squareroot(x).

Compute and return the square root of x.

If x is not a perfect square, return floor(sqrt(x)).
Note: DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY

Input Format
    An integer A .

Constraints
    0 <= A <10000000000

Output Format
    Squareroot of A.

Sample Input
    25

Sample Output
    5
 */
public class FindSquareRoot {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int low=1,high=a,ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Math.pow(mid,2)<=a){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        System.out.println(ans);
    }
}
