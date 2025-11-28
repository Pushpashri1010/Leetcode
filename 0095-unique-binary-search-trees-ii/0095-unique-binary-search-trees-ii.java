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
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<>();
        }
        return  construct(1,n);
    }
    public List<TreeNode> construct(int start,int end){
        List<TreeNode> trees=new ArrayList<>();
        if(start>end){
            trees.add(null);
            return trees;
        }
        for(int i=start;i<=end;i++){
            List<TreeNode> lefttrees=construct(start,i-1);
            List<TreeNode> righttrees=construct(i+1,end);
            for(TreeNode left:lefttrees){
                for(TreeNode right:righttrees){
                    TreeNode root=new TreeNode(i);
                    root.left=left;
                    root.right=right;
                    trees.add(root);
                }
            }
        }
        return trees;
    }
}