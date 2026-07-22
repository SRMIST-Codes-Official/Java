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
    int c=0;
    public int countDominantNodes(TreeNode root) {
        post(root);
        return c;
    }
    int post(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=post(root.left);
        int right=post(root.right);
        int max=Math.max(left,Math.max(right,root.val));
        if(root.val==max){
            c++;
        }
        return max;
    }
}