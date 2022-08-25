package Day4;

import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] arr){
        int low=0,high=arr.length-1;
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
        reverse(arr);
        System.out.print("Reversed Array is: " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("********************************");

    }
}
