package Day6;

public class BinarySearch {
    public static int Binary_Sort(int[] arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,9,11,34,42,45};
        System.out.println(Binary_Sort(arr,34));
    }
}
