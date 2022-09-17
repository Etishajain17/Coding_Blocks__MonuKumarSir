package ClassDays.Day5;
/*
First we check until we get a lesser number ( eg . p index ) from back and then as we find it we will
find the just greater  element of that index digit and as we find it we will swap it will q index digit and we will reverse
the array from p+1 to n.
In case of largest number like 321 we will just reverse it .
 */
public class NextPermutationLeetCode {
    public static void reverse(int[] arr,int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void Next_Permutation(int[] arr){
        int p=0;
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]<arr[i+1])
            {
                p=i;
                break;
            }
        }

        int q=0;
        for (int i = arr.length-1; i > p; i--) {
            if(arr[i]>arr[p]) {
                q = i;
                break;
            }
        }
        if(p==0 && q==0) {
            reverse(arr, 0, arr.length-1);
            return;
        }
        //Swap p and q index
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        reverse(arr,p+1,arr.length-1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        Next_Permutation(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
