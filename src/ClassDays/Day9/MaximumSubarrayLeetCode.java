package ClassDays.Day9;

import java.util.Scanner;

//Kadane's Algorithm
public class MaximumSubarrayLeetCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int ans=arr[0],sum=arr[0];
        for (int i = 1; i < n; i++) {
            if(sum<0)
                sum=0;
            sum+=arr[i];
            if(ans<sum)
                ans=sum;
        }
        System.out.println(ans);
    }
}

