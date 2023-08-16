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
    List<Integer> result = new ArrayList<Integer>();

    public int sumNumbers(TreeNode root) {
        int value = 0;
        addNumbers(root, value);   

        int sum = 0;
        for(int val : result){
            sum += val;
        } 

        return sum;
    }

    private void addNumbers(TreeNode node, int value){
        if(node == null){
            return;
        }
        int temp = 0;
        temp = value*10 + node.val;
        if(node.left == null && node.right == null){
            result.add(temp);
        }
        addNumbers(node.left, temp);
        addNumbers(node.right, temp);
    }
}
