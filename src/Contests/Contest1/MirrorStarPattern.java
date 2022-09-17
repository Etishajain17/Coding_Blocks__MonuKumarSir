package Contests.Contest1;
/*
Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

      *
   *  *  *
*  *  *  *  *
   *  *  *
      *

Constraints
  0 < N < 10 (only odd numbers allowed)

Sample Input
  5

Sample Output
      *
    * * *
  * * * * *
    * * *
      *

Explanation
  Each '*' is separated from other by a tab.
 */

import java.util.*;
public class MirrorStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n/2,star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<=n/2){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
        }
    }
}

