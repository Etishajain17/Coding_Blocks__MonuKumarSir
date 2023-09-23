package ClassDays.Day54;

/*
DP
-User respective which we did in recursion
-Coin respective which we are doing now

11111,1112,122,5

               [1,2,5]
          pick/       \no pick
          4 [1,2,5]    5[2,5]
          /         \
        3[1,2,5]     4[2,5]
        /       \       \
   2[1,2,5]      3[2,5]
    /      \       /  \
1[1,2,5]  2[2,5]  0    0
 /    \    /  \
0   1[2,5] 0 2[5]
       \       \
      1[5]     X
       \
       X

2D DP --> coin and amount both change

amount==0  return 1;
coin==0  return 0
recursion piche and table aage se fill
if coin discard nhi hua --> cell up and cell left utna piche jiska coin --> dono ka sum
jitna coin utna kam piche jaate h
------------------------
    0  1  2  3  4  5  amount
0   1  0  0  0  0  0
1   1
2   1
5   1            coin=[1,2,5],amount=5(last cell)
coin
-------------------------


 */
public class CoinChangeIILeetcodeProblem {
    public static void main(String[] args) {
        int[] coin={1,3,4};
        int amount=4;
//        System.out.println(coinChange(coin,amount,0));
        System.out.println(coinChangeBU(coin,amount));
    }
    public static int coinChange(int[] coin,int amount,int idx){
        if (amount==0){
            return 1;
        }
        if (idx==coin.length){
            return 0;
        }
        int inc=0;
        int exc=0;
        if(coin[idx]<=amount){
            inc=coinChange(coin,amount-coin[idx],idx); //dp[amount-coin[idx]][idx]
        }
        exc=coinChange(coin,amount,idx+1); //dp[amount][idx-1]
        return inc+exc;
    }
    public static int coinChangeBU(int[] coin,int amount){
        int[][] dp=new int[coin.length+1][amount+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int am = 1; am < dp[0].length; am++) {
                int inc=0;
                int exc=0;
                if(coin[i-1]<=am){
                    inc=dp[i][am-coin[i-1]];
                }
                exc=dp[i-1][am];
                dp[i][am]=inc+exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
