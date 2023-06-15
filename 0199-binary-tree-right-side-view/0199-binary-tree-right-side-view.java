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
    
    public void right(TreeNode root, List<Integer> temp, int level){
        
        if(root == null){
            return;
        }
        if(temp.get(level) == -1){
            temp.add(level, root.val);     
        }
       
        right(root.right, temp, level+1);
        right(root.left, temp, level+1);
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> temp = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        temp.add(-1);
        
        right(root, temp, 0);
        for(int i=0; i<temp.size(); i++){
            if(temp.get(i)!=-1){
                ans.add(temp.get(i));
            }
        }
        
        return ans;
        
    }
}