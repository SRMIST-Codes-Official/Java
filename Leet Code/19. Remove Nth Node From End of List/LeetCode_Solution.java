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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp= new ListNode(0);
        temp.next=head;
        ListNode f=temp;
        ListNode s=temp;
        for(int i=1;i<=n;i++){
            f=f.next;
        }
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        if(s.next!=null && s.next.next !=null){
            s.next=s.next.next;
        }else{
            s.next=null;
        }
        return temp.next;
    }
}