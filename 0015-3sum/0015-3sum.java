class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n=nums.length;
        //List<List<Integer>> temp=new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        
        Arrays.sort(nums);
        
        for(int i=0; i<n-2; i++){
          //  List<Integer> ans=new ArrayList<>();
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}