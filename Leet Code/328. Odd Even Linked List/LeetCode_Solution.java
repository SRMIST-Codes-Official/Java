
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
    public ListNode oddEvenList(ListNode head) {
        int size =1;
        ListNode tail=head;
        if(head==null){
            return head;
        }
        while (tail.next!=null){
            size++;
            tail=tail.next;
        }
        ListNode temp=head.next;
        ListNode s=head;
        for(int i=2;i<=size;i++){
            if(i%2==0){
                tail.next=temp;
                temp=temp.next;
                s.next=s.next.next;
                tail=tail.next;
                s=s.next;
                tail.next=null;
            }
            else{
                temp=temp.next;
            }
        }
        return head;

    }
}