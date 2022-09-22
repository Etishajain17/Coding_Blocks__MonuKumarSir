package Contests.Contest2_BinarySearch_Arrays;

import java.util.Scanner;
/*
Given an array having n elements representing balls of various colours like red, white or blue, sort them
in-place so that balls of the same colour are adjacent, with the colours in the order red, white and blue.
To represent the colour red, white, and blue we will use the integers 0, 1, and 2 respectively.
Note:You are not suppose to use the sort function for this problem.

Input Format
    First line contains integer n as size of array. Next n lines contains a single integer as element of array.


Output Format
    Print the balls in order so that balls of same colour are adjacent.

Sample Input
    6
    2 0 2 1 1 0

Sample Output
    0 0 1 1 2 2
 */
public class SortingInLinearTime {
    public static void swap(int x,int y,int[] arr){
        int t=arr[x];
        arr[x]=arr[y];
        arr[y]=t;

    }
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0,mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(low,mid,arr);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(mid,high,arr);
                high--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
