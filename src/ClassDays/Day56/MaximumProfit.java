package ClassDays.Day56;

//SPOJ --> TRT Treats for the Cows


//2 3 5 1 4

//greedy not pssible becoz ans comin 49
//but ans comin 50
//so we need to explore every possibility and it depends on what next is opening i.e. future dp

//first sell ans + [3,5,1,4] and last sell ans + [2,3,5,1] and max
//but we dont need to keep yr becoz as length kmm yr increasing so two dimension dp not three

//---------------------
//  2   3   5  1  4   |
//2 10 23  43  45 50  |
//3    15  37  40 48  |
//5        25  29 41  |
//1            5  24  |
//4               20  |
//---------------------

//base case i>j so diagonal se neeche wali nhi fill krni
//fill diagonally --> future dp
//        0,1
//     /       \
//2*4 + 1,1  2*4 + 1,1 dono ka max
//left and down ka max

// i,j
//arr[i]*i+dp[i+1][j]
//arr[j]*j+dp[i][j-1]
//j-i==diagonal

public class MaximumProfit {
    public static void main(String[] args) {
        int[] wines={2,3,5,1,4};
        System.out.println(maxProfit(wines,0,wines.length-1,1));
    }
    public static int maxProfit(int[] wine,int i,int j,int yr){
        if(i>j){
            return 0;
        }
        int first=wine[i]*yr+maxProfit(wine,i+1,j,yr+1);
        int last=wine[j]*yr+maxProfit(wine,i,j-1,yr+1);
        return Math.max(first,last);
    }
    public static int maxProfitBU(int[] wines){
        int[][] dp=new int[wines.length][wines.length];
        for(int i=0;i<wines.length;i++){
            dp[i][i]=wines[i]*wines.length;
        }
        int yr=wines.length-1;
        for (int dia=1;dia<wines.length;dia++){
            for (int j = dia; j < wines.length; j++) {
                int i=j-dia;
                int first=wines[i]*yr + dp[i+1][j];
                int last=wines[j]*yr +dp[i][j-1];
                dp[i][j]=Math.max(first,last);
            }
            yr--;
        }
        return dp[0][dp.length-1];
    }
}
