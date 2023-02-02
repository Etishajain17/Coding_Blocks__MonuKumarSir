package ClassDays.Day27;
/*
Rain Water Trapping --> Array, Divide and Conquer with nlogn , Stack with n
Same for Largest Rectangle In Histogram also
 */

import java.util.Stack;

/*
Brute force  --> n^2
    2*5 = 10
    3*4 = 12
    5*1 = 5
    4*3 = 12
    6*1 = 6
    1*7 = 7
    7*1 = 7

Array like Rain Water just take minimum

Stack
    we need previous smaller and next smaller
 */
public class LargestRectangleInHistogramLeetcodeProblem {
    public static void main(String[] args) {
        int[] arr={2,3,5,4,6,1,7};
    }
//    public static int Area(int[] arr){
//        Stack<Integer> st=new Stack<>();
//        int maxarea=0;
//        for(int i=0;i<arr.length;i++){
//            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
//                int h=arr[st.peek()];
//                int r=i;
//                if(st.isEmpty()){
//
//                }
//            }
//        }
//    }
}