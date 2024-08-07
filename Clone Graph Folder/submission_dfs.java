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
    public HashMap<Node, Node> visitedNode = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }    

        if(this.visitedNode.containsKey(node)){
            return this.visitedNode.get(node);
        }

        Node newNode = new Node(node.val, new ArrayList<Node>());

        this.visitedNode.put(node, newNode);

        for(Node neighbor: node.neighbors){
            newNode.neighbors.add(cloneGraph(neighbor));
        }

        return newNode;
    }
}
