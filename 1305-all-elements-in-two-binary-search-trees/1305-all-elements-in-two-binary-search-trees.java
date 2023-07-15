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
    List<Integer> ans = new ArrayList<>();
    public void inorder(TreeNode root){
        
        if(root == null){
            return;
        }
        
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
        
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        // List<Integer> t1 = new ArrayList<>();
        // List<Integer> t2 = new ArrayList<>();
        // Stack<Integer> st = new Stack<>();
        
        inorder(root1);
        inorder(root2);
        Collections.sort(ans);
        return ans;
        
    }
}