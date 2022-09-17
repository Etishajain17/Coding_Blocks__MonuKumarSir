package Contests.Contest1;
/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

Constraints
  0 < N1 < 100 0 < N2 < 100

Sample Input
  10
  4

Sample Output
  5
  11
  14
  17
  23
  26
  29
  35
  38
  41
 */
import java.util.*;
public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n=0,i=1;
        while(n!=n1){
            int x=3*i+2;
            if(x%n2!=0){
                System.out.println(x);
                n++;
            }
            i++;
        }
    }
}
