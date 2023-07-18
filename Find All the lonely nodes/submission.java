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

    public void preorder(TreeNode node){
        if(node != null){
            if(node.left != null && node.right == null){
                result.add(node.left.val);
            }
            if(node.right != null && node.left == null){
                result.add(node.right.val);
            }
            preorder(node.left);
            preorder(node.right);
        }
    }

    public List<Integer> getLonelyNodes(TreeNode root) {
        preorder(root);
        return result;
    }
}
