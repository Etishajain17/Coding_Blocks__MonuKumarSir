package Contests.Contest7_BinaryTree;
/*
Given a Binary tree check if it is balanced i.e. depth of the left and right sub-trees of every node differ by 1 or less.

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL

Constraints
1 <= No of nodes <= 10^5

Output Format
Display the Boolean result

Sample Input
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
Sample Output
true
Explanation
The tree looks like

             10
          /       \
       20           30
    /     \       /     \
   40      50    60      73
The given tree is clearly balanced as depths of the left and right sub-trees of every node differ by 1 or less.
 */
import java.util.*;
public class IsBalanced {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        IsBalanced m = new IsBalanced();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.isBalanced());
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

        public boolean isBalanced() {
            return this.isBalanced(this.root).isBalanced;
        }

        private BalancedPair isBalanced(Node node) {
            // write your code here
            if(node==null){
                BalancedPair bp=new BalancedPair();
                bp.isBalanced=true;
                return bp;
            }
            BalancedPair lbp=isBalanced(node.left);
            BalancedPair rbp=isBalanced(node.right);
            BalancedPair sbp=new BalancedPair();
            sbp.height=Math.max(lbp.height,rbp.height)+1;
            sbp.isBalanced=lbp.isBalanced && rbp.isBalanced &&
                    Math.abs(lbp.height-rbp.height)<=1;

            return sbp;
        }

        private class BalancedPair {
            int height;
            boolean isBalanced;
        }

    }
}

