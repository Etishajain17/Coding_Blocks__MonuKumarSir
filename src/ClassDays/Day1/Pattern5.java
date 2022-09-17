//        *
//      *   *
//    *   *   *
//  *   *   *   *
//*   *   *   *   *
        package ClassDays.Day1;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=0;
        while(i++<n){
            int k=1;
            while(k++<=n-i)
                System.out.print("  ");
            k=1;
            while(k++<=2*i-1) {
                if (k % 2 == 1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
