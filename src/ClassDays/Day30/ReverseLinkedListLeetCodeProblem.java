package ClassDays.Day30;

/*
206. Reverse Linked List

Pointer -> item
        -> reverse    //O(n)

Data -> item
     -> reverse      //O(n^2)

Data reverse by recursion     O(n)
Pointer reverse by recursion  O(n)

 */

public class ReverseLinkedListLeetCodeProblem {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr= head;
        while(curr != null)
        {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        head=prev;
        return head;
    }
}
