package ClassDays.Day51;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fiboBU(n));
        int[] dp=new int[n+1];
        System.out.println(fiboTD(n,dp));
        System.out.println(fibo(n));

    }
    public static int fibo(int n){
        if (n==0 || n==1)
            return n;
        int fa=fibo(n-1);
        int fb=fibo(n-2);
        return fa+fb;
    }
    public static int fiboTD(int n,int[] dp){
        if (n==0 || n==1)
            return n;
        if (dp[n]!=0){  //dp Apply Kra hai
            return dp[n];
        }
        int fa=fiboTD(n-1,dp); //dp[n-1]
        int fb=fiboTD(n-2,dp); //dp[n-2]
        return dp[n]=fa+fb;  //learned or memorized      dp[n]=dp[n-1]+dp[n-2]
    }
    public static int fiboBU(int n) {          // fast becoz recursive stack maintained in fibo top down
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i < dp.length; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
