package Day1;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=1;
        while(i++<2*n-1){
            int j=1;
            if(i<=n+1) {
                while (j++ < i)
                    System.out.print("*");
            }
            else{
                j=i;
                while(j++<2*n)
                    System.out.print("*");
            }
            System.out.println();
        }

//        int n= sc.nextInt();
//        int row=1,star=1;
//        while(row<=2*n-1){
//            int i=1;
//            while(i<=star){
//                System.out.print("*");
//                i++;
//            }
//            if(row<n)
//                star++;
//            else
//                star--;
//            row++;
//            System.out.println();
//        }
    }
}
