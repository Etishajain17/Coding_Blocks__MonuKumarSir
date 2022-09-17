package ClassDays.Day3;

import java.util.Scanner;
/*
                            1
                        2 1   1 2
                    3 2 1       1 2 3
                4 3 2 1           1 2 3 4
                    3 2 1       1 2 3
                        2 1   1 2
                            1
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space1=n-1,space2=-1;
        int star=1,row=1;
        while(row<=n){
            int i=1;
            while(i<=space1){
                System.out.print("  ");
                i++;
            }
            i=1;
            int p=star;
            while(i<=star){
                System.out.print(p+" ");
                i++;
                p--;
            }
            i=1;
            while(i<=space2){
                System.out.print("  ");
                i++;
            }
            i=1;
            if(row==1 || row==n)
                i=2;
            p=p+1;
            while(i<=star){
                System.out.print(p+" ");
                i++;
                p++;
            }
            System.out.println();
            if(row<=n/2){
                space1-=2;
                star++;
                space2+=2;
            }
            else{
                space1+=2;
                star--;
                space2-=2;
            }
            row++;
        }
    }
}
