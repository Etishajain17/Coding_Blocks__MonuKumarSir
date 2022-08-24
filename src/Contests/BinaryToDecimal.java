package Contests;
/*
Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

Constraints
  0 < N <= 1000000000

Sample Input
  101010

Sample Output
  42

Explanation
  For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
 */
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0, i = 0;
        while (n > 0) {
            s += (n % 10) * Math.pow(2, i);
            n /= 10;
            i++;
        }
        System.out.println(s);
    }
}