package Contests.Contest7_BinaryTree;
/*
Given a binary tree , Check if its mirror image is equal to the tree itself.

Input Format
The first line of the input contains level order traversal of the tree as space separated integers . In the level order traversal , -1 represent a null child while any other value represent a node of the tree.

Constraints
1<=number of nodes in the tree <=10^5

Output Format
Print "YES" without quotes if the mirror image of the tree is equal to the tree itself , else print "NO" without quotes.

Sample Input
1 2 2 -1 -1 -1 -1
Sample Output
YES
Explanation
The mirror image of given tree is equal to the tree itself.
 */

import java.util.*;
public class MirrorTree {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public MirrorTree(){
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
    private boolean isMirror(Node left,Node right){
        if(left==null || right==null)
            return left==null && right==null;
        return left.val==right.val && isMirror(left.left,right.right) &&
                isMirror(left.right,right.left);
    }

    public static void main (String args[]) {
        MirrorTree tree=new MirrorTree();
        if(tree.isMirror(tree.root.left,tree.root.right))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}