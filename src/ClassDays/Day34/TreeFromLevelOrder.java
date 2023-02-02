package ClassDays.Day34;


import java.util.*;

public class TreeFromLevelOrder {
        public class Node{
            int val;
            Node left;
            Node right;
        }
        private Node root;
        Scanner sc=new Scanner(System.in);
        public TreeFromLevelOrder(){
            this.root=createTree();
        }
        private Node createTree(){
            Queue<Node> q=new LinkedList<>();
            Node nn=new Node();
            int val=sc.nextInt();
            nn.val=val;
            q.add(nn);
            while(!q.isEmpty()){
                Node rv=q.remove();
                int c1=sc.nextInt();
                int c2=sc.nextInt();
                if(c1!=-1){
                    Node node=new Node();
                    node.val=c1;
                    rv.left=node;
                    q.add(node);
                }
                if(c2!=-1){
                    Node node=new Node();
                    node.val=c2;
                    rv.right=node;
                    q.add(node);
                }
            }
            return nn;
        }

        public void preOrder(){
            preOrder(this.root);
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

    public static void main(String[] args) {
        TreeFromLevelOrder cl=new TreeFromLevelOrder();
        System.out.println("PreeOrder");
        cl.preOrder();
    }
}
