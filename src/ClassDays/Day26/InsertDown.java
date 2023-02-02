package ClassDays.Day26;

import java.util.Stack;

public class InsertDown {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        insert(stack,-3);
        System.out.println(stack);
    }
    private static void insert(Stack<Integer> st,int item){
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        int x=st.pop();
        insert(st,item);
        st.push(x);
    }
}
