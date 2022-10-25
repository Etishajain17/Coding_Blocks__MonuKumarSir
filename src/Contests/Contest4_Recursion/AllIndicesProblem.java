package Contests.Contest4_Recursion;

import java.util.Scanner;
/*
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number.
Write a recursive function which returns an array containing indices of all items in the array which have value
equal to M. Print all the values in the returned array.

Input Format
    Enter a number N(size of the array) and add N more numbers to the array Enter number M to be searched in the array

Constraints
    1 <= Size of array <= 10^5

Output Format
    Display all the indices at which number M is found in a space separated manner

Sample Input
    5
    3
    2
    1
    2
    3
    2

Sample Output
    1 3

Explanation
    2 is found at indices 1 and 3.
 */
public class AllIndicesProblem {
    public static void allIndices(int[] arr,int index,int m) {
        if(index==arr.length)
            return;
        if(arr[index]==m) {
            System.out.print(index+" ");
        }
        allIndices(arr,index+1,m);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        allIndices(arr,0,m);
    }
}
