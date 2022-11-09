package ClassDays.Day19;
/*
9 7 2 3 5 1 4  item=4
2 3 1 4 5 9 7
*/

public class PartitionInArray {
    public static void main(String[] args) {
        int[] arr={5,7,2,3,8,9,1,4};
        int ans=partition(arr,0,arr.length-1);
        System.out.println(ans);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int[] arr,int si,int ei){
        int item=arr[ei];
        int pi=si;
        for(int i=si;i<ei;i++){
            if(arr[i]<item){
                int temp=arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp=arr[ei];
        arr[ei]=arr[pi];
        arr[pi]=temp;
        return pi;
    }
}
