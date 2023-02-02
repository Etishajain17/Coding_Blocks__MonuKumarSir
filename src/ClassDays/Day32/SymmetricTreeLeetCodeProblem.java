package ClassDays.Day32;

public class SymmetricTreeLeetCodeProblem {
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
        public boolean isSymmetric(TreeNode root) {
            return symmetric(root,root);
        }
        private boolean symmetric(TreeNode node1,TreeNode node2){
            if(node1==null && node2==null){
                return true;
            }
            if(node1==null || node2==null){
                return false;
            }
            if(node1.val!= node2.val){                //no need to check if structure check
                return false;
            }
            boolean left=symmetric(node1.left,node2.right);    //left with left and same as if exactly same and structure also
            boolean right=symmetric(node1.right,node2.left);
            return left && right;
        }
    }
}
