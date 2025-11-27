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
    public int maxPathSum(TreeNode root) {
        int[] max=new int[1];
        max[0]=Integer.MIN_VALUE;
        maxpath(root,max);
        return max[0];
    }
    private int maxpath(TreeNode root,int[] max){
        if(root==null)
        return 0;
        int l=Math.max(0,maxpath(root.left,max));
        int r=Math.max(0,maxpath(root.right,max));
        int curr=root.val+l+r;
        max[0]=Math.max(curr,max[0]);
        return root.val+Math.max(l,r);
    }
}