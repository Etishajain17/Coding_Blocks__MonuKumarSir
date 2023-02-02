package Contests.Contest7_BinaryTree;
/*
Given a binary tree , print its max path sum.
For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

Input Format
Single line input containing space separated integers denoting the preorder input of the tree. NULL indicates that the node does not exist.

Constraints
1 <= No of nodes <= 10^5

Output Format
Print a single integer denoting the max path sum for the given tree.

Sample Input
8 3 4 1 2 NULL NULL NULL 9 7 NULL NULL NULL 10 NULL 5 NULL NULL NULL
Sample Output
38
Explanation
The tree looks like

                  8
               /
             3
           /     \
         4       10
       /    \       \
     1       9       5
   /         /
  2         7
The max path sum is given by : 7 + 9 + 4 + 3 + 10 + 5 = 38
 */

import java.util.*;
public class MaxPathSum {
    private int ans=Integer.MIN_VALUE;
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public MaxPathSum(){
        this.root=createTree();
    }
    private Node createTree(){
        return preOrderCreate();
    }
    private Node preOrderCreate(){
        String item=sc.next();
        Node nn=new Node();
        if(!item.equals("NULL")) {
            nn.val = Integer.parseInt(item);
            nn.left = preOrderCreate();
            nn.right = preOrderCreate();
        }
        return nn;
    }
    public int maxPath(Node root){

        if(root==null) {
            return 0;
        }
        int left=Math.max(maxPath(root.left),0);
        int right=Math.max(maxPath(root.right),0);
        ans=Math.max(ans, left + right + root.val);
        return Math.max(left+root.val,right+root.val);
    }
    public static void main (String args[]) {
        MaxPathSum tree=new MaxPathSum();
        tree.maxPath(tree.root);
        System.out.println(tree.ans);
    }
}
