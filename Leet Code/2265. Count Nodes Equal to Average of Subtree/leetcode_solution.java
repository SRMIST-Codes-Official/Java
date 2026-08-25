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
    public int averageOfSubtree(TreeNode root) {
        return bfs(root);
    }
    int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }
    int nodecount(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1 +nodecount(root.left) + nodecount(root.right);
    }
    int bfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=bfs(root.left);
        int r=bfs(root.right);
        if(sum(root)/nodecount(root)==root.val){
            return 1+l+r;
        }
        return l+r;
    }
}