class Solution {
    long count=0;
    
    public void check(List<Integer> list, int start, int mid, int end, int diff){
        
        int l=start;
        int r=mid+1;
        
        while(l<=mid && r<=end){
            if(list.get(l) <= (list.get(r) + diff)){
                count += (end-r+1);
                l++;
            }
            else{
                r++;
            }
            
        }
        
        List<Integer> num = new ArrayList<>();
        for(int i=start; i<=end; i++){
            num.add(list.get(i));
        }
        
        Collections.sort(num);
        
        for(int i=start; i<=end; i++){
            list.set(i, num.get(i-start));
        }
        
        return;
    }
    
    public void mergesort(List<Integer> list, int start, int end, int diff){
        
        if(start==end){
            return;
        }
        int mid=(start+end)/2;
        
        mergesort(list, start, mid, diff);
        mergesort(list, mid+1, end, diff);
        
        check(list, start, mid, end, diff);
        
        return;
        
    }
    public long numberOfPairs(int[] nums1, int[] nums2, int diff) {
        count=0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums1.length; i++){
            list.add(nums1[i]-nums2[i]);
        }
        
        mergesort(list, 0, nums1.length-1, diff);
        
        return count;
    }
}