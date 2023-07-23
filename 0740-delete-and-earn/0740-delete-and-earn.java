class Solution {
    public int deleteAndEarn(int[] nums) {
        
        
        int max=Integer.MIN_VALUE;
        int[] count = new int[10001];
        
        for(int num : nums){
            count[num]++;
            if(num > max){
                max = num;
            }
        }
        
        int[] dp = new int[10001];
        
        dp[1] = count[1];
        dp[2]= Math.max(dp[1], count[2]*2);
        
        for(int i=3; i<=max; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + count[i]*i);
        }
        
        return dp[max];
        
    }
}