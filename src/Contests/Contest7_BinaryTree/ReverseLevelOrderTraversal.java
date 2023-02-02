package Contests.Contest7_BinaryTree;
/*
Given a binary tree, print it's nodes level by level in reverse order, i.e., print all nodes present at the last level first, followed by nodes of the second last level and so on. Print nodes at any level from left to right.

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL

Constraints
The number of nodes in the tree is in the range [1, 1000]
0 <= root->data <= 1000

Output Format
Reverse level order print of the node values.

Sample Input
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
Sample Output
40 50 60 73 20 30 10
Explanation
Last level should be printed first, then second last , then third last and so on.
 */
import java.util.*;
public class ReverseLevelOrderTraversal {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    private TreeNode root;
    static Scanner sc=new Scanner(System.in);
    public ReverseLevelOrderTraversal(){
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
    public void orderreverse() {
        TreeNode node=root;
        Queue<TreeNode> q=new LinkedList<>();
        Queue<TreeNode> q1=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s1=new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode rv=q.remove();
            s1.push(rv.val);
            if(rv.left!=null){
                q1.add(rv.left);
            }
            if(rv.right!=null){
                q1.add(rv.right);
            }
            if(q.isEmpty()){
                while(!s1.isEmpty()){
                    s.push(s1.pop());
                }
                q=q1;
                q1=new LinkedList<>();
                s1=new Stack<>();
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void main (String args[]) {
        ReverseLevelOrderTraversal tree=new ReverseLevelOrderTraversal();
        tree.orderreverse();
    }
}