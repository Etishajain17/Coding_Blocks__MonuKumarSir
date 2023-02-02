package Contests.Contest7_BinaryTree;
/*
Find LCA(Lowest Common Ancestor) of two elements in a Binary Tree.

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL next two line contains 2 element of BT

Constraints
None

Output Format
Display the LCA value.

Sample Input
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
50
60
Sample Output
10
 */

import java.util.*;
public class LowestCommonAncestor {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    private TreeNode root;
    static Scanner sc=new Scanner(System.in);
    public LowestCommonAncestor(){
        this.root=createTree();
    }
    private TreeNode createTree(){
        int item=sc.nextInt();
        TreeNode nn=new TreeNode();
        nn.val=item;

        boolean hlc=sc.nextBoolean();        //has left child
        if(hlc) {
            nn.left = createTree();
        }

        boolean hrc=sc.nextBoolean();        //has right child
        if(hrc){
            nn.right=createTree();
        }
        return nn;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if(root==null){
            return root;
        }
        if(root.val==p || root.val==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        else if(left!=null){
            return left;
        }
        else{
            return right;
        }
    }
    public static void main(String args[]) {
        LowestCommonAncestor tree=new LowestCommonAncestor();
        System.out.println(tree.lowestCommonAncestor(tree.root,sc.nextInt(),sc.nextInt()).val);
    }
}
