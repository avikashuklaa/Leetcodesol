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
    
public static void Spiral(TreeNode root,List<List<Integer>> temp){
        
        if (root==null){
            return;
        }
        
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        
        s1.push(root);
        
        while (!s1.empty() || !s2.empty()){
            List<Integer> list=new ArrayList<Integer>();
            while (!s1.empty()){
                root= s1.peek();
                s1.pop();
                list.add(root.val);
                if (root.left!=null){
                    s2.push(root.left);
                }
                
                if (root.right!=null){
                    s2.push(root.right);
                }
            }
            if (!list.isEmpty()){
               temp.add(list); 
            }
            
            List<Integer> list1=new ArrayList<Integer>();
             while (!s2.empty()){
                root= s2.peek();
                s2.pop();
                list1.add(root.val);
                 if(root.right!=null){
                     s1.push(root.right);
                 }
                 if (root.left!=null){
                    s1.push(root.left);
                 }
                
              }
            if (!list1.isEmpty()){
               temp.add(list1); 
            }     
           
        }
    }
        
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> temp=new ArrayList<>();
        Spiral(root,temp);
        return temp;
        
    }
}