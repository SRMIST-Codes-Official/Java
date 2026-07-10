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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inmap=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            inmap.put(inorder[i],i);
        }
        TreeNode root=build(inorder, 0, inorder.length-1, preorder, 0,preorder.length-1, inmap);
        return root;
    }
    TreeNode build(int[] inorder, int is, int ie, int[] preorder, int ps, int pe, HashMap<Integer, Integer> inmap){
        if(is>ie || ps>pe){
            return null;
        }
        TreeNode root=new TreeNode(preorder[ps]);
        int inRoot=inmap.get(root.val);
        int numsleft=inRoot-is;

        root.left=build(inorder,is, inRoot-1, preorder, ps+1, ps+numsleft,inmap);
        root.right=build(inorder, inRoot+1, ie, preorder,ps+numsleft+1, pe,inmap);
        return root;
    }
}