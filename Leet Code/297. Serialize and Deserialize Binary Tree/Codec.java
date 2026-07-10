/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        StringBuilder res=new StringBuilder();
        Queue <TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node!=null){
                res.append(node.val+" ");
                q.add(node.left);
                q.add(node.right);
            }else{
                res.append("# ");
            }
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==""){
            return null;
        }
        String[] num=data.split(" ");
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(num[0]));
        q.offer(root);
        for(int i=1;i<num.length;i++){
            TreeNode parent=q.poll();
            if(!num[i].equals("#")){
                parent.left=new TreeNode(Integer.parseInt(num[i]));
                q.offer(parent.left);
            }
            if(!num[++i].equals("#")){
                parent.right=new TreeNode(Integer.parseInt(num[i]));
                q.offer(parent.right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));