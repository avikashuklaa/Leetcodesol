class Solution {
    public int minimumCardPickup(int[] cards) {
        int n=cards.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int gett = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(!map.containsKey(cards[i])){
                map.put(cards[i], i);
            }
            else{
                gett = map.get(cards[i]);
                count = i - gett + 1;
                map.put(cards[i], i);
                min = Math.min(min, count);
            }
            
        }
        
        return count == 0 ? -1 : min;
        
    }
}