class Solution {
    public String reverseWords(String s) {
        
        String str = "";
       //tack<Character> st = new Stack<>();
       
        s=s.trim();
         int l = s.length();
        for(int i=0; i<l; i++){
            if(s.charAt(i) ==' '){
                if(s.charAt(i-1) != ' '){
                    str += s.charAt(i);
                }
               
                
            }
            else{
                str += s.charAt(i);
            }
        }
        str = str.trim();
      //String strr = str.replace('0', ' ');
       //trr = strr.trim();
        
        // for(int i=0; i<str.length(); i++){
        //     st.push(str.charAt(i));
        // }
        
        String[] arr = new String[str.length()];
        arr = str.split("\\s");
        Stack<String> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            
            st.push(arr[i]);
            //.push(" ");
        }
        
        String ans = "";
        
        while(!st.empty()){
            ans += st.pop() + " ";
        }
        
        
//         String[] ans = new String[s.length()];
//         int j=0;
//         for(int i=s.length() - 1; i>=0; i--){
//             ans[j] = arr[i];
//             j++;
//         }
        
         // String anss = Arrays.toString(arr);
        
         return ans.trim();
        
    }
}