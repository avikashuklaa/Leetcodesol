class Solution {
    public int countNicePairs(int[] nums) {
        
        int count = 0;
        int mod = (int)1e9+ 7;
        Map<Long, Integer> map = new HashMap();
        
        for(int i=0; i<nums.length; i++){
            long curr = nums[i];
            long currRev = rev(curr);
            long diff = curr - currRev;
            
            if(map.containsKey(diff)){
                count = (count + map.get(diff)) % mod;
            }
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }
        
        return count;
    }
    
    public long rev(long num){
        long res = 0;
        
        while(num != 0){
            res = res*10 + num%10;
            num /= 10;
        }
        
        return res;
    }
}