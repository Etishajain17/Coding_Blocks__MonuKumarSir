
package ClassDays.Day1;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(),i=0,s=0;
//        while(i++<n){
//            int k=1;
//            while(k++<=s)
//                System.out.print("  ");
//            k=1;
//            while(k++<=n-i+1)
//                System.out.print("* ");
//            System.out.println();d`qaz
//            s+=2;
//        }
        int n=sc.nextInt();
        int row = 1;
        int star = n;
        int space =0;
        while(row<=2*n-1)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }

            int j=1;
            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            if(row<n) {
                space+=2;
                star--;
            }
            else{
                space-=2;
                star++;
            }
            row++;
        }

    }
}

