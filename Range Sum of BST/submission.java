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
    public int sum;

    public void inorder(TreeNode node, int low, int high){
        if(node != null){
            inorder(node.left, low, high);
            if(node.val>= low && node.val <= high){
                sum += node.val;
            }
            inorder(node.right, low,high);
        }
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
            inorder(root,low,high);
            return sum;    
    }
}
