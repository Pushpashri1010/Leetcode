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
    public int sumNumbers(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        int p=0;
        hf(p,root,l);
        int sum=0;
        for(int n:l){
            sum+=n;
        }
        return sum;
    }
    private void hf(int p,TreeNode root,List<Integer> l){
        if(root.left==null && root.right!=null){
            p=p*10+root.val;
            hf(p,root.right,l);
           // l.add(p);
            return;
        }
        if(root.right==null && root.left!=null){
            p=p*10+root.val;
            //l.add(p)
            hf(p,root.left,l);
            //l.add(p);
            return;
        }
        if(root.left==null && root.right==null){
            p=p*10+root.val;
            l.add(p);
            return;
        }
        p=p*10+root.val;
        hf(p,root.left,l);
        hf(p,root.right,l);
        
    }
}