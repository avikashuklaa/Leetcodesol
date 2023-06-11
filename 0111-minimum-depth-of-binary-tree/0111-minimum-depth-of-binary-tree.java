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
    
    public int min(TreeNode root){
        
        if(root == null){
            return 0;
        }
        if(root.left == null){
            int tm = min(root.right) + 1;
            return tm;
        }
        if(root.right == null){
            int tm = min(root.left) + 1;
            return tm;
        }
        
        int lm=min(root.left);
        int rm = min(root.right);
        
        int tm = Math.min(lm, rm) + 1;
        return tm;
    }
   
    public int minDepth(TreeNode root) {
        int ans = min(root);
        
        return ans;
        
        
        
    }
}