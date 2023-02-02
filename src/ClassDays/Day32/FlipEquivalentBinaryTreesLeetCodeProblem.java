package ClassDays.Day32;

/*
https://leetcode.com/problems/flip-equivalent-binary-trees/description/
 */
public class FlipEquivalentBinaryTreesLeetCodeProblem {
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
        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            return flip(root1,root2);
        }
        private boolean flip(TreeNode node1,TreeNode node2){
            if(node1==null && node2==null){
                return true;
            }
            if(node1==null || node2==null){
                return false;
            }
            if(node1.val!=node2.val){
                return false;
            }
//            boolean left=flip(node1.left,node2.right) || flip(node1.left,node2.left);
//            boolean right=flip(node1.right,node2.left) || flip(node1.right,node2.right);
//            return left && right;
            boolean flip=flip(node1.left,node2.right) && flip(node1.right,node2.left) ;
            boolean noflip=flip(node1.left,node2.left) && flip(node1.right,node2.right);
            return flip || noflip;
        }
    }
}
