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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> inmap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inmap.put(inorder[i],i);
        }
        TreeNode root=build(inorder, 0,inorder.length-1,postorder,0,postorder.length-1,inmap);
        return root;
    }
    TreeNode build(int[] inorder, int is, int ie, int[]postorder, int ps, int pe, HashMap<Integer,Integer>inmap){
        if(is>ie || ps>pe){
            return null;
        }
        TreeNode root=new TreeNode(postorder[pe]);
        int inroot=inmap.get(root.val);
        int numsleft=inroot-is;
        root.left=build(inorder,is,inroot-1,postorder, ps, ps+numsleft-1, inmap);
        root.right=build(inorder, inroot+1,ie, postorder, ps+numsleft,pe-1,inmap);
        return root;
    }
}