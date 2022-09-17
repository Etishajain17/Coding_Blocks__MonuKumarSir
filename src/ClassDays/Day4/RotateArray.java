package ClassDays.Day4;

import java.util.Scanner;

public class RotateArray {
    public static void rotate(int[] nums, int k)
    {
        k=k%nums.length;
        k=nums.length-k-1;
        reverse(nums,0,k);
        reverse(nums,k+1,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] nums,int low,int high){
        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
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
        System.out.print("Enter the array to right by :");
        int k=sc.nextInt();
        rotate(arr,k);
        System.out.print("Rotated Array is: " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("********************************");
    }
}
