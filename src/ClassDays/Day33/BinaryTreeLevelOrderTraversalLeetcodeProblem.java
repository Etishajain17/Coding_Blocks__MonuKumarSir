package ClassDays.Day33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.*;

public class BinaryTreeLevelOrderTraversalLeetcodeProblem {
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
  class Solution{
      public List<List<Integer>> levelOrder(TreeNode root) {
          Queue<TreeNode> q=new LinkedList<>();
          Queue<TreeNode> q1=new LinkedList<>();
          List<List<Integer>> ans=new ArrayList<>();
          List<Integer> ll=new ArrayList<>();
          q.add(root);
          while(!q.isEmpty()){
              TreeNode rv=q.remove();
              ll.add(rv.val);
              if(rv.left!=null){
                  q1.add(rv.left);
              }
              if(rv.right!=null){
                  q1.add(rv.right);
              }
              if(q.isEmpty()){
                  ans.add(ll);
                  ll=new ArrayList<>();
                  q=q1;
                  q1=new LinkedList<>();
              }
          }
          return ans;
      }
    }
}
