package ClassDays.Day52;

import java.util.Arrays;

// dp until ten power three  --> n square , space n
// binary search on power five also --> n logn , space n
public class LongestIncreasingSubsequenceLeetCodeProblem {
    public static void main(String[] args) {
        LongestIncreasingSubsequenceLeetCodeProblem l=new LongestIncreasingSubsequenceLeetCodeProblem();
        System.out.println(l.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        System.out.println(lis(new int[]{10,9,2,5,3,7,101,18}));
    }

    //backtracking top down
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for (int i = 1; i < dp.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max=dp[0];
        for (int i = 1; i < dp.length ; i++) {
            max=Math.max(dp[i],max);
        }
        return max;
    }

    //binary search
    public static int lis(int[] arr){
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        int len=1;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>dp[len-1]){
                dp[len]=arr[i];
                len++;
            }else{
                int ith=search(dp,0,len-1,arr[i]);
                dp[ith]=arr[i];
            }
        }
        return len;
    }
    private static int search(int[] dp,int si,int ei,int item){
        int ans=0;
        while (si<=ei){
            int mid=(si+ei)/2;
            if (dp[mid]>=item){
                ans=mid;
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }
        return ans;
    }
}
