package Contests;

import java.util.*;
public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        int t=n;
        // int digits=(int)Math.log10(n)+1;
        int count=0;
        while(n>0){
            count+=1;
            n/=10;
        }
        n=t;
        while(n>0){
            s+=(int)Math.pow(n%10,count);
            n/=10;
        }
        System.out.println(s==t);
    }
}
