class Solution {
    
//     public void add(String[] ch, int n, String s, List<String> list){
//         if(s.length()==n){
//             list.add(s);
//             return;
//         }
        
//         for(int i=0; i<ch.length; i++){
//             for(int j=i; j<ch.length; j++){
//                 s=ch[i]+ch[j];
//             }
//         }
        
       
//     }
    public int countVowelStrings(int n) {
        
//         String[] ch={"a", "e", "i", "o", "u"};
        
//         int count=0;
//         List<String> list=new ArrayList<>();
//         String s="";
//         if(n==1){
//             return 5;
//         }
//         else{
//             for(int i=0; i<ch.length; i++){
//                int j=i;
//                  while(s.length()!=n && j<ch.length){
//                      s = ch[i]+ch[j++];
                     
//                  }
//                      list.add(s);
//                      s="";
//                }
//             }    
        
        
//         return list.size();
        
         int a=1,b=1,c=1,d=1,e=1;
        for(int i=1;i<n;i++){
            a=a+b+c+d+e;
            b=b+c+d+e;
            c=c+d+e;
            d=d+e;
        }
        return a+b+c+d+e;
    }
}