package Contests.Contest4_Recursion;

import java.util.Scanner;
/*
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number.
Write a recursive function which returns the first index at which M is found in the array and -1 if M is not found
anywhere. Print the value returned.

Input Format
    Enter a number N and add N more elements to an array, then enter a number M

Constraints
    None

Output Format
    Display the first index at which number M is found

Sample Input
    5
    3
    2
    1
    2
    2
    2

Sample Output
    1
 */
public class FirstIndex {
    public static int firstIndex(int[] arr,int index,int m) {
        if(index==arr.length)
            return -1;
        if(arr[index]==m)
            return index;
        return firstIndex(arr,index+1,m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(firstIndex(arr,0,m));
    }
}
