package Contests.Contest2;

import java.util.*;
/*
You are given number of pages in n different books and m students. The books are arranged in ascending order of number
of pages. Every student is assigned to read some consecutive books. The task is to assign books in such a way that the
maximum number of pages assigned to a student is minimum.

Input Format
    First line contains integer t as number of test cases. Next t lines contains two lines. For each test case,
    1st line contains two integers n and m which represents the number of books and students and 2nd line contains n
    space separated integers which represents the number of pages of n books in ascending order.

Constraints
    1 < t < 50
    1< n < 100
    1< m <= 50
    1 <= Ai <= 1000

Output Format
    Print the maximum number of pages that can be assigned to students.

Sample Input
    1
    4 2
    12 34 67 90

Sample Output
    113

Explanation
    1st students : 12 , 34, 67 (total = 113)
    2nd students : 90 (total = 90)
    Print max(113, 90)
 */
public class BookAllocationProblem {
    public static boolean isItPossible(int nos,int mid,int[] arr){
        int i=0,s=0,n=1;
        while(i<arr.length){
            if(s+arr[i]<=mid){
                s+=arr[i];
                i++;
            }
            else{
                n++;
                s=0;
            }
            if(nos<n)
                return false;
        }
        return true;
    }
    public static void Max_books(int nos,int[] arr,int nop){
        int low=0,high=nop,ans=0;
        while(low<=high){
            int mid=(high+low)/2;
            if(isItPossible(nos,mid,arr)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int nob=sc.nextInt();
            int nos=sc.nextInt();
            int s=0;
            int[] arr=new int[nob];
            for(int i=0;i<nob;i++){
                arr[i]=sc.nextInt();
                s+=arr[i];
            }
            Max_books(nos,arr,s);
        }
    }
}
