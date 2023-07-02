class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int l=intervals.length;
        Stack<int[]> stack = new Stack<>();
        
        stack.push(intervals[0]);
        
        for(int i=1; i<l; i++){
            int s2 = intervals[i][0];
            int e2 = intervals[i][1];
            
            int[] poparr = stack.pop();
            
            int s1=poparr[0];
            int e1 = poparr[1];
            
            int maxend = Math.max(e2, e1);
            if(e1>=s2){
                int[] merge = new int[2];
                merge[0]=s1;
                merge[1]=maxend;
                stack.push(merge);
            }
            else{
                stack.push(poparr);
                stack.push(intervals[i]);
            }
        }
        int[][] ans = new int[stack.size()][2];
        for(int i=stack.size()-1; i>=0; i--){
            int[] getarray=stack.pop();
            ans[i][0]=getarray[0];
            ans[i][1]=getarray[1];
        }
        
        return ans;
    }
}