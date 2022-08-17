package Day1;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=1;
        while(i++<=n){
            int j=1;
            while(j++<i)
                System.out.print("*");
            System.out.println();
        }
    }
}
