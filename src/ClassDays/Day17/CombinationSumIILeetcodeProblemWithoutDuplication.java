package ClassDays.Day17;

import java.util.Arrays;

public class CombinationSumIILeetcodeProblemWithoutDuplication {
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(arr);
        CombinationWithoutDuplicate(arr,target,"",0);
    }
    public static void CombinationWithoutDuplicate(int[] arr,int target,String ans,int idx){
        if(target==0){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if(i!=idx && arr[i]==arr[i-1])
                continue;                                      //for not calling for second duplicate just call for first occurence of any value
            if(target>=arr[i]){
                CombinationWithoutDuplicate(arr,target-arr[i],ans+arr[i]+" ",i+1);
            }
        }
    }
}
