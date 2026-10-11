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
    public int pathSum(TreeNode root, int target) {
        Map<Long,Integer> map=new HashMap<>();
        map.put(0L,1);

        return dfs(root,0L,target,map);
    }
    public int dfs(TreeNode node,long curr,int target,Map<Long,Integer> map)
    {
        if(node==null)
        return 0;
        curr+=node.val;

        int count=map.getOrDefault(curr-target,0);
        map.put(curr,map.getOrDefault(curr,0)+1);

        count+=dfs(node.left,curr,target,map);
        count+=dfs(node.right,curr,target,map);

        map.put(curr,map.get(curr)-1);
        return count;
    }
}