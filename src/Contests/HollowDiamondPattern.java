package Contests;
/*
Take N (number of rows), print the following pattern (for N = 5).

     * * * * *
     * *   * *
     *       *
     * *   * *
     * * * * *

Constraints
  0 < N < 10 (where N is an odd number)

Sample Input
  5

Sample Output
*	*	*   *   *
*	*	    *   *
* 	            *
* 	*       *   *
* 	*	*   *   *

Explanation
  Each '*' is separated from other by a tab.
 */

import java.util.*;
public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=0,star=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<star;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<2*space;j++){
                System.out.print(" \t");
            }
            int j=0;
            if(i==1 || i==n)
                j=1;
            for(;j<star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                space++;
                star--;
            }
            else{
                space--;
                star++;
            }
        }
    }
}

