package Contests;
/*
Take N as input. For a value of N=7, we wish to draw the following pattern :

                            1
                        2 1   1 2
                    3 2 1       1 2 3
                4 3 2 1           1 2 3 4
                    3 2 1       1 2 3
                        2 1   1 2
                            1

Input Format
  Take N as input.

Constraints
  N is odd number.

Output Format
  Pattern should be printed with a space between every two values.

Sample Input
  7

Sample Output
            1
        2 1   1 2
    3 2 1       1 2 3
4 3 2 1           1 2 3 4
    3 2 1       1 2 3
        2 1   1 2
            1

Explanation
  Catch the pattern and print it accordingly.
 */

import java.util.*;
public class PatternDoubleSidedArrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1,num=1,space2=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=num;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<2*space2;j++){
                System.out.print("  ");
            }
            int j=1;
            if(i==1 || i==n)
                j=2;
            for(;j<=num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            if(i<=n/2){
                space-=2;
                num++;
                space2++;
            }
            else{
                space+=2;
                num--;
                space2--;
            }
        }
    }
}