package ClassDays.Day32;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.display();
        bt.preOrder();
        bt.postOrder();
        bt.inOrder();
        System.out.println(bt.search(-50));
        System.out.println(bt.max());
        System.out.println(bt.ht());
    }
}
//// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false

// pre order      --> RoLR
// post order     --> LRRo
// in order       --> LRoR
// level order