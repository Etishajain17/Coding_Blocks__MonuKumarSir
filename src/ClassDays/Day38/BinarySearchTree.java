package ClassDays.Day38;


public class BinarySearchTree {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public BinarySearchTree(int[] in){
        this.root=createTree(in,0,in.length-1);
    }
    private Node createTree(int[] in,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        Node nn=new Node();
        nn.val=in[mid];
        nn.left=createTree(in,si,mid-1);
        nn.right=createTree(in,mid+1,ei);
        return nn;
    }

    public void preOrder(){
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);

    }

    public static void main(String[] args) {
        int[] in={10,20,30,40,50,60,70,80,90};
        BinarySearchTree bst=new BinarySearchTree(in);
        bst.inOrder();
        bst.preOrder();
    }
}
