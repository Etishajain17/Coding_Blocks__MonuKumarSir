package ClassDays.Day54;

//product leke bhejde , ek ka le aur dusre ka nhi , dusre ka le aur ek ka nhi --> teeno ka max aans
//lcs modification

public class MaxDotProductofTwoSubsequencesLeetcodeProblem {
    public static void main(String[] args) {
        int[] arra={2,1,-2,5};
        int[] arrb={3,0,-6};
//        System.out.println(product(arra,arrb,0,0,true));
        System.out.println(productDP(arra,arrb));
    }
    public static int product(int[] arra,int[] arrb,int i,int j,boolean flag){
        if (i==arra.length || j==arrb.length){
            if (flag)   //flag for checking from where call has come
                return 0;
            else
                return -10000000;
        }
        int dot=arra[i]*arrb[j]+product(arra,arrb,i+1,j+1,true);
        int fd=product(arra,arrb,i+1,j,false);  //first delete
        int sd=product(arra,arrb,i,j+1,false);  //second delete
        return Math.max(arra[i]*arrb[j],Math.max(fd,Math.max(dot,sd)));
    }
//    public static int productDP(int[] arra,int[] arrb){
//        int[][] dp=new int[arra.length+1][arrb.length+1];
//        for (int i = 1; i <dp.length ; i++) {
//            for (int j = 1; j < dp[0].length; j++) {
//                int dot=arra[i-1]*arrb[j-1]+dp[i-1][j-1];
//                int fd = dp[i-1][j]==0?-10000000:dp[i-1][j];
//                int sd=dp[i][j-1]==0?-10000000:dp[i][j-1];
//                dp[i][j]=Math.max(arra[i-1]*arrb[j-1],Math.max(fd,Math.max(dot,sd)));
//            }
//        }
//        return dp[dp.length-1][dp[0].length-1];
//    }
    public static int productDP(int[] arra,int[] arrb){
        int sp=Integer.MIN_VALUE;
        int[][] dp=new int[arra.length+1][arrb.length+1];
        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int dot=arra[i-1]*arrb[j-1]+dp[i-1][j-1];
                int fd = dp[i-1][j]==0?-10000000:dp[i-1][j];
                int sd=dp[i][j-1]==0?-10000000:dp[i][j-1];
                dp[i][j]=Math.max(arra[i-1]*arrb[j-1],Math.max(fd,Math.max(dot,sd)));
                sp=Math.max(sp,arra[i-1]*arrb[j-1]);
            }
        }
        if (dp[dp.length-1][dp[0].length-1]==0)
            return sp;
        return dp[dp.length-1][dp[0].length-1];
    }
}
