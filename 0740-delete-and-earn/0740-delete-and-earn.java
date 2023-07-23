class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        
        int[] count = new int[10001];
        int[] dp = new int[10001];
        
        for(int num : nums){
            count[num]++;
            if(num > max){
                max = num;
            }
        }
        
        dp[1]=count[1];
        dp[2] = Math.max(dp[1], count[2]*2);
        
        for(int i=3; i<max+1; i++){
            dp[i] = Math.max(dp[i-1], count[i]*i + dp[i-2]);
        }
        
        return dp[max];
    }
}