class Solution {
    static int n;
    public int minFallingPathSum(int[][] matrix) {
        
        n = matrix.length;
        
        
        Integer[][] dp = new Integer[n][n];
        
        int ans = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            ans = Math.min(ans, find(dp, 0, i, matrix));
        }
        
        return ans;
    }
    
    public static int find(Integer[][] dp, int r, int c, int[][] matrix){
        
        if(r<0 || r>=n || c<0 || c>=n){
            return Integer.MAX_VALUE;
            
        }
        
        if(r == n-1){
            return matrix[r][c];
        }
        
        if(dp[r][c] != null){
            return dp[r][c];
        }
        
        int bottom = find(dp, r+1, c, matrix);
        int bleft = find(dp, r+1, c-1, matrix);
        int bright = find(dp, r+1, c+1, matrix);
        
        int min = Math.min(bottom, Math.min(bleft, bright));
        
        dp[r][c] = matrix[r][c] + min;
        
        return dp[r][c];
    }
}