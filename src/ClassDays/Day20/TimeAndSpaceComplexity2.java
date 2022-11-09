package ClassDays.Day20;

public class TimeAndSpaceComplexity2 {
    public static void main(String[] args) {
//        while(i<=n){
//            System.out.println("Hey");
//            i++;
//        }//O(n)
//
//
//        while(i<=n){
//            System.out.println("Hey");
//            i*=2;
//        }//O(log n base 2)
//
//
//        while(n>0){
//            System.out.println("Hey");
//            n/=2;
//        }//O(log n base 2)
//
//
//        while(i<=n){
//            System.out.println("Hey");
//            i+=2;
//            i+=3;
//        }//O(n)
//
//
//        while(i<=n){
//            System.out.println("Hey");
//            i*=2;
//            i*=3;
//        }//O(log n base 6)
//
//
//        while(n>0){
//            System.out.println("Hey");
//            n/=2;
//            n/=3;
//        }//O(log n base 6)
//
//
//        while(i<=n){
//            System.out.println("Hey");
//            i+=k;
//        }//O(n/k)
//
//
//        while(n>0){
//            System.out.println("Hey");
//            n/=k;
//        }//O(log n base k)
//
//
//        while(n>0){
//            System.out.println("Hey");
//            n--;
//        }//O(n)
//
//
//        while(n>0){
//            System.out.println("Hey");
//            n=n-2;
//            n=n-3;
//        }//O(n)
//
//
//        while(n>0){
//            System.out.println("Hey");
//            n=n-k;
//        }//O(n/k)
//
//        for (i = 1; i <= n; i++) {
//            for (int j = 0; j <=n ; j++) {
//                System.out.println("Hey");
//            }
//        }

    }
}
/*
Bubble,insertion,selection
worst case= n^2;

best case of insertion sort=n (when array sorted that time inner loop will not run)

Based on swapping selection sort is best becoz n-1 swaps
Optimization of bubble sort --> if inner loop is not acting any swap then we can break the outer loop.

Merge sort nlogn in all three best,worst,avg
Space complexity (if other than input any extra array or space) of merge sort is n other all constant

quick avg,best case--> nlogn , worst case--> n^2
worst case when pivot element is on extreme left or extreme right eg. array is sorted  1 2 3 4 5 then n^2
worst case can be brought to avg case by randomized quick sort.
 */