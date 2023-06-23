class Solution {
    public int maxArea(int[] height) {
        
        int l=0;
        int r=height.length-1;
        int ans=0;
        
        while(l<r){
            int a=height[l];
            int b=height[r];
            int area=Math.min(a, b) *(r-l);
            ans=Math.max(area, ans);
            
            if(a<b){
                l++;
            }
            else{
                r--;
            }
        }
        
        return ans;
        
    }
}