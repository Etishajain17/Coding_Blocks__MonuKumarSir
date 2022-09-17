package ClassDays.Day9;

import java.util.Scanner;

public class SlidingWindow {
    public static  int MaximumSumOfWindowSize(int[] arr,int k){
        int sum=0,ans=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        ans=sum;
        for (int i = k; i <arr.length ; i++) {
            sum+=arr[i]-arr[i-k];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(MaximumSumOfWindowSize(arr,k));
    }
}
