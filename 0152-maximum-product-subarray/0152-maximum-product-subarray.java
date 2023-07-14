class Solution {
    
    
    public int maxProduct(int[] nums) {
       
        int minsf = nums[0];
        int maxsf = nums[0];
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        int n=nums.length;
        
        for(int i=1; i<n; i++){
            if(nums[i]<0){
                max = Math.max(nums[i], minsf*nums[i]);
                min = Math.min(nums[i], maxsf*nums[i]);
            }
            else{
                max = Math.max(nums[i], nums[i]*maxsf);
                min = Math.min(nums[i], nums[i]*minsf);
            }
            maxsf = max;
            minsf = min;
            ans = Math.max(ans, maxsf);
        }
        
        return ans;
    }
}