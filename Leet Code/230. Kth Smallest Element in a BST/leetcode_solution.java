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
    int ans=0;
    int c=1;
    public int kthSmallest(TreeNode root, int k) {
        kth(root, k);
        return ans;
    }
    void kth(TreeNode root, int k){
        if(root==null){
            return;
        }
        kth(root.left,k);
        if(k==c){
            ans=root.val;
        }
        c++;
        kth(root.right,k);
    }
}