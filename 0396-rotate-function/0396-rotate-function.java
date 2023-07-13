class Solution {
    public int maxRotateFunction(int[] nums) {
        
        int n=nums.length;
        
        int sum = 0;
        int prod = 0;
        int ans=0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum += nums[i];
            prod += (i*nums[i]);
        }
        
        for(int i=n-1; i>=0; i--){
            int num = nums[i];
            ans = (prod + sum - (n * num));
            prod = ans;
            
            if(max < ans){
                max=ans;
            }
            
        }
        
        return max;
        
        
    }
}