class Solution {
    public int strStr(String haystack, String needle) {
        //naive algo
        
        
        int n1 = haystack.length();
        int n2 = needle.length();
       
        
        for(int i=0; i<=n1-n2; i++){
            int j;
            for(j=0; j<n2; j++){
                
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if(j == n2){
                return i;
            }
        }
        
        return -1;
        
        
    }
}