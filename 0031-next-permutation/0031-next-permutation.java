class Solution {
    

 
    public void nextPermutation(int[] nums) {
        
        int n=nums.length;
        int index=-1;
        
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        
//         if(index==-1){
//             int i=0;
//             int j=n-1;
//             while(i<j){
//                 int temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 i++;
//                 j--;
//             }
           
//             return;
//         }
        
        for(int i=n-1; i>=0 && index!=-1; i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        int p=index+1;
        int q=n-1;
        while(p<q){
            int temp=nums[p];
            nums[p]=nums[q];
            nums[q]=temp;
            p++;
            q--;
        }
       
        
        
        
    }
}