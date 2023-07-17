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
    private List<Integer> result = new ArrayList<>();
    
    public void dfs(TreeNode node){
        
        if(node == null){
            return;
        }
        
        dfs(node.left);
        dfs(node.right);
        result.add(node.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        dfs(root);
        return result;
    }
}
