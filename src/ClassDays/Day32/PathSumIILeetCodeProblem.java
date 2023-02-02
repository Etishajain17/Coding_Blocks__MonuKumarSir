package ClassDays.Day32;
import java.util.*;
/*
https://leetcode.com/problems/path-sum-ii/description/
 */
public class PathSumIILeetCodeProblem {
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
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<Integer> ls=new ArrayList<>();
            List<List<Integer>> list=new ArrayList<>();
            hasPath(root,targetSum,ls,list);
            return list;
        }
        private void hasPath(TreeNode root,int target,List<Integer> ls,List<List<Integer>> list){
            if(root==null) {
                return ;
            }
            if(root.left==null && root.right==null && root.val-target==0){
                ls.add(root.val);
                list.add(new ArrayList<>(ls));
                ls.remove(ls.size()-1);
                return;
            }
            ls.add(root.val);
            hasPath(root.left,target-root.val,ls,list);
            hasPath(root.right,target-root.val,ls,list);
            ls.remove(ls.size()-1);
        }
    }
}
