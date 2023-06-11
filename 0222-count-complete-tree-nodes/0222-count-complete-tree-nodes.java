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
    
    public int size(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int ln = size(root.left);
        int rn = size(root.right);
        int tn = ln + rn + 1;
        return tn;
    }
    public int countNodes(TreeNode root) {
        
        int ans = size(root);
        
        return ans;
        
    }
}