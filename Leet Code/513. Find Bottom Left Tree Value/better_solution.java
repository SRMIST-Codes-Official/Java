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
    int mh=-1;
    int lv=-1;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return lv;
    }
    void dfs(TreeNode root, int h){
        if(root==null){
            return;
        }
        if(h>mh){
            mh=h;
            lv=root.val;
        }
        dfs(root.left,h+1);
        dfs(root.right,h+1);
    }
}