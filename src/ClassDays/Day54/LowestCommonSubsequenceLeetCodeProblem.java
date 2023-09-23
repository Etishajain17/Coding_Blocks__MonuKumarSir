package ClassDays.Day54;

//https://leetcode.com/problems/longest-common-subsequence/

import java.util.Arrays;

/*
        abcde , ace
              | match 1+2
        bcde   , ce
        /           \
    cde,ce          bcde,e
        |1+1        /    \0
     de, e       cde,e   bcde,-
     1/   \0    (prob. over.) --> dp and optimization so index maintain in call not doin substring
   e,e   de-


2D -- DP becoz two things varying i.e. i and j
it will be same if we do from back also


size of 2D Dp will be sa length x sb length
fill -1 becoz ans can be zero


lcs --> from start ie. lcsBU
if character same then diagonal plus one from down \^
if character not same then down and right side max
answer at 0,0
---------------------------------------------------
    a           b       c       d       e       - |
 a abcde,ace                                      |
 c                   cde,ce                       |
 e                              de,e    e,e       |
 -  a,-                                           |
---------------------------------------------------


lcs2 --> from back ie. lcsBU2
if character same then diagonal plus one from up  \.
if character not same then up and left side max
answer at sa.length,sb.length
-------------------------------------------------------
                 j=1     j=2     j=3     j=4     j=5  |
        -         a       b       c       d       e   |
    -                                                 |
i=1 a                                                 |
i=2 c                   ab,ac                         |
i=3 e                                      abcde,ace  |
-------------------------------------------------------

 */
public class LowestCommonSubsequenceLeetCodeProblem {
    public static void main(String[] args) {
        String sa="abcde";
        String sb="ace";
        int[][] dp=new int[sa.length()][sb.length()];
        for (int []a:dp){
            Arrays.fill(a,-1);
        }
//        System.out.println(lcsTD(sa,sb,0,0,dp));
//        System.out.println(lcs(sa,sb,0,0));
//        System.out.println(lcs2(sa,sb,sa.length()-1,sb.length()-1));
//        System.out.println(lcsBU2(sa,sb));
        System.out.println(lcsBU(sa,sb));
    }

    //i--> sa , j-->sb
    public static int lcs(String sa,String sb,int i,int j){
        if (i==sa.length() || j==sb.length())
            return 0;
        int ans=0;
        if(sa.charAt(i)==sb.charAt(j)){
            ans=1+lcs(sa,sb,i+1,j+1);
        }else{
            int fs=lcs(sa,sb,i+1,j);
            int ss=lcs(sa,sb,i,j+1);
            ans=Math.max(fs,ss);
        }
        return ans;
    }

    public static int lcs2(String sa,String sb,int i,int j){
        if (i<0 || j<0)
            return 0;
        int ans=0;
        if(sa.charAt(i)==sb.charAt(j)){
            ans=1+lcs2(sa,sb,i-1,j-1);
        }else{
            int fs=lcs2(sa,sb,i-1,j);
            int ss=lcs2(sa,sb,i,j-1);
            ans=Math.max(fs,ss);
        }
        return ans;
    }

    public static int lcsTD(String sa,String sb,int i,int j,int[][] dp){
        if (i==sa.length() || j==sb.length())
            return 0;
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(sa.charAt(i)==sb.charAt(j)){
            ans=1+lcsTD(sa,sb,i+1,j+1,dp);  // dp[i+1][j+1]  dp[i-1][j-1]
        }else{
            int fs=lcsTD(sa,sb,i+1,j,dp);  //dp[i+1][j]      dp[i-1][j]
            int ss=lcsTD(sa,sb,i,j+1,dp);  //dp[i][j+1]      dp[i][j-1]
            ans=Math.max(fs,ss);
        }
        return dp[i][j]=ans;
    }

    public static int lcsBU(String sa,String sb){   //recursion from start table piche se fill
        int[][] dp=new int[sa.length()+1][sb.length()+1];
        for (int i = dp.length-2; i >=0; i--) {
            for (int j = dp[0].length-2; j >=0 ; j--) {
                int ans=0;
                if(sa.charAt(i)==sb.charAt(j)){
                    ans=1+dp[i+1][j+1];
                }else{
                    int fs=dp[i+1][j];
                    int ss=dp[i][j+1];
                    ans=Math.max(fs,ss);
                }
                dp[i][j]=ans;
            }
        }
        return dp[0][0];
    }

    public static int lcsBU2(String sa,String sb){   //recursion from back table aage se fill
        int[][] dp=new int[sa.length()+1][sb.length()+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans=0;
                if(sa.charAt(i-1)==sb.charAt(j-1)){
                    ans=1+dp[i-1][j-1];
                }else{
                    int fs=dp[i-1][j];
                    int ss=dp[i][j-1];
                    ans=Math.max(fs,ss);
                }
                dp[i][j]=ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
