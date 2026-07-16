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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode rev=new TreeNode(root.val);
        invert(root, rev);
        return rev;
    }
    void invert(TreeNode root, TreeNode rev){
        if(root.left!=null){
            TreeNode node=new TreeNode(root.left.val);
            rev.right=node;
            invert(root.left,rev.right);
        }
        if(root.right!=null){
            TreeNode node=new TreeNode(root.right.val);
            rev.left=node;
            invert(root.right,rev.left);
        }
    }
}