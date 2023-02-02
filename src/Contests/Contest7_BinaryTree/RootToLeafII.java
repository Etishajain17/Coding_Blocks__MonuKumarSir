package Contests.Contest7_BinaryTree;
/*
Given a binary tree and an integer sum,Print count of root-to-leaf paths that have path's sum equal to given integer sum.

Input Format
The first line contains level order traversal of the tree . In the level order traversal given, -1 represent a null child while any other value represent a node of the tree.
Next line contains a single integer sum.

Constraints
1<=number of nodes in the tree <=10^5

Output Format
Print a single integer equal to number of root to leaf paths with given sum.

Sample Input
1 2 3 -1 -1 -1 -1
3
Sample Output
1
Explanation
There is only 1 root to leaf path with sum 3 (from 1 to 2).
 */

import java.util.*;
public class RootToLeafII {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    static Scanner sc=new Scanner(System.in);
    public RootToLeafII(){
        this.root=createTree();
    }
    private Node createTree(){
        Queue<Node> q=new LinkedList<>();
        Node nn=new Node();
        int val=sc.nextInt();
        nn.val=val;
        q.add(nn);
        while(!q.isEmpty()){
            Node rv=q.remove();
            int chl=sc.nextInt();
            int chr=sc.nextInt();
            if(chl!=-1){
                Node node=new Node();
                node.val=chl;
                rv.left=node;
                q.add(node);
            }
            if(chr!=-1){
                Node node=new Node();
                node.val=chr;
                rv.right=node;
                q.add(node);
            }
        }
        return nn;
    }
    public int totalSum(Node root,int sum){
        if(root==null || sum-root.val<0 )
            return 0;
        if(sum-root.val==0 && root.left==null && root.right==null)
            return 1;
        // if(sum-root.val<0 || (root.left==null && root.right==null))
        //     return 0;
        int ans=0;
        ans+=totalSum(root.left,sum-root.val);
        ans+=totalSum(root.right,sum-root.val);
        return ans;
    }

    public static void main (String args[]) {
        RootToLeafII tree=new RootToLeafII();
        int sum=sc.nextInt();
        System.out.println(tree.totalSum(tree.root,sum));
    }
}