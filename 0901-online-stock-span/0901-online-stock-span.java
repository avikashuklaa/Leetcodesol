class StockSpanner {

    Stack<int[]> st;
    List<Integer> list;

    public StockSpanner() {
        st=new Stack<>();
        list=new ArrayList<>();
        
    }
    
    public int next(int price) {
        int span=1;
        while(st.size()>0 && price>=st.peek()[0]){
            span += st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */