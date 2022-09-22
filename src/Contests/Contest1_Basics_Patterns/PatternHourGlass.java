package Contests.Contest1_Basics_Patterns;
/*
Take N as input. For a value of N=5, we wish to draw the following pattern :

                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4
                              3 2 1 0 1 2 3
                                2 1 0 1 2
                                  1 0 1
                                    0
                                  1 0 1
                                2 1 0 1 2
                              3 2 1 0 1 2 3
                            4 3 2 1 0 1 2 3 4
                          5 4 3 2 1 0 1 2 3 4 5

Input Format
  Take N as input.

Constraints
  N <= 20

Output Format
  Pattern should be printed with a space between every two values.
 */

import java.util.*;
public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n,space=0;
        for(int i=1;i<=2*n+1;i++){
            for(int j=1;j<=space;j++)
                System.out.print("  ");
            for(int j=x;j>=0;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=x;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            if(i<=n){
                space++;
                x--;
            }
            else{
                space--;
                x++;
            }
        }
    }
}