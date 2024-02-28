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
    private int maxDepth;
    private int leftMostValue;
    public int findBottomLeftValue(TreeNode root) {
        maxDepth = -1;
        leftMostValue = 0;
        dfs(root,0);
        return leftMostValue;
    }

    private void dfs(TreeNode node, int depth){
        if(node == null){
            return;
        }

        if(depth > maxDepth){
            maxDepth = depth;
            leftMostValue = node.val;
        }

        dfs(node.left, depth+1);
        dfs(node.right, depth+1);
    }
}
