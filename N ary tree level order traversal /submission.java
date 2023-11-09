/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(root == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int currentSize = queue.size();
            List<Integer> temp = new ArrayList<Integer>();
            for(int i=0; i<currentSize; i++){
                Node currentNode = queue.poll();
                temp.add(currentNode.val);
                for(Node node: currentNode.children){
                    queue.offer(node);
                }
            }

            result.add(temp);
        }

        return result;
    }
}
