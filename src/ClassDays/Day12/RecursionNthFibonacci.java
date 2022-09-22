package ClassDays.Day12;

import java.util.Scanner;

public class RecursionNthFibonacci {
    public static int fib(int n){
        if(n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);            //head recursion
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
