class Solution {
    static int n;
    public int minFallingPathSum(int[][] matrix) {
        
        n = matrix.length;
        
        Integer[][] dp = new Integer[n][n];
        
        int ans = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            ans = Math.min(ans, find(matrix, dp, 0, i));
        }
        
        return ans;
    }
    
    public static int find(int[][] matrix, Integer[][] dp, int r, int c){
        
        if(r<0 || r>=n || c<0 || c>=n){
            return Integer.MAX_VALUE;
        }
        
        if(r==n-1){
            return matrix[r][c];
        }
        
        if(dp[r][c] != null){
            return dp[r][c];
        }
        
        int b = find(matrix, dp, r+1, c);
        int bl = find(matrix, dp, r+1, c-1);
        int br = find(matrix, dp, r+1, c+1);
        
        int min = Math.min(b, Math.min(bl, br));
        
        dp[r][c] = matrix[r][c] + min;
        
        return dp[r][c];
        
    }
    
    
}