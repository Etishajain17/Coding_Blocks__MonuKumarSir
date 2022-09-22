package Contests.Contest1_Basics_Patterns;
/*
You will be given a number N. You have to code a hollow diamond looking pattern.
The output for N=5 is given in the following image.
*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********

Input Format
  The input has only one single integer N.

Output Format
  Output the given pattern.

Explanation
  Write a code to print above given pattern. No space between any two characters.
 */

import java.util.*;
public class PatternMagic {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=0,star=n;
        for(int i=1;i<2*n;i++){
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int j=1;j<2*space;j++){
                System.out.print(" ");
            }
            int j=0;
            if(i==1 || i==2*n-1)
                j=1;
            for(;j<star;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i>=n){
                space--;
                star++;
            }
            else{
                space++;
                star--;
            }
        }
    }
}
