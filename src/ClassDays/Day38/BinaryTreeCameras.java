package ClassDays.Day38;

public class BinaryTreeCameras {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution{
//        1-> covered , 2-> fit, -1-> req
        int count=0;
        public int minCameraCover(TreeNode root) {
            countCamera(root);
            return count;
        }
        public int countCamera(TreeNode root){
            if(root==null){
                return 1;
            }
            int left=countCamera(root.left);
            int right=countCamera(root.right);
            if(left==-1 || right==-1) {
                count++;
                return 2;
            }
            if(left==1 && right==1){
                return -1;
            }
            if((left==2 && right==1 )|| (left==1 && right==2)){
                return 1;
            }
            return 0;
        }
    }
}
