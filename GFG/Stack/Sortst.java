class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
       if(st.isEmpty())
       {
          return; 
       }
       
       int topElement = st.pop();
       sortStack(st);
       insertInSortedOrder(st, topElement);
    }
    
    
    
    
    
    private void insertInSortedOrder(Stack<Integer> st, int element) {
        if (st.isEmpty() || element > st.peek()) {
            st.push(element);
            return;
        }

        int topElement = st.pop();
        insertInSortedOrder(st, element);
        st.push(topElement);
    }
}
