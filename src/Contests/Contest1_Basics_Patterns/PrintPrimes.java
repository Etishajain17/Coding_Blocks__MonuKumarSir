package Contests.Contest1_Basics_Patterns;
/*
Take N as input. Print all prime numbers from 2 to N.

Constraints
  1 <= N <= 1000

Sample Input
  10

Sample Output
  2
  3
  5
  7

Explanation
  Each output should be on separate line. A prime number is that number which is divisible by one or itself.
 */

import java.util.*;
public class PrintPrimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=2)
            System.out.println(2);
        for(int i=3;i<=n;i+=2){
            int f=0;
            for(int j=3;j<=Math.sqrt(i);j=j+2){
                if(i%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0)
                System.out.println(i);
        }
    }
}

