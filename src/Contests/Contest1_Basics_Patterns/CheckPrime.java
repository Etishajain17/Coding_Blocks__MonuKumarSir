package Contests.Contest1_Basics_Patterns;
/*
Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

Constraints
  2 < N <= 1000000000

Sample Input
  3

Sample Output
  Prime

Explanation
  The output is case specific
 */

import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n!=2 && n%2==0)
            System.out.println("Not Prime");
        else if(n==2)
            System.out.println("Prime");
        else{
            for(int i=3;i<Math.sqrt(n);i=i+2){
                if(n%i==0){
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
    }
}
