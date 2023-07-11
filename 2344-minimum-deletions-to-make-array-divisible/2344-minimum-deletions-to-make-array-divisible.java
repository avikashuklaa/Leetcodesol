class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        
        int gcd = findgcd(numsDivide);
        
        Arrays.sort(nums);
        int n=nums.length;
        
        for(int i=0; i<n; i++){
            if(gcd % nums[i] == 0){
                return i;
            }
        }
        
        return -1;
        
    }
    
    public int findgcd(int[] ans){
        
        int gcd = ans[0];
        
        for(int i=1; i<ans.length; i++){
            int num=ans[i];
            while(num > 0){
                int tmp = gcd % num;
                gcd = num;
                num = tmp;
            }
        }
        
        return gcd;
    }
    
}