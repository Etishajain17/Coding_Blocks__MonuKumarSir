package ClassDays.Day19;
/*
Divide and Conquer Technique

Binary Search--> Divide and Conquer technique
Merge Sort--> Divide and Conquer technique(space complexity prblm)

- Divide into two small arrays
- Single element always sorted(single life always sorted)
- Merge two sorted arrays
            5 4 3 7 1
          /          \
      5 4 3         7 1
     /     \       /   \
  5 4       3     7     1
 /   \
5    4
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,5,8,-11};
        int[] ans=sort(arr,0,arr.length-1);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] sort(int[] arr,int si,int ei){
        if(si==ei){
            int[] bs=new int[1];
            bs[0]=arr[ei];
            return bs;
        }
        int mid=(si+ei)/2;
        int[] fs=sort(arr,si,mid);
        int[] ss=sort(arr,mid+1,ei);
        return mergeTwoArray(fs,ss);
    }
    public static int[] mergeTwoArray(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int[] ans=new int[arr1.length + arr2.length];
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
            }
            else{
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}



