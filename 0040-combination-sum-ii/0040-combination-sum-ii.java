class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        find(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
        
    }
    
    public void find(List<List<Integer>> ans, List<Integer> curr, int[] nums, int target, int start){
        
        if(target < 0){
            return;
        }
        else if(target == 0){
            ans.add(new ArrayList<>(curr));
        }
        else{
            
            for(int i=start; i<nums.length; i++){
                if(i > start && nums[i] == nums[i-1]){
                    continue;
                }
                if(target < nums[i]){
                    break;
                }
                curr.add(nums[i]);
                find(ans, curr, nums, target - nums[i], i+1);
                curr.remove(curr.size() - 1);
                
            }
        }
    }
}