package Contests.Contest7_BinaryTree;
/*
Given a Binary Tree Print all the leaf nodes.

Input Format
Level order input of the binary tree

Constraints
Total no of nodes <1000

Output Format
All leaf nodes from left to right in single line

Sample Input
1
2 3
4 5
6 7
-1 -1
-1 -1
-1 -1
-1 -1
Sample Output
4 5 6 7
 */
import java.util.*;
public class PrintAllLeafNodes {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);
    public PrintAllLeafNodes(){
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
    public void printleafNodes(Node root){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            System.out.print(root.val+" ");
            return;
        }
        printleafNodes(root.left);
        printleafNodes(root.right);
    }
    public static void main(String args[]) {
        PrintAllLeafNodes tree=new PrintAllLeafNodes();
        tree.printleafNodes(tree.root);
    }
}
