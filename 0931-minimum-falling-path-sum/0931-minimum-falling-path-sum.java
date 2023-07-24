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
    
    public static int find(int[][] mat, Integer[][] dp, int r, int c){
        
        if( r<0 || r>n-1 || c<0 || c>n-1){
            return Integer.MAX_VALUE;
        }
        
        if(r == n-1){
            return mat[r][c];
        }
        
        if(dp[r][c] != null){
            return dp[r][c];
        }
        
        int b=find(mat, dp, r+1, c);
        int bl = find(mat, dp, r+1, c-1);
        int br = find(mat, dp, r+1, c+1);
        
        int ans = Math.min(b, Math.min(bl, br));
        
        dp[r][c] = ans + mat[r][c];
        
        return dp[r][c];
    }
    
    
    
    
}