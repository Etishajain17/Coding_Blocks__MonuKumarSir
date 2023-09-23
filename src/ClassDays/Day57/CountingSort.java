package ClassDays.Day57;

// JEE Main marks ranking system use counting sort;
// O(n) --> Counting Sort
// Dutch national flag
// maximum 360 and rank 16 lakh
// repetition jyada and limit we know
// not comparison based , it it key -value pair sorting
// array ki biggest value is key and make array of that size+1;
// stable sort and insertion order preserved
// step one -freq array
// step two -cumilative sum
// new array of size
// loop from back in original array and start putting value using cumm sum array and reduce count of value by 1.
//Space complexity - O(n) and Time complexity - O(n)

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr={2,1,1,0,1,2,5,4,0,2,8,7,9,2,6,1,9};
        arr=Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] Sort(int[] arr){
        int max= Arrays.stream(arr).max().getAsInt();
        int[] frq=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            frq[arr[i]]++;
        }
        for (int i = 1; i < frq.length; i++) {
            frq[i]=frq[i-1]+frq[i];
        }
        int[] ans=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            int pos=frq[arr[i]];
            ans[pos-1]=arr[i];
            frq[arr[i]]--;
        }
        return ans;
    }
}
