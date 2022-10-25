package Contests.Contest4_Recursion;

import java.util.Scanner;

/*
You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from a position
towards left, right, up or down on the grid.Initially rat is on the position (1,1). It wants to reach position (N,M)
where it's cheese is waiting for. There exits a unique path in the grid . Find that path and help the rat reach its cheese.

Input Format
    First line contains 2 integers N and M denoting the rows and columns in the grid.
    Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O'
    denotes that the cell is empty.

Constraints
    1 <= N , M <= 10

Output Format
    Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
    If a path does not exits then print "NO PATH FOUND"

Sample Input
    5 4
    OXOO
    OOOX
    XOXO
    XOOX
    XXOO

Sample Output
    1 0 0 0
    1 1 0 0
    0 1 0 0
    0 1 1 0
    0 0 1 1
 */
public class RatChasesItsCheese {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] maze=new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String str=sc.next();
            for (int j = 0; j < str.length(); j++) {
                maze[i][j]=str.charAt(j);
            }
        }
        int[][] ans=new int[n][m];
        int[] c={0,0,1,-1};  //for loop
        int[] r={1,-1,0,0}; //for  loop
        boolean possible=HasPath(maze,0,0,ans,c,r);
        if(possible==false)
            System.out.println("NO PATH FOUND");
    }
    public static boolean HasPath(char[][] maze,int cc,int cr,int[][] ans,int[] c,int[] r) {
        if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]!='X') {
            ans[cr][cc]=1;
            Display(ans);
            return true;
        }
        if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X'){
            return false;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        boolean possible=false;
        for (int i = 0; i < c.length; i++) {
            possible = possible || HasPath(maze,cc+c[i],cr+r[i],ans,c,r);
        }
//        possible = possible || HasPath(maze,cc,cr-1,ans);  //up
//        possible = possible || HasPath(maze,cc,cr+1,ans);  //down
//        possible = possible || HasPath(maze,cc-1,cr,ans);  //left
//        possible = possible || HasPath(maze,cc+1,cr,ans);  //right
        maze[cr][cc]='O';
        ans[cr][cc]=0;
        return possible;
    }
    public static void Display(int[][] ans){
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
