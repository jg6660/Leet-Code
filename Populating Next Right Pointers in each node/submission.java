/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
     if(root == null){
         return root;
     }   

     Queue<Node> queue = new LinkedList<>();
     queue.offer(root);

     while(!queue.isEmpty()){
         int levelSize = queue.size();
         for(int i=0; i<levelSize; i++){
             Node currentNode = queue.poll();
             if(currentNode.left!=null){
                 queue.offer(currentNode.left);
             }
             if(currentNode.right!=null){
                 queue.offer(currentNode.right);
             }
             if(i == levelSize - 1){
                 currentNode.next = null;
             }
             else{
                 currentNode.next = queue.peek();
             }
         }
     }

     return root;
    }
}
