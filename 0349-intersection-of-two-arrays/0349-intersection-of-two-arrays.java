class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int l=nums1.length;
        int r=nums2.length;
        int j=0;
        int i=0;
        int k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(i<l && j<r){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]==nums2[j]){
                nums1[k]=nums2[j];
                k++;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
              
        Set<Integer> set = new HashSet<>();
        for(int p=0; p<k; p++){
            set.add(nums1[p]);
        } 
        int[] ans=new int[set.size()];
        int index=0;
        for(Integer ele : set){
            ans[index++]=ele;
        }
        
        return ans;
    }
}