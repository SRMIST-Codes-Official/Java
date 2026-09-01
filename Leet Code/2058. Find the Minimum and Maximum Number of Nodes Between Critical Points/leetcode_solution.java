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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> l=new ArrayList<>();
        int i=1;
        int prev=head.val;
        head=head.next;
        while(head.next!=null){
            int next=head.next.val;
            if(head.val>prev && head.val>next || head.val<prev && head.val<next){
                l.add(i);
            }
            i++;
            prev=head.val;
            head=head.next;
        }
        int[] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        if(l.size()<2){
            return res;
        }
        res[0]=Integer.MAX_VALUE;
        res[1]=l.get(l.size()-1)-l.get(0);
        for(int j=0;j<l.size()-1;j++){
            res[0]=Math.min(res[0], l.get(j+1)-l.get(j));
        }
        return res;

    }
}