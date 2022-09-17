package Contests.Contest1;
/*
Take N as input, Calculate it's reverse also Print the reverse.

Constraints
  0 <= N <= 1000000000

Sample Input
  123456789

Sample Output
  987654321

Explanation
  You've to calculate the reverse in a number, not just print the reverse.
 */

import java.util.*;
public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        while(n>0){
            s=s*10+n%10;
            n/=10;
        }
        System.out.println(s);
    }
}
