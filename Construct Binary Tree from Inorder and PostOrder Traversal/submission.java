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
    int postOrderIndex;
    HashMap<Integer, Integer> inOrderMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postOrderIndex = postorder.length - 1;

        inOrderMap = new HashMap<>();

        for(int i=0; i<inorder.length; i++){
            inOrderMap.put(inorder[i], i);
        }    

        return arrayToTree(postorder,0,postorder.length-1);
    }

    private TreeNode arrayToTree(int[] postOrder, int left, int right){
        if(left > right){
            return null;
        }

        int postOrderValue = postOrder[postOrderIndex--];
        TreeNode root = new TreeNode(postOrderValue);

        root.right = arrayToTree(postOrder, inOrderMap.get(postOrderValue)+1,right);
        root.left = arrayToTree(postOrder, left, inOrderMap.get(postOrderValue)-1);

        return root;
    }
}
