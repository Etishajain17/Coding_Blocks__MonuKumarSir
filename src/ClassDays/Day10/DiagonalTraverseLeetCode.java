package Day10;

//package Day10;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class DiagonalTraverseLeetCode {
//    public static int[] findDiagonal(int[][] mat)
//    {
//        int m=mat.length;
//        int n=mat[0].length;
//
//        for (int d = 0; d < m+n-1; d++) {
//            int r, c = 0;
//            if (d < n) {
//                r = 0;
//                c = d;
//            } else {
//                c = n - 1;
//                r = d - n + 1;
//            }
//            ArrayList<Integer> list=new ArrayList<>();
//            while (r < m && c >= 0) {
//                list.add(mat[r][c]);
//                r++;
//                c--;
//            }
//            if(d%2==0){
//                for (int i = list.size()-1; i >=0 ; i++) {
//                    ans[k]
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt(),n=sc.nextInt();
//        int[][] arr=new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        int[] ar=findDiagonal(arr);
//        for(int i:ar){
//            System.out.print(i+" ");
//        }
//    }
//}
class abc{
    public static void main(String[] args) {
        System.out.println("hlo");
    }
}