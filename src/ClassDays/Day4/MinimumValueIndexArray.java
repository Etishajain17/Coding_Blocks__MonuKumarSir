package ClassDays.Day4;

import java.util.Scanner;

public class MinimumValueIndexArray {
    public static int MinimumIndex(int[] arr){
        int mini=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[mini])
                mini=i;
        }
        return mini;
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
        System.out.println("Minimum Index is " + MinimumIndex(arr));
        System.out.println("********************************");
    }
}
