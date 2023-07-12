class Solution {
    public int numberOfBoomerangs(int[][] points) {
        
        int count=0;
        int n=points.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i != j){
                  int dist = ((points[i][0] - points[j][0]) * (points[i][0] - points[j][0])) + ((points[i][1] - points[j][1]) * (points[i][1] - points[j][1]));
                
                  if(!map.containsKey(dist)){
                    map.put(dist, 1);
                  }
                  else{
                    map.put(dist, map.get(dist) + 1);
                  } 
                }
            }
            
            for(Integer num : map.values()){
                count += num * (num-1);
            }
            map.clear();
        }
        
        return count;
    }
}