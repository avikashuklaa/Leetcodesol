class Solution {
    public boolean isAnagram(String s, String t) {
        
        int ls=s.length();
        int lt=t.length();
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        
        if(ls==lt){
            Arrays.sort(c1);
            Arrays.sort(c2);
            for(int i=0; i<ls; i++){
                if(c1[i]!=c2[i]){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        
        return true;
    }
}