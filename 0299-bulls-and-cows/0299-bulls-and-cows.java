class Solution {
    public String getHint(String secret, String guess) {
        
        char[] c1=secret.toCharArray();
        char[] c2=guess.toCharArray();
        
        
        int n1=c1.length;
        int b=0;
        int c=0;
        
        for(int i=0; i<n1; i++){
            if(c1[i]==c2[i]){
                b++;
                c1[i]='*';
                c2[i]='#';
                
            }
        }
        
       
        for(int i=0; i<n1; i++){
            for(int j=0; j<n1; j++){
                if(i!=j){
                    if(c1[i]==c2[j]){
                        c++;
                        c1[i]='*';
                        c2[j]='#';
                        break;
                    }
                }
               
            }
        }
        
        
        return b + "A" + c + "B";
    }
}