
// @Title: 克隆图 (Clone Graph)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-02-09 02:38:40
// @Runtime: 32 ms
// @Memory: 38.5 MB

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

    private final HashMap<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) { return null; }
        if (visited.containsKey(node)) { return visited.get(node); }
        Node clone = new Node(node.val, new ArrayList<>());
        visited.put(node, clone);
        for (Node n : node.neighbors) { clone.neighbors.add(cloneGraph(n)); }
        return clone;
    }

}
