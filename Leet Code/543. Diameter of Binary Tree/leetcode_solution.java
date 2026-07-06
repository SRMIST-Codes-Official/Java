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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] arr=new int[1];
        dheight(root, arr);
        return arr[0];
    }
    int dheight(TreeNode root, int[]arr){
        if(root==null){
            return 0;
        }
        int ls=dheight(root.left,arr);
        int rs=dheight(root.right,arr);
        int d=ls+rs;
        arr[0]=Math.max(arr[0],d);
        return 1+Math.max(ls,rs);
    }
}