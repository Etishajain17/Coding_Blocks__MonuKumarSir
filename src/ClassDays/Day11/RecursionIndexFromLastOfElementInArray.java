package ClassDays.Day11;

public class RecursionIndexFromLastOfElementInArray {
    public static int indexFromLast(int[] arr,int index,int x){
        if(index<0)
            return -1;
        if(arr[index]==x)
            return index;
        return indexFromLast(arr,index-1,x);          //tail recursion
    }

    public static void main(String[] args) {
        int[] arr={2,3,5,4,1,3,7,3,6};
        int x=3;
        System.out.println(indexFromLast(arr,arr.length-1,x));
    }
}
