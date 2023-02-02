package ClassDays.Day34;

public class ConstructBinaryTreefromPreorderandInorderTraversalLeetCodeProblem {
    //Inorder --> Left Root Right
    //Preorder --> Root Left Right
    //Root from Preorder
    //left and right decide from inorder
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
//    class Solution {
//        public TreeNode buildTree(int[] preorder, int[] inorder) {
//
//        }
//    }
}
