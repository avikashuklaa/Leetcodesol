class Solution {
    long count=0;
    
    public void check(List<Integer> ans, int start, int mid, int end, int diff){
        
        int l=start;
        int r=mid+1;
        
        while(l<=mid && r<=end){
            if(ans.get(l) <= (ans.get(r) + diff)){
                count += (end-r+1);
                l++;
            }
            else{
                r++;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=start; i<=end; i++){
            list.add(ans.get(i));
        }
        
        Collections.sort(list);
        
        for(int i=start; i<=end; i++){
            ans.set(i, list.get(i-start));
        }
        
        return;
    }
    
    public void mergesort(List<Integer> ans, int start, int end, int diff){
        
        if(start==end){
            return;
        }
        
        int mid=(start+end)/2;
        
        mergesort(ans, start, mid, diff);
        mergesort(ans, mid+1, end, diff);
        
        check(ans, start, mid, end, diff);
        
        return;
    }
    
    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        
        count=0;
        
        List<Integer> ans = new ArrayList<>();
        int n=nums1.length;
        
        for(int i=0; i<n; i++){
            ans.add(nums1[i]-nums2[i]);
        }
        
        mergesort(ans, 0, n-1, diff);
        
        return count;
    }
}