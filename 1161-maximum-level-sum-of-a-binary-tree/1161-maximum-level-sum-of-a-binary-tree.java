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
    
    public void lev(TreeNode root, List<Integer> temp){
        
        if(root==null){
            return;
        }
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int sum = 0;
        while(q.size()>0){
            int count = q.size();
            for(int i=0; i<count; i++){
                root = q.remove();
                sum += root.val; 
                
                if(root.left != null){
                  q.add(root.left);
                }
                if(root.right != null){
                  q.add(root.right);
               }
            }
            temp.add(sum);
            sum=0;
            
        }
    }
    public int maxLevelSum(TreeNode root) {
        
        List<Integer> temp = new ArrayList<>();
        lev(root, temp);
        
        int max = Collections.max(temp);
        int i = temp.indexOf(max);
        
        return i+1;
        
        
    }
}