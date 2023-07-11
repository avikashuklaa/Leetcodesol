class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        
        int gcd = gcdd(numsDivide);
        
        Arrays.sort(nums);
        int n=nums.length;
        
        for(int i=0; i<n; i++){
            if(gcd % nums[i] == 0){
                return i;
            }
        }
        return -1;
    }
    
    public int gcdd(int[] ans){
        
        int gcd=ans[0];
        
        for(int i=1; i<ans.length; i++){
            int num = ans[i];
            while(num>0){
               int temp = gcd % num;
               gcd = num;
               num = temp;
            }
        }
        
        return gcd;
    }
    
}