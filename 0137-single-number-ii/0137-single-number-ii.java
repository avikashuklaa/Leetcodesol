class Solution {
    public int singleNumber(int[] nums) {
        
        int n=nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count=0;
        
        for(int i=0; i<n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
                
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
                
            }
        }
       for (Map.Entry<Integer, Integer> pair : map.entrySet()){
           if(pair.getValue()==0){
               count=pair.getKey();
           }
       }
        
        return count;
    }
}