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
        StringBuilder res=new StringBuilder();
        preorder(root,res);
        return res.toString();
    }
    public void preorder(TreeNode root,StringBuilder res){
        if(root==null){
            res.append("null,");
            return ;

        }
        res.append(Integer.toString(root.val));
        res.append(",");
        preorder(root.left,res);
        preorder(root.right,res);

    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        List<String> lis=new LinkedList<>(Arrays.asList(arr));
        return treecreating(lis);
    }
    private TreeNode treecreating(List<String> lis){
        if(lis.get(0).equals("null")){
            lis.remove(0);
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(lis.get(0)));
        lis.remove(0);
        root.left=treecreating(lis);
        root.right=treecreating(lis);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));