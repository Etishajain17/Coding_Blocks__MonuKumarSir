package ClassDays.Day26;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
//    private static void reverse(Stack<Integer> st){
//        for (int i = 0; i < st.size(); i++) {
//            int x=st.pop();
//            insert(st,x,i);
//        }
//    }
//    private static void insert(Stack<Integer> st,int item,int i){
//        if(st.size()==i){
//            st.push(item);
//            return;
//        }
//        int x=st.pop();
//        insert(st,item,i);
//        st.push(x);
//    }                                                      //O(n*n/2)
    private static void reverse(Stack<Integer> st){
        if(st.isEmpty()) {
            return;
        }
        int x=st.pop();
        reverse(st);
        insert(st,x);
    }
    private static void insert(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int x=st.pop();
        insert(st,item);
        st.push(x);
    }                                                          //O(n^2)
}
