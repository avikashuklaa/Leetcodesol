class Solution {
    List<Integer>[] adj;
    boolean[] visited;
    boolean[] marked;
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        adj = new ArrayList[numCourses];
        
        for(int i=0; i<numCourses; i++){
            adj[i]=new ArrayList<>();
        }
        
        visited = new boolean[numCourses];
        marked = new boolean[numCourses];
        
        for(int i=0; i<prerequisites.length; i++){
            adj[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        
        for(int i=0; i<numCourses; i++){
            if(!visited[i]){
                if(isCyclic(i)){
                    return false;
                }
            }
        }
        return true;
        
    }
    
    public boolean isCyclic(int j){
        visited[j]=true;
        
        for(int ele : adj[j]){
            if(!visited[ele]){
                if(isCyclic(ele)){
                    return true;
                }
            }
            else if(!marked[ele]){
                return true;
            }
        }
        marked[j]=true;
        return false;
    }
}