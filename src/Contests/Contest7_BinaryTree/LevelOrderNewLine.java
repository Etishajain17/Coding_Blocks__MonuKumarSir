package Contests.Contest7_BinaryTree;
/*
Given a binary tree. Print the level order traversal, make sure each level start at a new line.

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL

Constraints
None

Output Format
Print the level order in which the different levels are in different lines, all the values should be in a space separated manner

Sample Input
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
Sample Output
10
20 30
40 50 60 73
 */

import java.util.*;
public class LevelOrderNewLine {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        LevelOrderNewLine m = new LevelOrderNewLine();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderNewLine();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public void levelOrderNewLine() {

            // write your code here
            Queue<Node> q=new LinkedList<>();
            Queue<Node> q1=new LinkedList<>();
            q.add(root);
            System.out.println(root.data);
            while(!q.isEmpty()){

                Node rv=q.remove();
                if(rv.left!=null){
                    q1.add(rv.left);
                }
                if(rv.right!=null){
                    q1.add(rv.right);
                }
                if(q.isEmpty()){
                    q=q1;
                    q1=new LinkedList<>();
                    for(Node i:q){
                        System.out.print(i.data+" ");
                    }
                    System.out.println();
                }
            }
        }

    }

}
