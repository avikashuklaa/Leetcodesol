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
    
    public int max(TreeNode root){
        
        if(root == null){
            return 0;
        }
        
        int lm = max(root.left);
        int rm = max(root.right);
        int tm = Math.max(lm, rm) + 1;
        return tm;
    }
    
    
    public int maxDepth(TreeNode root) {
        
        int ans = max(root);
        
        return ans;
        
        
    }
}