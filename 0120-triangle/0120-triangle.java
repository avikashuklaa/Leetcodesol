class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
               
        int m = triangle.size();
        int n = triangle.get(triangle.size() - 1).size();
        
        int[][] dp= new int[m][n];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        
        return find(triangle, 0, 0, dp);
    }
    
    public static int find(List<List<Integer>> triangle, int i, int j, int[][] dp){
        
        if(i == triangle.size() - 1){
            return triangle.get(i).get(j);
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int left = find(triangle, i+1, j, dp) + triangle.get(i).get(j);
        int right = find(triangle, i+1, j+1, dp) + triangle.get(i).get(j);
        
        return dp[i][j] = Math.min(left, right);
        
       
    }
}