class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l=nums.length;
        
               
        int temp=0;
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        int s = set.size();
        
        
        int[] ans = new int[s];
        int i=0;
        for(int x : set){
            ans[i++] = x;
        }
        Arrays.sort(ans);
        for(int j=0; j<s; j++){
            nums[j]=ans[j];
        }
        
        return s;
        
        
    }
}