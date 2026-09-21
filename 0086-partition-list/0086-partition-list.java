/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode sm = dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode lm = dummy2;
        while(head!=null) {
            if(head.val<x){
                sm.next = head;
                sm = head;
            }
            else {
                lm.next = head;
                lm = head;
            }
            head= head.next;
        }
       lm.next = sm.next;
       lm.next = null;
       sm.next = dummy2.next;
       return dummy1.next;

    }
}