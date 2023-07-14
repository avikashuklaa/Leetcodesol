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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        int n=preorder.length;
        
        return find(preorder, 0, n-1, inorder, 0, n-1);
        
    }
    
    public TreeNode find(int[] p, int ps, int pe, int[] i, int is, int ie){
        
        if(is > ie){
            return null;
        }
        
        int index = is;
        
        while(i[index] != p[ps]){
            index++;
        }
        
        int num = index - is;
        TreeNode root = new TreeNode(p[ps]);
        root.left = find(p, ps+1, ps+num, i, is, index-1);
        root.right = find(p, ps+num+1, pe, i, index+1, ie);
        
        return root;
        
    }
    
    
}