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
    public int countNodes(TreeNode root) {
        if (root==null)
        return 0;
        int lc=countl(root.left);
        int rc=countr(root.right);

        if(lc==rc)
        return (1<<lc+1)-1;

        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int countl(TreeNode root)
    {
        int depth=0;
        while(root!=null)
        {
            depth++;
            root=root.left;
        }
        return depth;
    }
    public int countr(TreeNode root)
    {
        int depth=0;
        while(root!=null)
        {
            depth++;
            root=root.right;
        }
        return depth;
    }
}