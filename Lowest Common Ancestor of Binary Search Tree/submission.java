/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    int rootVal = root.val;
    int pVal = p.val;
    int qVal = q.val;

    if(rootVal>pVal && rootVal>qVal){
        return lowestCommonAncestor(root.left,p,q);
    }
    else if(rootVal<pVal && rootVal<qVal){
        return lowestCommonAncestor(root.right,p,q);
    }
    else{
        return root;
    }

    }
}
