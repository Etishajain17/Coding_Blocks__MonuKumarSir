package ClassDays.Day30;

import java.util.Stack;

/*
25. Reverse Nodes in k-Group

Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a
multiple of k then left-out nodes, in the end, should remain as it is.
You may not alter the values in the list's nodes, only nodes themselves may be changed.

Using Stack or recursion
 */
public class ReverseNodesInKGroup {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            Stack<ListNode> st=new Stack<>();
            ListNode Dummy=new ListNode();
            ListNode temp=Dummy;
            ListNode start=null;
            while (head!=null){
                if(st.size()==0){
                    start=head;
                }
                st.push(head);
                if(st.size() == k){
                    while (!st.isEmpty()){
                        ListNode nn=new ListNode(st.pop().val);
                        Dummy.next=nn;
                        Dummy=Dummy.next;
                    }
                }
                head=head.next;
                if(st.size()>0){
                    Dummy.next=start;
                }
            }
            return  temp.next;
        }

    }
}
