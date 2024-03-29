package Contests.Contest7_BinaryTree;
/*
Given postorder and inorder traversal of a tree. Create the original tree on given information.

Input Format
Enter the size of the postorder array N then add N more elements and store in the array, then enter the size of the inorder array M and add M more elements and store in the array. here M and N are same.

Constraints
None

Output Format
Display the tree using the display function

Sample Input
3
1
3
2
3
1
2
3
Sample Output
1 => 2 <= 3
END => 1 <= END
END => 3 <= END
 */

import java.util.*;
public class CreateTreeUsingPostorderAndInorder {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        CreateTreeUsingPostorderAndInorder m = new CreateTreeUsingPostorderAndInorder();
        int[] post = takeInput();
        int[] in = takeInput();
        BinaryTree bt = m.new BinaryTree(post, in);
        bt.display();
    }

    public static int[] takeInput() {
        int n = scn.nextInt();

        int[] rv = new int[n];
        for (int i = 0; i < rv.length; i++) {
            rv[i] = scn.nextInt();
        }

        return rv;
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree(int[] post, int[] in) {
            this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
        }

        private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {

            // write your code here
            if(ilo>ihi || plo>phi)
                return null;

            Node nn=new Node();
            nn.data=post[phi];
            int idx=search(in,ilo,ihi,nn.data);

            nn.left=construct(post,plo,plo-ilo+idx-1,in,ilo,idx-1);
            nn.right=construct(post,phi-ihi+idx,phi-1,in,idx+1,ihi);
            return nn;

        }

        private int search(int[] in,int si,int ei,int item){
            for(int i=si;i<=ei;i++){
                if(in[i]==item){
                    return i;
                }
            }
            return -1;
        }

        public void display() {
            this.display(this.root);
        }

        private void display(Node node) {
            if (node == null) {
                return;
            }

            String str = "";

            if (node.left != null) {
                str += node.left.data;
            } else {
                str += "END";
            }

            str += " => " + node.data + " <= ";

            if (node.right != null) {
                str += node.right.data;
            } else {
                str += "END";
            }

            System.out.println(str);

            this.display(node.left);
            this.display(node.right);
        }

    }

}

