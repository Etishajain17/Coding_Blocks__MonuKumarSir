package ClassDays.Day32;

public class PathSumLeetCodeProblem {
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
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            return hasPath(root,targetSum);
        }
        private boolean hasPath(TreeNode root,int target){
            if(root==null) {
                return false;
            }
            if(root.left==null && root.right==null){
                return root.val-target==0;
            }
            boolean left=hasPath(root.left,target-root.val);
            boolean right=hasPath(root.right,target-root.val);
            return left || right;
        }
    }
}
