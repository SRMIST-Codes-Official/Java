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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<s;i++){
                TreeNode temp=q.poll();
                max=Math.max(max,temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            list.add(max);
        }
        return list;
    }
}
    