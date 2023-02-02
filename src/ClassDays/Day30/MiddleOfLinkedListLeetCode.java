package ClassDays.Day30;

/*
876. Middle of the Linked List
 */
public class MiddleOfLinkedListLeetCode {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){                   //fast.next.next not null if first one in even case
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
