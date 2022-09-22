package Contests.Contest2_BinarySearch_Arrays;

import java.util.*;
/*
Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line
at positions x1,…,xN (0 <= xi <= 1,000,000,000).

His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall.
To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance
between any two of them is as large as possible. What is the largest minimum distance?

Input Format
    First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively. The next line contains N integers containing the indexes of stalls.

Constraints
    2 <= N <= 100,000
    0 <= xi <= 1,000,000,000
    2 <= C <= N

Output Format
    Print one integer: the largest minimum distance.

Sample Input
    5 3
    1 2 8 4 9

Sample Output
    3

Explanation
    Problem Credits - (Spoj)[http://www.spoj.com/problems/AGGRCOW/]
 */
public class AggressiveCows {
    public static boolean isItPossible(int min,int[] stalls,int noc){
        int c=1,i=1;
        int pos=stalls[0];
        while(i<stalls.length){
            if(pos+min<=stalls[i]){
                c++;
                pos=stalls[i];
            }
            i++;
            if(c==noc)
                return true;
        }
        return false;
    }
    public static void Cows(int[] stalls,int nos,int noc){
        int low=1,high=stalls[nos-1],ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isItPossible(mid,stalls,noc)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int nos=sc.nextInt();
        int noc=sc.nextInt();
        int[] stalls=new int[nos];
        for(int i=0;i<nos;i++){
            stalls[i]=sc.nextInt();
        }
        Arrays.sort(stalls);
        Cows(stalls,nos,noc);
    }
}
