package Day4;

import java.util.Scanner;

public class RangeReverseArray {
    public static void reverse(int[] arr,int i,int j){
        int low=i,high=j;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("********************************");
        System.out.print("Enter the value for array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter starting Range:");
        int i=sc.nextInt();
        System.out.print("Enter ending Range:");
        int j=sc.nextInt();
        reverse(arr,i,j);
        System.out.print("Reversed Array is: " );
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("********************************");

    }
}
