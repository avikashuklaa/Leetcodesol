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
    
    public void preOrder(TreeNode root, List<Integer> temp){
        
        if(root==null){
            return;
        }
        
        temp.add(root.val);
        preOrder(root.left, temp);
        preOrder(root.right, temp);
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> temp = new ArrayList<>();
        
        preOrder(root, temp);
        return temp;
        
    }
}