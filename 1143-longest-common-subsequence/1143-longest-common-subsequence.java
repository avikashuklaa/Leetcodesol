class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n1 = text1.length();
        int n2 = text2.length();
        
        int[][] dp = new int[n1+1][n2+1];
        
        for(int i=dp.length - 1; i>=0; i--){
            for(int j=dp[0].length - 1; j>=0; j--){
                
                if(i==dp.length - 1 || j==dp[0].length-1){
                    dp[i][j] = 0;
                }
                else{
                    if(text1.charAt(i) == text2.charAt(j)){
                        dp[i][j] = dp[i+1][j+1] + 1;
                    }
                    else{
                        dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                    }
                }
            }
        }
        
        return dp[0][0];
    }
}