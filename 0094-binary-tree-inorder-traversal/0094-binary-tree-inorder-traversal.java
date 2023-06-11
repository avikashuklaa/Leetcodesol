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
    
    public void inOrder(TreeNode root, List<Integer> temp){
        
        if(root==null){
            return;
        }
        
        inOrder(root.left, temp);
        temp.add(root.val);
        inOrder(root.right, temp);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> temp = new ArrayList<>();
        inOrder(root, temp);
        return temp;
        
        
    }
}