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
    public List<String> preorder(TreeNode root,List<String> l){
        if(root==null){
            l.add("null");
            return l;
        }
        l.add(Integer.toString(root.val));
        preorder(root.left,l);
        preorder(root.right,l);
        return l;
    }
    public List<String> order(TreeNode root,List<String> l){
        if(root==null){
            l.add("null");
            return l;
        }
        l.add(Integer.toString(root.val));
        order(root.right,l);
        order(root.left,l);
        return l;
    }
    public boolean isSymmetric(TreeNode root) {
        List<String> lis=new ArrayList<>();
        List<String> lis1=new ArrayList<>();
        preorder(root,lis);
        order(root,lis1);
        return lis.equals(lis1);
    }
}