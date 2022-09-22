package Contests.Contest2_BinarySearch_Arrays;

import java.util.*;
/*
Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards i.e. if the
length of a particular board is 5, it will take 5 units of time to paint the board. Compute the minimum amount of
time to paint all the boards.

Note that:

Every painter can paint only contiguous segments of boards.
A board can only be painted by 1 painter at maximum.

Input Format
    First line contains K which is the number of painters. Second line contains N which indicates the number of boards.
    Third line contains N space separated integers representing the length of each board.

Constraints
    1 <= K <= 10
    1 <= N <= 10
    1<= Length of each Board <= 10^8

Output Format
    Output the minimum time required to paint the board.

Sample Input
    2
    2
    1 10

Sample Output
    10
 */

public class PaintersPartitionProblem {
    public static boolean isItPossible(int[] board, int nop, int mid) {
        int painter=1;
        int board_paint=0;
        int i=0;
        while(i<board.length) {
            if(board_paint+board[i]<=mid) {
                board_paint+=board[i];
                i++;
            }
            else {
                painter++;
                board_paint=0;

            }
            if(painter>nop) {
                return false;
            }
        }
        return true;
    }

    public  static int  partitionPainter(int[] board, int nop) {
        int low=0;
        int high=0;
        int ans=0;
        for(int val :board) {
            high+=val;
        }
        while(low<=high) {
            int mid = (low+high)/2;
            if(isItPossible(board,nop,mid)) {
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int nop = sc.nextInt();
        int nob = sc.nextInt();

        int[] board = new int[nob];
        for (int i = 0; i < board.length; i++) {
            board[i] = sc.nextInt();
        }

        System.out.println(partitionPainter(board, nop));
    }
}
