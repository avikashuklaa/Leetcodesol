class Solution {
    public int numberOfBoomerangs(int[][] points) {
        
        int n = points.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n; j++){
                
                if(i != j){
                    int d = ((points[i][0] - points[j][0]) * (points[i][0] - points[j][0])) + ((points[i][1] - points[j][1]) * (points[i][1] - points[j][1]));
                    
                    if(!map.containsKey(d)){
                        map.put(d, 1);
                    }
                    else{
                        map.put(d, map.get(d) + 1);
                    }
                }
            }
            
            for(Integer num : map.values()){
                count += num * (num - 1);
            }
            map.clear();
        }
        
        return count;
    }
}