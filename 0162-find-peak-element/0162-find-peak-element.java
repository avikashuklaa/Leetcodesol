class Solution {
    public int findPeakElement(int[] nums) {
        
        int n=nums.length;
        int ans=0;
        
        if(n==1){
            return 0;
        }
        
        for(int i=0; i<n; i++){
            
            if(i==0){
                if(nums[i] > nums[i+1]){
                    ans = i;
                    break;
                }
            }
            else if(i==n-1){
                if(nums[i] > nums[i-1]){
                    ans = i;
                    break;
                }
            }
            else{
                if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                    ans = i;
                    break;
                }
            }
        }
        
        return ans;
    }
}