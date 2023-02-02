package ClassDays.Day26;

import java.util.Stack;

/*
- jinka next greater bnana h vo stack mai honge
- LIFO
- stack mai index becoz index se element aajyega
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr={10,2,1,3,5,4,8,7};
        NGE(arr);
    }
    public static void NGE(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                ans[stack.pop()]=arr[i];
            }
            stack.push(i);
        }                                       //O(2*n) = O(n)  while loop -> constant and push -> constant but running n times so 2n=(1+1)*n
        while(!stack.isEmpty()){
            ans[stack.pop()]=-1;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
/*
similar questions
- sunny building
- daily temp
- stock span
 */