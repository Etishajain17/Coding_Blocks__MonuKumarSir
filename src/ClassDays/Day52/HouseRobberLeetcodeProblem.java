package ClassDays.Day52;

import java.util.Arrays;

public class HouseRobberLeetcodeProblem {
    public static void main(String[] args) {
//        int[] arr={};
//        int[] dp=new int[arr.length];
//        Arrays.fill(dp,-1);

    }
    public static int robber(int[] arr,int i){
        if (i>=arr.length)
            return 0;
        int rob=arr[i]+robber(arr,i+2);
        int dontrob=robber(arr,i+1);
        return Math.max(rob,dontrob);
    }
    public static int robberTD(int[] arr,int i,int[] dp){
        if (i>=arr.length)
            return 0;
        if (dp[i]!=-1)
            return dp[i];
        int rob=arr[i]+robberTD(arr,i+2,dp);
        int dontrob=robberTD(arr,i+1,dp);
        return dp[i]=Math.max(rob,dontrob);
    }

    public static int robberBU(int[] arr){
        if (arr.length==1){
            return arr[0];
        }
        //from both end we can do
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for (int j = 2; j <dp.length ; j++) {
            int rob=arr[j]+dp[j-2];
            int dontrob=dp[j-1];
            dp[j]=Math.max(rob,dontrob);
        }
        return dp[arr.length-1];
    }
}
