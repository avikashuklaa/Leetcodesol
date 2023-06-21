class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        int r = matrix.length;
        int c= matrix[0].length;
        
        int r1=0;
        int c1=0;
        int r2=r-1;
        int c2 = c-1;
        
        while(ans.size()<r*c){
            for(int i=c1; i<=c2 && ans.size()<r*c; i++){
                ans.add(matrix[r1][i]);
            }
            for(int j=r1+1; j<=r2-1 && ans.size()<r*c; j++){
                ans.add(matrix[j][c2]);
            }
            for(int i=c2; i>=c1 && ans.size()<r*c; i--){
                ans.add(matrix[r2][i]);
            }
            for(int j=r2-1; j>=r1+1 && ans.size()<r*c; j--){
                ans.add(matrix[j][c1]);
            }
            ++r1;
            ++c1;
            --r2;
            --c2;
        }
        
        return ans;
        
    }
}