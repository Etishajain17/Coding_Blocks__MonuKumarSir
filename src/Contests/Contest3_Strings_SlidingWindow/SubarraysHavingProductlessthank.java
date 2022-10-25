package Contests.Contest3_Strings_SlidingWindow;

/*
Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having a product
less than a given number k.

Input Format
    First line contains Integer where N is the Size of Array
    Second line contains Integer k
    Next N Line Contains an Integer which denotes element of array

Constraints
    1<=n<=10^5
    1<=k<=10^15
    1<=a[i]<=10^5

Output Format
    Print number of possible contiguous subarrays having product less than a given number k.

Sample Input
    4
    10
    1
    2
    3
    4

Sample Output
    7

Explanation
    The contiguous subarrays are {1}, {2}, {3}, {4} {1, 2}, {1, 2, 3} and {2, 3} whose count is 7.

 */
import java.util.Scanner;

public class SubarraysHavingProductlessthank {
    public static int subarraysWithProductLessThanK(int[] arr,int k){
        int si=0,ei=0,ans=0;
        int product=1;
        while(ei<arr.length){
            product*=arr[ei];
            while(product>=k && si<=ei){
                product/=arr[si];
                si++;
            }
            ans+=ei-si+1;
            ei++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(subarraysWithProductLessThanK(arr,k));
    }
}
