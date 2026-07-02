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
    public int s=-99999999;
    public int maxPathSum(TreeNode root) {
        max(root);
        return s;
    }
    int max(TreeNode root){
        if(root==null){
            return 0;
        }
        int ls=Math.max(0,max(root.left));
        int rs=Math.max(0,max(root.right));
        s=Math.max(s,root.val+ls+rs);
        return root.val+Math.max(ls,rs);
    }
}