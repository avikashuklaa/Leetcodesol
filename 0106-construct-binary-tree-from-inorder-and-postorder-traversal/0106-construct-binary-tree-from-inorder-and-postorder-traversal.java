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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int n=inorder.length;
        return find(inorder, 0, n-1, postorder, 0, n-1);
    }
    
    public TreeNode find(int[] i, int is, int ie, int[] p, int ps, int pe){
        
        if(is > ie){
            return null;
        }
        TreeNode root = new TreeNode(p[pe]);
        int index = 0;
        
        while(i[index] != root.val){
            index++;
        }
        int num = index-is;
        
        root.left = find(i, is, index-1, p, ps, ps+num-1);
        root.right = find(i, index+1, ie, p, ps+num, pe-1);
        
        return root;
    }
}