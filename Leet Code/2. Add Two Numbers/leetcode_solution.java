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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode();
        ListNode head=new ListNode();
        head=res;
        int carry=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode node=new ListNode(sum);
            res.next=node;
            res=res.next;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1!=null){
            while(l1!=null){
                int sum=l1.val+carry;
                carry=sum/10;
                sum=sum%10;
                ListNode node=new ListNode(sum);
                res.next=node;
                res=res.next;
                l1=l1.next;
            }
        }
        if(l2!=null){
            while(l2!=null){
                int sum=l2.val+carry;
                carry=sum/10;
                sum=sum%10;
                ListNode node=new ListNode(sum);
                res.next=node;
                res=res.next;
                l2=l2.next;
            }
        }
        if(carry==1){
            res.next=new ListNode(1);
        }
        return head.next;
    }
}