class Solution {
    public int[] singleNumber(int[] nums) {
        
        int n=nums.length;
        int[] ans=new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int j=0;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue()==0){
                ans[j++]=m.getKey();
            }
        }
        return ans;
    }
}