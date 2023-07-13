class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        int[] ans = new int[target + 1];
        Arrays.fill(ans, -1);
        
        int sol = recurse(nums, target, ans);
        return sol;
    }
    
    public int recurse(int[] nums, int target, int[] ans){
        
        if(target < 0){
            return 0;
        }
        else if(target == 0){
            return 1;
        }
        else if (ans[target] != -1){
            return ans[target];
        }
        int count=0;
        for(int i=0; i<nums.length; i++){
            count += recurse(nums, target - nums[i], ans);         
        }
        
        ans[target] = count;
        return ans[target];
        
        
    }
    
    
}