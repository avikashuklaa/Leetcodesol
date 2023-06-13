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
    
    public List<Integer> post(TreeNode root, List<Integer> temp){
        
        if(root == null){
            temp.add(0);
            return temp;
        }        
        
        post(root.left, temp);
        post(root.right, temp);
        temp.add(root.val);
        
        return temp;
        
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();
        
        t1 = post(p, t1);
        t2 = post(q, t2);
        
        return t1.equals(t2);
        
    }
}