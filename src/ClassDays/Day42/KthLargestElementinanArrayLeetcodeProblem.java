package ClassDays.Day42;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementinanArrayLeetcodeProblem {
    public static void main(String[] args) {
        int[] arr={3,2,3,1,2,4,5,5,6};
        int k=3;
        System.out.println();
    }
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();  //min heap
//        Priority<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());  //max heap
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
