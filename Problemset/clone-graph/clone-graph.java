
// @Title: 克隆图 (Clone Graph)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-02-11 00:43:03
// @Runtime: 32 ms
// @Memory: 38.6 MB

class Solution {

    private final HashMap<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) { return null; }
        
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node clone = new Node(node.val, new ArrayList<>());
        visited.put(node, clone);

        for (Node n : node.neighbors) {
            clone.neighbors.add(cloneGraph(n));
        }
        return clone;
    }

}
