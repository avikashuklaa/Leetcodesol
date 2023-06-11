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
    
    public void levOrder(TreeNode root, List<List<Integer>> temp){
        
        if(root==null){
            return;
        }
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        
        while(q.size()>0){
            int count = q.size();
            List<Integer> ans = new ArrayList<>();
            for(int i=0; i<count; i++){
                root = q.remove();
                ans.add(root.val);
                if(root.left != null){
                    q.add(root.left);
                }
                
                if(root.right != null){
                    q.add(root.right);
                }
            }
             temp.add(ans);
        }
       
        
        
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> temp = new ArrayList<>();
        levOrder(root, temp);
        
        return temp;
        
    }
}