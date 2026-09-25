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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode temp = head;
        ListNode point=head;
        while (temp.next != null) {
            sum = sum + temp.val;
            if (temp.next.val == 0) {
                temp.val = sum;
                point.next=temp;
                point=temp;
                sum = 0;
            }
            temp = temp.next;
        }
        point.next=null;
        return head.next;
    }
}