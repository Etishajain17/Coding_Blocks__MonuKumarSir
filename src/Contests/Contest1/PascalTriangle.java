package Contests.Contest1;
/*
Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

Constraints
  0 < N < 100

Sample Input
  6

Sample Output
1
1	1
1	2	1
1	3	3	1
1	4	6	4	1
1	5	10	10	5	1

Explanation
  Each number is separated from other by a tab.
 */

import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int res=1;
            System.out.print(res+" \t");
            for(int j=2;j<=i;j++){
                res*=i-j+1;
                res/=j-1;
                System.out.print(res+" \t");
            }
            System.out.println();
        }
    }
}