class Solution {
    public int evalRPN(String[] tokens) {
        
        int n=tokens.length;
        Stack<Integer> st = new Stack<>();
        int count=0;
              
        
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b=st.pop();
                int a=st.pop();
                if(s.equals("+")){
                    count=a+b;                    
                }
                else if(s.equals("-")){
                    count=a-b;
                }
                else if(s.equals("*")){
                    count=a*b;
                }
                else{
                    count=a/b;
                }
                
                st.push(count);
            }
            else{
                int el=Integer.parseInt(s);
                st.push(el);
            }
        }
        
        return st.peek();
    }
}