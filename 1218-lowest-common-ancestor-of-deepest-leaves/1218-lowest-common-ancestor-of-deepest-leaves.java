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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int max=maxdepth(root);
        return dfs(root,max,0);
    }

    private TreeNode dfs(TreeNode root,int max,int len)
    {
        if(root==null) return null;
        if(max-1==len) return root;
        TreeNode left=dfs(root.left,max,len+1);
        TreeNode right=dfs(root.right,max,len+1);

        if(left!=null && right!=null) return root;
        return left!=null?left:right;
    }

    private int maxdepth(TreeNode root)
    {
        if(root==null) return 0;
        int left=maxdepth(root.left);
        int right=maxdepth(root.right);

        return Math.max(left,right)+1;
    }
}