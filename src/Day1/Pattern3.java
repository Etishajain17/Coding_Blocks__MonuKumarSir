//* * * * *
//    * * * *
//        * * *
//            * *
//                *
        package Day1;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=0,s=0;
        while(i++<=n){
            int k=1;
            while(k++<=s)
                System.out.print("  ");
            k=1;
            while(k++<=n-i+1)
                System.out.print("* ");
            System.out.println();
            s+=2;
        }
    }
}
