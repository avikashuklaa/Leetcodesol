class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        
        find(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
        
    }
    
    public void find(List<List<Integer>> ans, List<Integer> curr, int[] nums, int target, int index){
        
        if(target < 0){
            return;
        }
        else if (target == 0){
            ans.add(new ArrayList<>(curr));
        }
        else{
            
            for(int i=index; i<nums.length; i++){
                int num = nums[i];
                curr.add(num);
                find(ans, curr, nums, target - num, i);
                curr.remove(curr.size() - 1);
            }
        }
    }
}