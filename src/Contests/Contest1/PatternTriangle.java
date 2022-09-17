package Contests.Contest1;
/*
Take N (number of rows), print the following pattern (for N = 4).

                       1
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4

Constraints
  0 < N < 10

Sample Input
   4

Sample Output
            1
		2	3	2
	3	4	5	4	3
4	5	6	7	6	5	4

Explanation
  Each number is separated from other by a tab.
 */

import java.util.*;
public class PatternTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" \t");
            }
            for(int j=i;j<=2*i-1;j++){
                System.out.print(j+"\t");
            }
            for(int j=2*i-2;j>=i;j--){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
