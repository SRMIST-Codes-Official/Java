/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean ltr=true;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> l=new ArrayList<>(Collections.nCopies(s,0));
            for(int i=0;i<s;i++){
                TreeNode node=q.poll();
                int index;
                if(ltr){
                    index=i;
                }else{
                    index=s-i-1;
                }
                l.set(index,node.val);
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            ltr=!ltr;
            res.add(l);
        }
        return res;
    }
}