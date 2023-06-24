class Solution {
    public void rotate(int[] nums, int k) {
//         int n=nums.length;
//         int count=(k % n);
        
//         // while(count>0){
//             int temp=nums[n-1];
//             for(int i=n-1; i>0; i--){
//                 nums[i]=nums[i-1];
//             }
//             nums[0]=temp;
//             count--;
        
        int len = nums.length;
     
        k = k%len;
        rev(nums, 0, len-1-k);
        rev(nums, len-k, len-1);
        rev(nums, 0, len-1);
        
        return;
       
    }
     private void rev(int[] nums, int s, int e){
        int tmp;
        while(s<e){
            tmp=nums[s];
            nums[s]=nums[e];
            nums[e]=tmp;
            s++;
            e--;
        }
     }
}