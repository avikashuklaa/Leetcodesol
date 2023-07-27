class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        
        int n1 = s1.length();
        int n2 = s2.length();
        
        int[][] dp = new int[n1+1][n2+1];
        
        for(int i=dp.length - 1; i>=0; i--){
            for(int j=dp[0].length - 1; j>=0; j--){
                
                if(i == dp.length-1 && j == dp[0].length-1){
                    dp[i][j] = 0;
                }
                else if(i==dp.length - 1){
                    char ch = s2.charAt(j);
                    dp[i][j] = (int)ch + dp[i][j+1];
                }
                else if(j == dp[0].length - 1){
                    char ch = s1.charAt(i);
                    dp[i][j] = (int)ch + dp[i+1][j];
                }
                else{
                    if(s1.charAt(i) == s2.charAt(j)){
                        dp[i][j] = dp[i+1][j+1];
                    }
                    else{
                        char c1 = s1.charAt(i);
                        char c2 = s2.charAt(j);
                        dp[i][j] = Math.min((int)c1 + dp[i+1][j], (int)c2 + dp[i][j+1]);
                    }
                }
            }
        }
        
        return dp[0][0];
    }
}