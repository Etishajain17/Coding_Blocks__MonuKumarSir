package Contests.Contest4_Recursion;

import java.util.*;

/*
Take as input N, a number. Take N more inputs and store that in an array.

a. Write a recursive function which counts the number of ways the array could be split in two groups,
so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups.
Print the value returned.

b. Write a recursive function which keeps track of ways an array could be split in two groups,
so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups.
Return type of function should be void. Print the two groups, each time you find a successful split.

Input Format
    Take as input N, a number. Take N more inputs and store that in an array.

Constraints
    None

Output Format
    Display all the groups in a comma separated manner and display the number of ways the array can be split

Sample Input
    6
    1
    2
    3
    3
    4
    5

Sample Output
    1 2 3 3 and 4 5
    1 3 5 and 2 3 4
    1 3 5 and 2 3 4
    2 3 4 and 1 3 5
    2 3 4 and 1 3 5
    4 5 and 1 2 3 3
    6
 */
public class SplitArrayRecursion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
            s+=ar[i];
        }
        if(s%2!=0){
            System.out.println(0);
            return;
        }
        List<Set<Integer>> list=new ArrayList<>();
        Set<Integer> hs=new HashSet<>();
        split(ar,0,s,0,hs,list);
        display(list,ar,n);
    }

    private static void split(int[] ar,int i,int sum,int curr,Set<Integer> set,List<Set<Integer>> list){
        if(curr==sum/2) {
            list.add(new HashSet<>(set));
            return;
        }
        if(i==ar.length)
            return;
        set.add(i);
        split(ar,i+1,sum,curr+ar[i],set,list);
        set.remove(i);
        split(ar,i+1,sum,curr,set,list);
    }
    public static void display(List<Set<Integer>> list,int[] ar,int n){
        for(Set<Integer> ans:list){
            for(int i:ans){
                System.out.print(ar[i]+" ");
            }
            System.out.print("and ");
            for(int i=0;i<n;i++){
                if(!ans.contains(i)){
                    System.out.print(ar[i]+" ");
                }
            }
            System.out.println();
        }
        System.out.println(list.size());
    }
}
