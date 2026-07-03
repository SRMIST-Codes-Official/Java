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
    public int deepestLeavesSum(TreeNode root) {
        int d= depth(root);
        return sum(root,d,1);
    }
    int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int ld=depth(root.left);
        int rd=depth(root.right);
        return 1+Math.max(ld,rd);
    }
    int sum(TreeNode root, int d, int cd){
        if(root==null){
            return 0;
        }
        int ld=sum(root.left, d,cd+1);
        int rd=sum(root.right,d,cd+1);
        if(cd==d){
            return root.val + ld +rd; 
        }
        return ld+rd;
    }
}