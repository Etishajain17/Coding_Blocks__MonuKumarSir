package ClassDays.Day9;

import java.util.Scanner;

public class MaximumSumCircularSubarrayLeetCode {
    public static int maxSubarraySumCircular(int[] nums) {
        int max1=Kadane(nums);
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            nums[i]*=(-1);
        }
        int max2=s+Kadane(nums);
        max2=max2==0?max1:max2;
        return Math.max(max1,max2);
    }
    public static int Kadane(int[] arr){
        int sum=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum<0)
                sum=0;
            sum+=arr[i];
            if(ans<sum)
                ans=sum;
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
        System.out.println(maxSubarraySumCircular(arr));
    }
}
