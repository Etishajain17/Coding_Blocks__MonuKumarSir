package Contests.Contest7_BinaryTree;
/*
Given a binary tree and a number k, print out all root to leaf paths where the sum of all nodes value is same as the given number.

Input Format
First line contains the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL. Second line contains the number k.

Constraints
None

Output Format
Display the root to leaf path whose sum is equal to k.

Sample Input
10 true 20 true 30 false false true 50 false false true 40 true 60 false false true 73 false false
60
Sample Output
10 20 30
Explanation
The given tree is in pre order traversal. So convert it into binary tree and check root to leaf path sum.
 */


import java.util.*;
public class RootToLeaf {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    private TreeNode root;
    static Scanner sc=new Scanner(System.in);
    public RootToLeaf(){
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
    boolean ans=false;
    private void hasPath(TreeNode root,int target,List<Integer> ls){
        if(root==null) {
            ans=false;
            return;
        }
        if(root.left==null && root.right==null){
            if(root.val-target==0){
                ans=true;
                ls.add(root.val);
            }
            return;
        }
        if(ans==false){
            ls.add(root.val);
            hasPath(root.left,target-root.val,ls);
            hasPath(root.right,target-root.val,ls);
            if(ans==false)
                ls.remove(ls.size()-1);
        }
    }
    public static void main(String args[]) {
        RootToLeaf tree=new RootToLeaf();
        List<Integer> ls=new ArrayList<>();
        int target=sc.nextInt();
        tree.hasPath(tree.root,target,ls);
        for(int x:ls){
            System.out.print(x+" ");
        }
    }
}