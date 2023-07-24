class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[][] dp = new int[n][m];
        
        for(int i=0; i<n; i++){
            dp[i][0] = Character.getNumericValue(matrix[i][0]);
        }
        
        for(int j=0; j<m; j++){
            dp[0][j] = Character.getNumericValue(matrix[0][j]);
        }
        
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j] == '1'){
                    int min = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]));
                    dp[i][j] = min + 1;
                }
                else{
                    dp[i][j] = 0;
                }
                
            }
        }
        
        int max = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(dp[i][j] > max){
                    max = dp[i][j];
                }
            }
        }
        
        return max * max;
  }
}
        
//         int[][] dp = new int[matrix.length][matrix[0].length];
        
//         int ans = 0;
        
//         for(int i=dp.length - 1; i>=0; i--){
//             for(int j=dp[0].length - 1; j>=0; j--){
//                 if(i == dp.length - 1 && j == dp[0].length - 1){
//                     dp[i][j] = matrix[i][j] - '0';
//                 }
//                 else if(i == dp.length - 1){
//                     dp[i][j] = matrix[i][j] - '0';
//                 }
//                 else if(j == dp[0].length - 1){
//                     dp[i][j] = matrix[i][j] - '0';
//                 }
//                 else{
//                     if(matrix[i][j] == 0){
//                         dp[i][j] = 0;
//                     }
//                     else{
//                         int min = Math.min(dp[i+1][j], dp[i][j+1]);
//                         min= Math.min(min, dp[i+1][j+1]);
//                         dp[i][j] = min + 1;
                        
//                         if(dp[i][j] > ans){
//                             ans = dp[i][j];
//                         }
//                     }
//                 }
//             }
//         }
        
//         return (ans-1)*(ans-1);
//     }
// }