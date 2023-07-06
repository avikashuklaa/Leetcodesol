class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        find(1, 9, ans, curr, k, n);
        
        return ans;
    }
    
    public void find(int start, int end, List<List<Integer>> ans, ArrayList<Integer> curr, int k, int n){
        
        if(n==0 && curr.size()==k){
            ans.add(new ArrayList(curr));
        }
        
        for(int i=start; i<=end; i++){
            curr.add(i);
            find(i+1, end, ans, curr, k, n-i);
            curr.remove(curr.size()-1);
        }
    }
}