class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        
        int l=nums.length;
        int j=l-1;
        int i=0;
        ans[0]=-1;
        ans[1]=-1;
        
        while(i<l && j<l){
            if(nums[i]==target && ans[0]==-1){
                ans[0]=i;
                
            }
            if(nums[j]==target && ans[1]==-1){
                ans[1]=j;
               
            }
            i++;
            j--;
        }
        
        return ans;
        
        
    }
}