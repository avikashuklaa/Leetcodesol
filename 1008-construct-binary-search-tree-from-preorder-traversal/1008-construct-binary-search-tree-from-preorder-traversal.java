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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode ans = find(preorder, 0, preorder.length - 1);
        return ans;
    }
    
    public TreeNode find(int[] nums, int start, int end){
        
        if(start>end){
            return null;
        }       
        
        TreeNode root = new TreeNode(nums[start]);
        int i=0;
        for(i=start; i<=end; i++){
            if(nums[i]>root.val){
                break;
            }
        }
        
        root.left = find(nums, start+1, i-1);
        root.right = find(nums, i, end);
        
        return root;
        
        
    }
}