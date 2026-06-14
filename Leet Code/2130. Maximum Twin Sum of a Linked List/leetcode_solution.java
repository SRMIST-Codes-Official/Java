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
    public int pairSum(ListNode head) {
        List<Integer> l=new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        int s=0;
        for(int i=0;i<l.size()/2;i++){
            s=Math.max(s, l.get(i)+l.get(l.size()-1-i));
        }
        return s;

    }
}