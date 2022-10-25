package Contests.Contest4_Recursion;

import java.util.Scanner;
/*
Take as input N, the size of array. Take N more inputs and store that in an array.
Take as input M, a number. Write a recursive function which returns the last index at which M is
found in the array and -1 if M is not found anywhere. Print the value returned.

Input Format
    Enter a number N and add N more numbers to an array, then enter number M to be searched

Constraints
    None

Output Format
    Display the last index at which the number M is found

Sample Input
    5
    3
    2
    1
    2
    3
    2

Sample Output
    3
 */
public class LastIndex {
    public static int lastIndex(int[] arr,int index,int m) {
        if(index==-1 || arr[index]==m)
            return index;
        return lastIndex(arr,index-1,m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(lastIndex(arr,arr.length-1,m));
    }
}
