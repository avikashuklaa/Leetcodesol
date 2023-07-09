class Solution {
    public int maxRotateFunction(int[] nums) {
        
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int prod=0;
        int sum=0;
        for(int i=0; i<n; i++){
            prod += (i*nums[i]);
            sum+=nums[i];
        }
        
       
        max=Math.max(max, prod);
        
        for(int i=n-1; i>=0; i--){
            int num=nums[i];
            prod=(prod + sum - (n*num));
            max=Math.max(max, prod);
            
        }
        
        return max;
        
        
    }
}