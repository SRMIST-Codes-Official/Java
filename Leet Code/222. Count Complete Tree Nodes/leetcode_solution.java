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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=lh(root);
        int right=rh(root);
        if(left==right){
            return (int)(Math.pow(2,left))-1;
        }else{
            return 1+ countNodes(root.left)+countNodes(root.right);
        }
    }
    int lh(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+lh(root.left);
    }
    int rh(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+rh(root.right);
    }
}