class Solution {
    public String longestPrefix(String s) {
        
        int n=s.length();
        int[] lps = new int[n];
        
        findlps(s, lps);
        
        return s.substring(0, lps[n-1]);
        
    }
    
    public void findlps(String s, int[] lps){
        
        int n = s.length();
        
        int i=0;
        int j=1;
        lps[0] = 0;
        
        while(j<n){
            if(s.charAt(j) == s.charAt(i)){
                i++;
                lps[j] = i;
                j++;
            }
            else {
                if(i == 0){
                    lps[j] = 0;
                    j++;
                }
                else{
                    i = lps[i-1];
                }
            }
        }
    }
}