package ClassDays.Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m= sc.nextInt();
        int[][] arr=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        List<Integer> ls=spiralOrder(arr);
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }
    }
    public static List<Integer> spiralOrder(int[][] arr) {
        int top=0,bottom=arr.length;
        int left=0,right=arr[0].length;
        List<Integer> ls=new ArrayList<Integer>();
        while(left<right && top<bottom)
        {
            for(int i=left;i<right;i++)
                ls.add(arr[top][i]);
            top++;
            for(int i=top;i<bottom;i++)
                ls.add(arr[i][right-1]);
            right--;
            if(left>=right || top>=bottom)
                break;
            for(int i=right-1;i>=left;i--)
                ls.add(arr[bottom-1][i]);
            bottom--;
            for(int i=bottom-1;i>=top;i--)
                ls.add(arr[i][left]);
            left++;
        }
        return ls;
    }
}
