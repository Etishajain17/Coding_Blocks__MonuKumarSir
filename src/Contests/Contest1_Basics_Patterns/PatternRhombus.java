package Contests.Contest1_Basics_Patterns;
/*
Take N (number of rows), print the following pattern (for N = 3).

                         1
                       2 3 2
                     3 4 5 4 3
                       2 3 2
                         1

Constraints
  0 < N < 10

Sample Input
  3

Sample Output
        1
	2	3	2
3	4	5	4	3
	2	3	2
		1

Explanation
  Each number is separated from other by a tab.
 */

import java.util.*;
public class PatternRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1,num1=1,num2=1;
        for(int i=1;i<2*n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" \t");
            }
            for(int j=num2;j<=num1;j++){
                System.out.print(j+"\t");
            }
            for(int j=num1-1;j>=num2;j--){
                System.out.print(j+"\t");
            }
            System.out.println();
            if(i<n){
                num1+=2;
                space--;
                num2+=1;
            }
            else if(i==n)
            {
                num1-=2;
                space++;
                num2=n-1;
            }
            else{
                num1-=2;
                space++;
                num2-=1;
            }
        }
    }
}
