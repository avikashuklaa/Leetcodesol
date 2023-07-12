class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        find(ans, new ArrayList<>(), 1, 9, k, n);
        return ans;
        
    }
    
    public void find(List<List<Integer>> ans, List<Integer> curr, int start, int end, int k, int target){
        
        if(target == 0 && curr.size() == k){
            ans.add(new ArrayList<>(curr));
        }
        else{
            for(int i=start; i<=end; i++){
                curr.add(i);
                find(ans, curr, i+1, end, k, target - i);
                curr.remove(curr.size() - 1);
            }
        }
    }
    
    
}