package Contests.Contest1;
/*
Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.

Input Format
  Single integer N.

Constraints
  N <= 20

Output Format
  Print pattern.

Sample Input
  5

Sample Output
    *****
   *   *
  *   *
 *   *
*****

Explanation
  For any input N. First line contains 4 space and then 5 {*} and then the second line contains according to the output format.
 */

import java.util.*;
public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            space--;
        }
    }
}