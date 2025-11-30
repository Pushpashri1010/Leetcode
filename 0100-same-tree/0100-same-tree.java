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
   public List<String> preorder(TreeNode n,List<String> l){
     if(n==null){
        l.add("null");
        return l;
     }
     l.add(Integer.toString(n.val));
     preorder(n.left,l);
     preorder(n.right,l);
     return l;
   }
   
    public boolean isSameTree(TreeNode p, TreeNode q) {
          List<String> lis1=new ArrayList<>();
          List<String> lis2=new ArrayList<>();
          preorder(p,lis1);
          preorder(q,lis2);
          return lis1.equals(lis2);
         
    }
}