package ClassDays.Day1;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("even");
        else if(n>7)
            System.out.println("hey");
        else
            System.out.println("odd");
    }
}
