package Contests.Contest1;
/*
Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

Constraints
 0 <= N <= 1000

Sample Input
  10

Sample Output
  55

Explanation
  The 0th fibonnaci is 0 and 1st fibonnaci is 1.
 */
import java.util.*;
public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
}
