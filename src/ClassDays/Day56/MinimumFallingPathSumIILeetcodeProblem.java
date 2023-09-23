package ClassDays.Day56;

//https://leetcode.com/problems/minimum-falling-path-sum-ii/
public class MinimumFallingPathSumIILeetcodeProblem {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < arr[0].length; i++) {
            ans=Math.min(ans,minFallingPathSum(arr,0,i));
        }
        System.out.println(ans);
    }
    public static int minFallingPathSum(int[][] arr,int i,int j) {
        if(i==arr.length-1)
            return arr[i][j];

        int ans=Integer.MAX_VALUE;
        for (int col = 0; col < arr[0].length; i++) {
            if(col!=j){
                ans=Math.min(ans,minFallingPathSum(arr,i+1,col));
            }
        }
        return ans+arr[i][j];
    }
}
