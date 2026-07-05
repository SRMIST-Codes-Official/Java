/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> l1=new ArrayList<>();
        ArrayList<TreeNode> l2=new ArrayList<>();
        getpath(root,l1,p);
        getpath(root,l2,q);
        TreeNode res=null;
        int s=Math.min(l1.size(),l2.size());
        for(int i=0;i<s;i++){
            if(l1.get(i)==l2.get(i)){
                res=l1.get(i);
            }else{
                break;
            }
        }
        return res;
    }
    boolean getpath(TreeNode root, ArrayList<TreeNode> arr, TreeNode p){
        if(root==null){
            return false;
        }
        arr.add(root);
        if(root==p){
            return true;
        }
        if(getpath(root.left, arr,p) || getpath(root.right, arr, p)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }
}