package ClassDays.Day54;

//https://leetcode.com/problems/uncrossed-lines/
//lcs in array instead of string

public class UncrossedLinesLeetcodeProblem {
    public static void main(String[] args) {
        int[] arra={1,4,2};
        int[] arrb={1,2,4};
        System.out.println(lines(arra,arrb));
    }
    public static int lines(int[] arra,int[] arrb){
        int[][] dp=new int[arra.length+1][arrb.length+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans=0;
                if(arra[i-1]==arrb[j-1]){
                    ans=1+dp[i-1][j-1];
                }else{
                    ans=Math.max(dp[i-1][j],dp[i][j-1]);
                }
                dp[i][j]=ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
