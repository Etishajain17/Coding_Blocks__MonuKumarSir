package Contests;
/*
Take N (number of rows), print the following pattern (for N = 4)
0
1 1
2 3 5
8 13 21 34

Constraints
  0 < N < 100

Explanation
  Each number is separated from other by a tab. For given input n, You need to print n(n+1)/2 fibonacci numbers.
  Kth row contains , next k fibonacci numbers.
 */

import java.util.*;
public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),j=1,a=0,b=1;
        for(int i=1;i<=(n*(n+1))/2;i++){
            System.out.print(a+"\t");
            if(((j*(j+1))/2) ==i){
                System.out.println();
                j++;
            }
            int c=a+b;
            a=b;
            b=c;
        }
    }
}