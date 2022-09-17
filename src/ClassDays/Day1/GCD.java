package ClassDays.Day1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        while(dividend % divisor !=0){
            int rem=dividend % divisor;
            dividend=divisor;
            divisor=rem;
        }
        System.out.println(divisor);
    }
}
