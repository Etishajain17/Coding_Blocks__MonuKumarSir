package Contests.Contest2;

import java.util.*;
/*
You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence. You need to find the
sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from
one array to another array only at common elements.

Input Format
    First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.

Constraints
    1<=t<=100 1<=n,m<=100000

Output Format
    Print the maximum path.

Sample Input
    1
    8 8
    2 3 7 10 12 15 30 34
    1 5 7 8 10 15 16 19

Sample Output
    122

Explanation
    122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34
 */
public class MaximumSumPathInTwoArrays {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int[] arr1=new int[n1];
            int[] arr2=new int[n2];
            for(int i=0;i<n1;i++)
                arr1[i]=sc.nextInt();
            for(int i=0;i<n2;i++)
                arr2[i]=sc.nextInt();
            int total=0;
            int sum1=0,sum2=0,i=0,j=0;
            while(i<n1 && j<n2){
                if(arr1[i]<arr2[j])
                    sum1+=arr1[i++];
                else if(arr1[i]>arr2[j])
                    sum2+=arr2[j++];
                else{
                    total+=Math.max(sum1,sum2)+arr1[i];
                    sum1=0;
                    sum2=0;
                    i++;
                    j++;
                }
            }
            while(i<n1)
                sum1+=arr1[i++];
            while(j<n2)
                sum2+=arr2[j++];
            total+=Math.max(sum1,sum2);
            System.out.println(total);
        }
    }
}
