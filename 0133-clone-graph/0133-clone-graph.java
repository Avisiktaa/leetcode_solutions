/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public void dfs(Node node, Node clone, HashMap<Node,Node> map)
    {
        for(Node nei:node.neighbors)
        {
            if(!map.containsKey(nei))
            {
                Node cnei=new Node(nei.val);
                map.put(nei,cnei);

                clone.neighbors.add(cnei);
                dfs(nei,cnei,map);
            }
            else
            {
                clone.neighbors.add(map.get(nei));
            }
        }
    }
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> map=new HashMap<>();
        if(node==null)
        return null;
        Node clone=new Node(node.val);
        map.put(node,clone);

        dfs(node,clone,map);
        return clone;
    }
}