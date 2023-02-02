package Contests.Contest7_BinaryTree;
/*
Given a binary tree. Print the zig zag order i.e print level 1 from left to right, level 2 from right to left and so on. This means odd levels should get printed from left to right and even levels should be printed from right to left.

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL

Constraints
None

Output Format
Display the values in zigzag level order in which each value is separated by a space

Sample Input
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
Sample Output
10 30 20 40 50 60 73
 */
import java.util.*;
public class LevelOrderZigzag {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        LevelOrderZigzag m = new LevelOrderZigzag();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderZZ();
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

        public void levelOrderZZ() {

            // write your code here
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            int f=1;
            while(!q.isEmpty())
            {
                int x = 0;
                List<Integer> inner = new ArrayList<>();
                int n = q.size();
                while(x<n)
                {
                    Node temp = q.peek();
                    inner.add(temp.data);
                    q.remove();
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                    x++;
                }
                if(f==0){
                    Collections.reverse(inner);
                    f=1;
                }
                else{
                    f=0;
                }
                for(int i:inner){
                    System.out.print(i+" ");
                }
            }
        }

    }

}

