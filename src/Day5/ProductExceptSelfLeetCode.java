package Day5;

public class ProductExceptSelfLeetCode {
    public static void Product(int[] arr){
        int[] left=new int[arr.length];
        left[0]=1;
        for (int i = 1; i < arr.length; i++) {
            left[i]=left[i-1]*arr[i-1];
        }
        int[] right=new int[arr.length];
        right[arr.length-1]=1;
        for (int i = arr.length-2; i >=0 ; i--) {
            right[i]=right[i+1]*arr[i+1];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=left[i]*right[i];
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        Product(arr);
        for (int x:arr) {
            System.out.println(x);
        }
    }
}
