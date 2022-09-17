package ClassDays.Day4;

import java.util.Scanner;

public class LinearSearchArray {
    public static void LinearSearch(int arr[],int x){
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.println("Found at index "+i);
                break;
            }
        }
        if(i==arr.length)
            System.out.println("Not Found "+ -1);
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
        System.out.print("Enter the value to search:");
        int x=sc.nextInt();
        LinearSearch(arr,x);
        System.out.println("********************************");
    }
}