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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode f=head;
        ListNode s=head;
        while(f!= null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode second=reverse(s);
        ListNode first=head;
        while(second!=null){
            if(first.val != second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}