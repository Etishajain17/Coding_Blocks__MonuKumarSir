package Contests;
/*
Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

Constraints
  0 < N <= 1000000000

Sample Input
  63

Sample Output
  77

Explanation
  Both input and output are integers
 */
import java.util.*;
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),mul=1;
        int oc=0;
        while(n>0){
            int rem=n%8;
            oc+=rem*mul;
            n/=8;
            mul*=10;
        }
        System.out.println(oc);
    }
}
