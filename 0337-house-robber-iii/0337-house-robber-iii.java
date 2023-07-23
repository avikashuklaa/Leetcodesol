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
    
   
    public int rob(TreeNode root) {
        
        int[] ans = find(root);
        return Math.max(ans[0], ans[1]);
       
    }
    
    public static int[] find(TreeNode root){
        
        if(root == null){
            return new int[2];
        }
        
        int[] left = find(root.left);
        int[] right = find(root.right);
        int[] ans = new int[2];
        
        ans[0] = root.val + left[1] + right[1];
        ans[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        
        return ans;
        
    } 
}