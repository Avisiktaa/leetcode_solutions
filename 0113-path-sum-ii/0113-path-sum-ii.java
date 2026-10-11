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
    public void dfs(TreeNode node,int target,List<Integer> ans,List<List<Integer>> res)
    {
        if(node==null)
        return;
        ans.add(node.val);
        if(node.left==null && node.right==null)
        {
            if(node.val==target)
            {
                res.add(new ArrayList<>(ans));
            }
                ans.remove(ans.size() - 1);
                return;
        }
        
        dfs(node.left,target-node.val,ans,res);
        dfs(node.right,target-node.val,ans,res);
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        dfs(root,target,ans,res);
        return res;
    }
}