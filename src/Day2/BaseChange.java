package Day2;
/*
From base 5 to base 10
div by destination base and multiply by source base.(one base should be 10 for this formula)
so convert anyone to 10 if in case like 5 to 7
 */
import java.util.Scanner;

public class BaseChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,mul=1;
        while (n > 0) {
            int rem=n%10;
            sum+=rem*mul;
            n=n/10;
            mul=mul*5;
        }
        System.out.println(sum);
    }
}
