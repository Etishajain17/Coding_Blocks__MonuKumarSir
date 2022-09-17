package ClassDays.Day9;

import java.util.Scanner;

public class SubarrayProductLessThanKLeetCode {
    public static int productLessThanK(int[] arr,int k){
        int c=0,si=0,ei=0,product=1;
        while(ei<arr.length){
            //window grow kro
            product*=arr[ei];
            //window shrink kro
            while(product>=k && si<=ei) {
                product /= arr[si];
                si++;
            }
            //ans calculate kroooo
            c+=ei-si+1;
            ei++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(productLessThanK(arr,k));
    }
}