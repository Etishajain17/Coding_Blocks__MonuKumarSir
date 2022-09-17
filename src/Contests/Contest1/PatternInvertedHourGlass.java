package Contests.Contest1;
/*
Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5
             5 4               4 5
             5 4 3           3 4 5
             5 4 3 2       2 3 4 5
             5 4 3 2 1   1 2 3 4 5
             5 4 3 2 1 0 1 2 3 4 5
             5 4 3 2 1   1 2 3 4 5
             5 4 3 2       2 3 4 5
             5 4 3           3 4 5
             5 4               4 5
             5                   5

Input Format
  Take N as input.

Output Format
  Pattern should be printed with a space between every two values.

 */

import java.util.*;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=2*n-1,x=n;
        for(int i=1;i<=2*n+1;i++){
            for(int j=n;j>=x;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            int j=x;
            if(i==n+1)
                j=x+1;
            for(;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            if(i<=n){
                space-=2;
                x--;
            }
            else{
                space+=2;
                x++;
            }
        }
    }
}