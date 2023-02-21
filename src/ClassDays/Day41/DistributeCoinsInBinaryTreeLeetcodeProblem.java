package ClassDays.Day41;

public class DistributeCoinsInBinaryTreeLeetcodeProblem {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        int move = 0;

        public int distributeCoins(TreeNode root) {
            distribute(root);
            return move;
        }

        public int distribute(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = distribute(root.left);
            int right = distribute(root.right);
            move += Math.abs(left) + Math.abs(right);
            return left + right + root.val - 1;
        }
    }
}
