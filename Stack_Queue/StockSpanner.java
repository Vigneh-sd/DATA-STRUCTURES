import java.util.*;
class StockSpanner {
   Stack<int []> st = new Stack<>();
    public StockSpanner() {
        
    }
    public int next(int price) {
        int stock=1;
        while(!st.isEmpty() && st.peek()[0] <= price)
        {
            stock+=st.pop()[1];
        }
        st.push(new int[]{price, stock});
        return stock;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */