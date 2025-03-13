
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int l=count(head);
        if(l==0){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            ListNode c=s;
            for(int i=1;i<=l;i++){
                c=c.next;
            }
            if(c==s){
                return s;
            }
            s=s.next;
            f=f.next.next;
        }
        return null;
    }
    int count(ListNode head){
        ListNode f=head;
        ListNode s=head;
        while(f != null && f.next != null){
            f=f.next.next;
            s=s.next;
            if(f==s){
                int length=0;
                do{
                    s=s.next;
                    length++;
                }while(s!=f);
                return length;
            }
        }
        return 0;
    }
}