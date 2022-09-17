//                *
//              * *
//            * * *
//          * * * *
//        * * * * *
package ClassDays.Day1;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=1;
        while(i++<=n){
            int k=1;
            while(k++<=n-i+1){
                System.out.print("  ");
            }
            k=1;
            while(k++<=i-1){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
