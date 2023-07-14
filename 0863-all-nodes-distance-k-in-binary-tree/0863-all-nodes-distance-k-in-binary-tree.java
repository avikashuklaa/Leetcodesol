/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        if(root == null){
            return new ArrayList<>();
        }
        
        List<Integer> ans = new ArrayList<>();
        Map<Integer, TreeNode> p = new HashMap<>();
        Map<Integer, Integer> v = new HashMap<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            for(int i=0; i<size; i++){
                TreeNode top = q.poll();
                
                if(top.left != null){
                    q.add(top.left);
                    p.put(top.left.val, top);
                }
                
                if(top.right != null){
                    q.add(top.right);
                    p.put(top.right.val, top);
                }
            }
        }
        
        q.add(target);
        
        while(k > 0 && q.size() > 0){
            int size=q.size();
            for(int i=0; i<size; i++){
                TreeNode top = q.poll();
                
                v.put(top.val, 1);
                
                if(top.left != null && !v.containsKey(top.left.val)){
                    q.add(top.left);
                }
                
                if(top.right != null && !v.containsKey(top.right.val)){
                    q.add(top.right);
                }
                if(p.containsKey(top.val) && !v.containsKey(p.get(top.val).val)){
                    q.add(p.get(top.val));
                }
            }
            k--;
        }
        
        while(q.size()>0){
            ans.add(q.poll().val);
        }
        
        return ans;
    }
}