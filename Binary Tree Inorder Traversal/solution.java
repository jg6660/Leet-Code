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
    private List<Integer> result = new ArrayList<Integer>();
    
    public void dfs(TreeNode node){
        
        if(node == null){
            return;
        }
        
        dfs(node.left);
        result.add(node.val);
        dfs(node.right);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        dfs(root);
        return result;
    }
}
