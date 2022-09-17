package ClassDays.Day3;
/*
      1
     121
    12321
   1234321
  123454321
 */
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1,star=1;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=space; j++) {
                System.out.print("  ");
            }
            int val=1;
            for(int j=1;j<=star;j++){
                System.out.print(val+" ");
                if(j<=star/2)
                    val++;
                else
                    val--;
            }
            star+=2;
            space--;
            System.out.println();
        }
    }
}
