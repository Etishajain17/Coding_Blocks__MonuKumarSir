package ClassDays.Day1;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        while(n>0){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
            n--;
        }
        System.out.println(a);
    }
}
