package ClassDays.Day26;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr={10,2,3,5,4,7,8};
        SS(arr);
    }
    public static void SS(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()) {
                ans[i] = i - stack.peek();
            }
            else {
                ans[i] = i + 1;
            }
            stack.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
