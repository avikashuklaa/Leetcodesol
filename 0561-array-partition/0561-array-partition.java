class Solution {
    
    public void selSort(int[] nums){
        
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            int index = i;
            
            for(int j=i+1; j<n; j++){
                if(nums[index]>nums[j]){
                    index = j;
                }
            }
            int temp = nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            
    }
    }
    public int arrayPairSum(int[] nums) {
        
        selSort(nums);
        int ans=0;
        
        for(int i=0; i<nums.length; i=i+2){
            ans += nums[i];
        }
        
        return ans;
        
        
        
    }
}