package Day3;
/*
nCr+1 =( n-r / r+1 )* nCr
 */
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=0;
        int star=1;
        while(row<n){
            int i=0;
            int val=1;
            while(i<star){
                System.out.print(val+" ");
                val=(val*(row-i))/(i+1);
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
