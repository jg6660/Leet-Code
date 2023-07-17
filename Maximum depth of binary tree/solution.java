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
    int answer;
    
    private int depthCalc(TreeNode root, int depth){
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            answer = Math.max(answer,depth);
        }
        
        depthCalc(root.left, depth+1);
        depthCalc(root.right, depth+1);
        
        return answer;
    }
    
    public int maxDepth(TreeNode root) {
        
        depthCalc(root,1);
        
        return answer;
        
    }
}
