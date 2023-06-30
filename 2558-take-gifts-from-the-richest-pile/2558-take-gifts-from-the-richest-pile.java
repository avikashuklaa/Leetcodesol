class Solution {
    
   
    public long pickGifts(int[] gifts, int k) {
        
        int l=gifts.length;
       
      //  int j=l-1;
       // int count=k%l;
        
        while(k>0){
            Arrays.sort(gifts);
            int j=l-1;
            gifts[j]=(int)(Math.sqrt(gifts[j]));
            //Arrays.sort(gifts);
           // j--;
            k--;
        }
        
        long sum=0;
        for(int i=0; i<l; i++){
            sum += gifts[i];
        }
        
        return sum;
    }
}