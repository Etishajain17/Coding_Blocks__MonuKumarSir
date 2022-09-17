package Contests.Contest1;
/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

Constraints
  0 < N1 < 100 N1 < N2 < 10000

Sample Input
  400
  1000

Sample Output
  407

Explanation
  Each number in output is in separate line.
 */
import java.util.*;
public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mi=sc.nextInt();
        int ma=sc.nextInt();
        while(mi<=ma){
            int s=0;
            int t=mi;
            int count=0;
            while(t>0){
                count+=1;
                t/=10;
            }
            t=mi;
            while(t>0){
                s+=(int)Math.pow(t%10,count);
                t/=10;
            }
            if(mi==s)
                System.out.println(mi);
            mi++;
        }
    }
}
