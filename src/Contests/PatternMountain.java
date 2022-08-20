package Contests;
/*
Take N (number of rows), print the following pattern (for N = 4).

                       1           1
                       1 2       2 1
                       1 2 3   3 2 1
                       1 2 3 4 3 2 1

Constraints
  0 < N < 10

Sample Input
  4

Sample Output
1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1
 */

import java.util.*;
public class PatternMountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=2*n-3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" \t");
            }
            int j=i;
            if(i==n)
                j=i-1;
            for(;j>=1;j--){
                System.out.print(j+"\t");
            }
            System.out.println();
            space-=2;
        }
    }
}