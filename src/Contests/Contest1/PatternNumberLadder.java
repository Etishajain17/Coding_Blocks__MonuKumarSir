package Contests.Contest1;
/*
Take N (number of rows), print the following pattern (for N = 4)

1
2 3
4 5 6
7 8 9 10


Constraints
  0 < N < 100

Sample Input
  4

Sample Output
1
2	3
4	5	6
7	8	9	10

Explanation
  Each number is separated from other by a tab.
 */

import java.util.*;
public class PatternNumberLadder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),j=1;
        for(int i=1;i<=n*(n+1)/2;i++)
        {
            System.out.print(i+"\t");
            if(j*(j+1)/2==i){
                System.out.println();
                j++;
            }
        }
    }
}

