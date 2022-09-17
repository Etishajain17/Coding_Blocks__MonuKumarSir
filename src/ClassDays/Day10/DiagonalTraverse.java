package Day10;
/*
m+n-1 diagonals
 */
import java.util.Scanner;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        for (int d = 0; d < m+n-1; d++) {
            int r,c=0;
            if(d<n){
                r=0;
                c=d;
            }else{
                c=n-1;
                r=d-n+1;
            }
            while(r<m && c>=0){
                System.out.print(mat[r][c]+" ");
                r++;
                c--;
            }
        }
        return new int[5];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int[][] arr=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int[] ar=findDiagonalOrder(arr);
        for(int i:ar){
            System.out.print(i+" ");
        }
    }
}
