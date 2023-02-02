package ClassDays.Day29;

public class LinkedList_Client {
    public static void main(String[] args) throws Exception{
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.display();
        ll.addLast(5);
        ll.display();
        ll.addAtIndex(6,2);
        ll.display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getAtIndex(1));
        System.out.println(ll.removeFirst());
        ll.display();
        System.out.println(ll.removeLast());
        ll.display();
        System.out.println(ll.removeAtIndex(1));
        ll.display();
    }
}
