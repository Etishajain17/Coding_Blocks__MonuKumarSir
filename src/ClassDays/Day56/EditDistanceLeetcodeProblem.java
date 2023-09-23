package ClassDays.Day56;

//https://leetcode.com/problems/edit-distance/

//            (Food,monkey)
//      /          |          \
//  Insert      Delete        Replace
// (food,onkey) (ood,monkey) (ood,onkey)
//
//        (food,monday)
//    /        |        \
// i,j+1      i+1,j     i+1,j+1
// if same then i+1,j+1 count as it is

//         (FO)
//    -  F  O  O  D
//-   0  1  2  3  4
//M   1  1  2  3  4
//O   2  2  1  2  3
//N   3  3  2  2  3
//E   4  4  3  3  3
//Y   5  5  4  4  4

//    M,F
///    |    \
//M,-  -,F  -,-
//Left  Up   Diagonal

//so if not same then left(i-1,j) , up(i,j-1) , diagonal(i-1,j-1) ka min plus one
//so if same then just put diagonal value(i-1,j-1)

public class EditDistanceLeetcodeProblem {
    public static void main(String[] args) {
        String sa="FOOD";
        String sb="MONKEY";
        System.out.println(minOps(sa,sb,0,0));
    }
    public static int minOps(String sa,String sb,int i,int j){
        if(i==sa.length()){
            return sb.length()-j;
        }
        if (j==sb.length()){
            return sa.length()-i;
        }
        int ans=0;
        if(sa.charAt(i)==sb.charAt(j)){
            ans=minOps(sa,sb,i+1,j+1);
        }else{
            int I=minOps(sa,sb,i,j+1);
            int D=minOps(sa,sb,i+1,j);
            int R=minOps(sa,sb,i+1,j+1);
            ans=Math.min(I,Math.min(D,R))+1;
        }
        return ans;
    }

    public static int minOpsTD(String sa,String sb,int i,int j,int[][] dp){
        if(i==sa.length()){
            return sb.length()-j;
        }
        if(j==sb.length()){
            return sa.length()-i;
        }
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans=0;
        if(sa.charAt(i)==sb.charAt(j)){
            ans=minOpsTD(sa,sb,i+1,j+1,dp);
        }
        else{
            int IN=minOpsTD(sa,sb,i,j+1,dp);
            int DE=minOpsTD(sa,sb,i+1,j,dp);
            int RE=minOpsTD(sa,sb,i+1,j+1,dp);
            ans=Math.min(IN,Math.min(DE,RE))+1;
        }
        return dp[i][j]=ans;
    }

}
